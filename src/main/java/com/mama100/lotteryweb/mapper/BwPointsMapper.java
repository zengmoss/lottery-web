package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwPoints;

public interface BwPointsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwPoints record);

    int insertSelective(BwPoints record);

    BwPoints selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwPoints record);

    int updateByPrimaryKey(BwPoints record);
}