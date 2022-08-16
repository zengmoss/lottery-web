package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGoodtips;

public interface BwGoodtipsMapper {
    int deleteByPrimaryKey(Long tipId);

    int insert(BwGoodtips record);

    int insertSelective(BwGoodtips record);

    BwGoodtips selectByPrimaryKey(Long tipId);

    int updateByPrimaryKeySelective(BwGoodtips record);

    int updateByPrimaryKey(BwGoodtips record);
}