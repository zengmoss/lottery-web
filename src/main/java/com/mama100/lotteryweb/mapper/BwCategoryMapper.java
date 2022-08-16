package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwCategory;

public interface BwCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwCategory record);

    int insertSelective(BwCategory record);

    BwCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwCategory record);

    int updateByPrimaryKey(BwCategory record);
}