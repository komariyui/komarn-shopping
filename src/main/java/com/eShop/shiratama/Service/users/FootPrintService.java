package com.eShop.shiratama.Service.users;

import com.eShop.shiratama.Dao.users.FootPrintDao;
import com.eShop.shiratama.Service.commodity.CommodityService;
import com.eShop.shiratama.components.TokenCheck;
import com.eShop.shiratama.entity.FootprintBean;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class FootPrintService {

    @Autowired
    FootPrintDao footPrintDao;

    @Autowired
    TokenCheck tokenCheck;

    @Autowired
    CommodityService commodityService;


    public templateReturn addFootPrintService(String userId,String commodityId){
        if (footPrintDao.existenceFootprint(userId,commodityId) >= 1){
            if (footPrintDao.updateFootPrint(userId,commodityId) >= 1)
                return templateReturn.success("添加足迹成功", 200, null);
            else
                return templateReturn.error(401, "添加足迹失败");
        }
        else{
            if (footPrintDao.addFootPrint(userId, commodityId) >= 1)
                return templateReturn.success("添加足迹成功", 200, null);
            else
                return templateReturn.error(401, "添加足迹失败");
        }

    }

    public templateReturn getFootPrintService(String token,String page){
        String username = tokenCheck.getUsername(token);
        Integer[] pointer = getPointer(page);
        Integer total = getNumberOfPages(footPrintDao.countFootPrint(username));

        List<FootprintBean>  footList = footPrintDao.getFootPrintList(username,pointer[0],pointer[1]);

        HashMap<String,Object> footPrintData = new HashMap<>();
        ArrayList<Object> arrays = new ArrayList<>();
        for(var item: footList){
            HashMap<String,Object> commodity = new HashMap<>();
           commodity.put("commodity", commodityService.useCommodityIdGetCommodity(item.getCommodity_id()));
           commodity.put("footprint",item);
           arrays.add(commodity);
        }
        footPrintData.put("footPrintData",arrays);
        footPrintData.put("nowPage",page);
        footPrintData.put("total",total);

        return templateReturn.success(footPrintData,200,"获取足迹成功");
    }

    public templateReturn deleteFootPrint(String token,String footPrintList){
        String username = tokenCheck.getUsername(token);
        String fpl = footPrintList.replaceAll("\\\"","");
        fpl = fpl.replace("[", "").replace("]","");

        String[] footPrintListArray = fpl.split(",");
        for(var item:footPrintListArray){
            footPrintDao.deleteFootPrint(username,item);
        }

        return templateReturn.success("成功删除",200,null);
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
