package com.eShop.shiratama.Dao.tokens;

import com.eShop.shiratama.entity.components.tokens;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TokenCheckDao {

    public Integer checkToken(@Param("token") String token);

    public Integer upTokenStatus(@Param("token") String token);

    public tokens getUsername(@Param("token") String token);
}
