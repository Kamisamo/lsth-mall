package com.lsth.mall.dao;

import com.lsth.mall.entity.TbHotWords;

public interface TbHotWordsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbHotWords record);

    int insertSelective(TbHotWords record);

    TbHotWords selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbHotWords record);

    int updateByPrimaryKey(TbHotWords record);
}