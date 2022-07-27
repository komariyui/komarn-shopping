package com.eShop.shiratama.Dao;

import com.eShop.shiratama.Bean.UsersBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersDao {
//    添加一个用户
    public int insertUser(@Param("username") String username,@Param("password") String password);
//    查询一个用户
    public UsersBean selectUser(@Param("username") String username);
}
