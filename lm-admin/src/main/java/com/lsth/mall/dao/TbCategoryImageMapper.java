package com.lsth.mall.dao;

import com.lsth.mall.entity.TbCategoryImage;

public interface TbCategoryImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbCategoryImage record);

    int insertSelective(TbCategoryImage record);

    TbCategoryImage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbCategoryImage record);

    int updateByPrimaryKey(TbCategoryImage record);
}