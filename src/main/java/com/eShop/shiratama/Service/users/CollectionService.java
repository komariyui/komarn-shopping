package com.eShop.shiratama.Service.users;

import com.eShop.shiratama.Dao.users.CollectionDao;
import com.eShop.shiratama.Service.commodity.CommodityService;
import com.eShop.shiratama.components.TokenCheck;
import com.eShop.shiratama.entity.CollectionBean;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class CollectionService {

    @Autowired
    CollectionDao collectionDao;

    @Autowired
    CommodityService commodityService;

    @Autowired
    TokenCheck tokenCheck;

    public templateReturn addCollectionService(String token,String commodityId){
        String username = tokenCheck.getUsername(token);
        if(isCollection(username,commodityId))
            return templateReturn.error(401,"已经添加过收藏");

        collectionDao.addCollection(username,commodityId);
        return templateReturn.success("添加成功",200,null);
    }

    public templateReturn deleteCollectionService(String token,String commodityIdArray){
        String username = tokenCheck.getUsername(token);

        String fpl = commodityIdArray.replaceAll("\\\"","");
        fpl = fpl.replace("[", "").replace("]","");
        String[] footPrintListArray = fpl.split(",");

        for(var item:footPrintListArray){
            collectionDao.deleteCollection(username,item);
        }
        return templateReturn.success("删除成功",200,null);

    }

    public templateReturn getCollectionService(String token,String page){
        HashMap<String,Object> returnMap = new HashMap<>();
        String username = tokenCheck.getUsername(token);
        int total = getNumberOfPages(collectionDao.countCollection(username));
        Integer[] pointer = getPointer(page);

        List<CollectionBean> data = collectionDao.getCollectionList(username,pointer[0],pointer[1]);
        ArrayList<Object>  arrays = new ArrayList<>();
        for(var item:data){
            HashMap<String,Object> forMap =  new HashMap<>();
            forMap.put("commodity",commodityService.useCommodityIdGetCommodity(item.getCommodity_id().toString()));
            forMap.put("collection",item);
            arrays.add(forMap);
        }

        returnMap.put("data",arrays);
        returnMap.put("totalPage",total);
        returnMap.put("nowPage",page);

        return templateReturn.success(returnMap,200,null);
    }

    private Boolean isCollection(String username,String commodityId){
        return collectionDao.searchCollection(username,commodityId) == 1 ? true:false;
    }

    private Integer[] getPointer(String nowPage){
        Integer[] parseInt = new Integer[2];

        Integer nowPageInt=  Integer.parseInt(nowPage);
        parseInt[0] = nowPageInt*10-10;   //start
        parseInt[1] = nowPageInt+10;    //end

        return parseInt;
    }

    private Integer getNumberOfPages(Integer total){
        return total % 10 == 0 ? total/10:total/10+1;
    }
}
