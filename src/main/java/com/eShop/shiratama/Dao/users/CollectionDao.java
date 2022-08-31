package com.eShop.shiratama.Dao.users;

import com.eShop.shiratama.entity.CollectionBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CollectionDao {
    public Integer  searchCollection(@Param("username") String username,@Param("commodityId") String commodityId);

    public Integer addCollection(@Param("username") String username,@Param("commodityId") String commodityId);

    public Integer deleteCollection(@Param("username") String username,@Param("commodityId") String commodityId);

    public Integer countCollection(@Param("username") String username);

    public List<CollectionBean> getCollectionList(
            @Param("username") String username,
            @Param("start") Integer start,
            @Param("end") Integer end
            );
}
