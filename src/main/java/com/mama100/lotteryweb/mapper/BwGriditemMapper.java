package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGriditem;

public interface BwGriditemMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(BwGriditem record);

    int insertSelective(BwGriditem record);

    BwGriditem selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(BwGriditem record);

    int updateByPrimaryKey(BwGriditem record);
}