package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwSystem;

public interface BwSystemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwSystem record);

    int insertSelective(BwSystem record);

    BwSystem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwSystem record);

    int updateByPrimaryKey(BwSystem record);
}