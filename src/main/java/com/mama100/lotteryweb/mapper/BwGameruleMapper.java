package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGamerule;

public interface BwGameruleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwGamerule record);

    int insertSelective(BwGamerule record);

    BwGamerule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwGamerule record);

    int updateByPrimaryKey(BwGamerule record);
}