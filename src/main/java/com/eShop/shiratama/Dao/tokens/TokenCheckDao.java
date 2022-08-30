package com.eShop.shiratama.Dao.tokens;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TokenCheckDao {

    public Integer checkToken(@Param("token") String token);

}
