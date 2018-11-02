package com.lsth.mall.dao;

import com.lsth.mall.entity.TbUserAddr;

public interface TbUserAddrMapper {
    int deleteByPrimaryKey(String addrId);

    int insert(TbUserAddr record);

    int insertSelective(TbUserAddr record);

    TbUserAddr selectByPrimaryKey(String addrId);

    int updateByPrimaryKeySelective(TbUserAddr record);

    int updateByPrimaryKey(TbUserAddr record);
}