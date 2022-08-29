package com.eShop.shiratama.Service.commodity;

import com.eShop.shiratama.Dao.commodity.CommodityDao;
import com.eShop.shiratama.entity.CommodityBean;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CommodityService {

    @Autowired
    private CommodityDao commodityDao;

    public templateReturn getAllCommodityListService(String page){
        HashMap<String,Object> objectData = new HashMap<>();

        Integer totalNumberOfPages = getNumberOfPages(commodityDao.getCommodityAllNumberOfPages());
        Integer[] pointer = getPointer(page);

        List<CommodityBean> commodityData =  commodityDao.getCommodityInformation(pointer[0],pointer[1]);
        objectData.put("data",commodityData);
        objectData.put("nowPage",page);
        objectData.put("totalPage",totalNumberOfPages);

        return templateReturn.success(objectData,200,null);
    }

//    public templateReturn getAllCommodityListForClassifyService(String classifyCode,String page){
//
//    }

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
