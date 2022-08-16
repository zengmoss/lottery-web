package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGrouponBaseinfo;

public interface BwGrouponBaseinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwGrouponBaseinfo record);

    int insertSelective(BwGrouponBaseinfo record);

    BwGrouponBaseinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwGrouponBaseinfo record);

    int updateByPrimaryKey(BwGrouponBaseinfo record);
}