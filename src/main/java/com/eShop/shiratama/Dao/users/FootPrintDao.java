package com.eShop.shiratama.Dao.users;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FootPrintDao {
    public Integer addFootPrint(@Param("username") String username,@Param("commodityId") String commodityId);

    public Integer existenceFootprint(@Param("username") String username,@Param("commodityId") String commodityId);

    public Integer updateFootPrint(@Param("username") String username,@Param("commodityId") String commodityId);
}
