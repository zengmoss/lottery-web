package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwHealthmonitoring;

public interface BwHealthmonitoringMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwHealthmonitoring record);

    int insertSelective(BwHealthmonitoring record);

    BwHealthmonitoring selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwHealthmonitoring record);

    int updateByPrimaryKey(BwHealthmonitoring record);
}