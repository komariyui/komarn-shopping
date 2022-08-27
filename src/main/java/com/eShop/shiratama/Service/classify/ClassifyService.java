package com.eShop.shiratama.Service.classify;

import com.eShop.shiratama.Dao.classify.ClassifyDao;
import com.eShop.shiratama.entity.ClassifyBean;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ClassifyService {

    @Autowired
    ClassifyDao classifyDao;

    //get classify for level one
    public templateReturn getClassifyService(){
        HashMap<Integer,Object> returnMap = new HashMap<>();
        List<ClassifyBean> returnData = classifyDao.getClassifyLevelOneGroup();

        int index = 0;
        for (var item : returnData){
            HashMap<String,Object> forMap = new HashMap<>();
            forMap.put("name",item.getLevel_one_name());
            forMap.put("code",item.getLevel_one_code());
            returnMap.put(index++,forMap);
        }

        return templateReturn.success(returnMap,200,null);
    }
}
