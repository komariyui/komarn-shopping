package com.eShop.shiratama.Service.users;

import com.eShop.shiratama.Dao.users.FootPrintDao;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootPrintService {

    @Autowired
    FootPrintDao footPrintDao;


    public templateReturn addFootPrintService(String userId,String commodityId){
        if(footPrintDao.addFootPrint(userId,commodityId) >= 1)
            return templateReturn.success("添加足迹成功",200,null);
        else
            return templateReturn.error(401,"添加足迹失败");
    }
}
