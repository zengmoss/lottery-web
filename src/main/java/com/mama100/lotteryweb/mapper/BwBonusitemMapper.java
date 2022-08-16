package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwBonusitem;

public interface BwBonusitemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwBonusitem record);

    int insertSelective(BwBonusitem record);

    BwBonusitem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwBonusitem record);

    int updateByPrimaryKey(BwBonusitem record);
}