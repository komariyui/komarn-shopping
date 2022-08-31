package com.eShop.shiratama.Dao.users;

import com.eShop.shiratama.entity.FootprintBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FootPrintDao {
    public Integer addFootPrint(@Param("username") String username,@Param("commodityId") String commodityId);
    public Integer existenceFootprint(@Param("username") String username,@Param("commodityId") String commodityId);
    public Integer updateFootPrint(@Param("username") String username,@Param("commodityId") String commodityId);

    public Integer countFootPrint(@Param("username") String username);
    public List<FootprintBean> getFootPrintList(
            @Param("username") String username,
            @Param("start") Integer start,
            @Param("end") Integer end);
}
