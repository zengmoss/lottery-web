package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwAskreq;

public interface BwAskreqMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwAskreq record);

    int insertSelective(BwAskreq record);

    BwAskreq selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwAskreq record);

    int updateByPrimaryKey(BwAskreq record);
}