package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwBonus;

public interface BwBonusMapper {
    int deleteByPrimaryKey(Long bonusId);

    int insert(BwBonus record);

    int insertSelective(BwBonus record);

    BwBonus selectByPrimaryKey(Long bonusId);

    int updateByPrimaryKeySelective(BwBonus record);

    int updateByPrimaryKey(BwBonus record);
}