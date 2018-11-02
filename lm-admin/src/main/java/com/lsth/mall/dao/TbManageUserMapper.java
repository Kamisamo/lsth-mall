package com.lsth.mall.dao;

import com.lsth.mall.entity.TbManageUser;

public interface TbManageUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbManageUser record);

    int insertSelective(TbManageUser record);

    TbManageUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbManageUser record);

    int updateByPrimaryKey(TbManageUser record);
}