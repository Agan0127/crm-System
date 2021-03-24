package com.qy25.sm.mapper.base;

import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.BrandExample;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {
    long countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Serializable id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(Serializable id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
