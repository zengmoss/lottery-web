package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwUseraction;

public interface BwUseractionMapper {
    int deleteByPrimaryKey(Long actionId);

    int insert(BwUseraction record);

    int insertSelective(BwUseraction record);

    BwUseraction selectByPrimaryKey(Long actionId);

    int updateByPrimaryKeySelective(BwUseraction record);

    int updateByPrimaryKey(BwUseraction record);
}