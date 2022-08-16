package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwUsererror;

public interface BwUsererrorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwUsererror record);

    int insertSelective(BwUsererror record);

    BwUsererror selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwUsererror record);

    int updateByPrimaryKey(BwUsererror record);
}