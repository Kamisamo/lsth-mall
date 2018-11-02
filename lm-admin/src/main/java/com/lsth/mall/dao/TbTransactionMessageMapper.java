package com.lsth.mall.dao;

import com.lsth.mall.entity.TbTransactionMessage;

public interface TbTransactionMessageMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbTransactionMessage record);

    int insertSelective(TbTransactionMessage record);

    TbTransactionMessage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TbTransactionMessage record);

    int updateByPrimaryKeyWithBLOBs(TbTransactionMessage record);

    int updateByPrimaryKey(TbTransactionMessage record);
}