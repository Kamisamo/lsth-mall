package com.lsth.mall.dao;

import com.lsth.mall.entity.TbIndexSlideAd;

public interface TbIndexSlideAdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbIndexSlideAd record);

    int insertSelective(TbIndexSlideAd record);

    TbIndexSlideAd selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbIndexSlideAd record);

    int updateByPrimaryKey(TbIndexSlideAd record);
}