package com.lsth.mall.dao;

import com.lsth.mall.entity.TbOrder;

public interface TbOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    TbOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}