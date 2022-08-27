package com.eShop.shiratama.Dao.classify;

import com.eShop.shiratama.entity.ClassifyBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassifyDao {
        public List<ClassifyBean> getClassifyLevelOneGroup();

        public List<ClassifyBean> getClassifyLevelTwoGroup(@Param("twoCode") String twoCode);
}
