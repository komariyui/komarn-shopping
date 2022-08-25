package com.eShop.shiratama.Dao.users;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface TokenIssueDao {
    public int issueTokenInsert(
            @Param("username") String username,
            @Param("token_code") String token_code,
            @Param("login_time") Date login_time,
            @Param("validity_period") Date validity_period,
            @Param("is_long_token") Boolean is_long_token
            );
}
