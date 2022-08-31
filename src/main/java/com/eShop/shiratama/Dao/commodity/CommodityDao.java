package com.eShop.shiratama.Dao.commodity;

import com.eShop.shiratama.entity.CommodityBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommodityDao {
    public int getCommodityAllNumberOfPages();

    public List<CommodityBean> getCommodityInformation(@Param("start") Integer start, @Param("end") Integer end);

    public int getCommodityAllNumberOfPagesForClassify(@Param("classify") String classify);

    public CommodityBean getCommodityOne(@Param("commodityId") String commodityId);

    public List<CommodityBean> getCommodityInformationForClassify(
            @Param("start") Integer start,
            @Param("end") Integer end,
            @Param("classify") Integer classify);
}
