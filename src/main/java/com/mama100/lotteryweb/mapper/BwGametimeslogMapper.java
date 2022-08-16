package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGametimeslog;

public interface BwGametimeslogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwGametimeslog record);

    int insertSelective(BwGametimeslog record);

    BwGametimeslog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwGametimeslog record);

    int updateByPrimaryKey(BwGametimeslog record);
}