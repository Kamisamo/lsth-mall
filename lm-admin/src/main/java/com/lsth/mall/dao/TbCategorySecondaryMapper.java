package com.lsth.mall.dao;

import com.lsth.mall.entity.TbCategorySecondary;

public interface TbCategorySecondaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbCategorySecondary record);

    int insertSelective(TbCategorySecondary record);

    TbCategorySecondary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbCategorySecondary record);

    int updateByPrimaryKey(TbCategorySecondary record);
}