package com.lsth.mall.dao;

import com.lsth.mall.entity.TbCategory;

public interface TbCategoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbCategory record);

    int insertSelective(TbCategory record);

    TbCategory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TbCategory record);

    int updateByPrimaryKey(TbCategory record);
}