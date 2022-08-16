package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwUser;

public interface BwUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwUser record);

    int insertSelective(BwUser record);

    BwUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwUser record);

    int updateByPrimaryKey(BwUser record);
}