package com.eShop.shiratama.Dao.users;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FootPrintDao {
    public Integer addFootPrint(@Param("userId") String userId);
}
