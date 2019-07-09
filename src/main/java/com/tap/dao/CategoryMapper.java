package com.tap.dao;

import org.apache.ibatis.annotations.Param;

import com.tap.model.Category;



public interface CategoryMapper {
    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}