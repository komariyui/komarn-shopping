package com.eShop.shiratama.Dao.commodity;

import com.eShop.shiratama.entity.CommodityBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommodityDao {
    public Integer getCommodityAllNumberOfPages();

    public List<CommodityBean> getCommodityInformation(@Param("start") Integer start, @Param("end") Integer end);
}
