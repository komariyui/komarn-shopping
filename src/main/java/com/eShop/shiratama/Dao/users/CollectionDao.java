package com.eShop.shiratama.Dao.users;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CollectionDao {
    public Integer  searchCollection(@Param("username") String username,@Param("commodityId") String commodityId);

    public Integer addCollection(@Param("username") String username,@Param("commodityId") String commodityId);

    public Integer deleteCollection(@Param("username") String username,@Param("commodityId") String commodityId);
}
