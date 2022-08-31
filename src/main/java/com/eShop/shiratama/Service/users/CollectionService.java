package com.eShop.shiratama.Service.users;

import com.eShop.shiratama.Dao.users.CollectionDao;
import com.eShop.shiratama.components.TokenCheck;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {

    @Autowired
    CollectionDao collectionDao;

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

    private Boolean isCollection(String username,String commodityId){
        return collectionDao.searchCollection(username,commodityId) == 1 ? true:false;
    }
}
