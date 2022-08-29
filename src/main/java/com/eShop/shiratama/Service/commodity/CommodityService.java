package com.eShop.shiratama.Service.commodity;

import com.eShop.shiratama.Dao.commodity.CommodityDao;
import com.eShop.shiratama.entity.CommodityBean;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService {

    @Autowired
    private CommodityDao commodityDao;

    public templateReturn getAllCommodityListService(String page){

        int totalNumberOfPages = commodityDao.getCommodityAllNumberOfPages()/10;
        int pointer = Integer.parseInt(page)*10-10;
        List<CommodityBean> commodityData =  commodityDao.getCommodityInformation(pointer,pointer+10);

        return templateReturn.success(commodityData,200,null);
    }

}
