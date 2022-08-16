package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGroup;

public interface BwGroupMapper {
    int deleteByPrimaryKey(Long groupId);

    int insert(BwGroup record);

    int insertSelective(BwGroup record);

    BwGroup selectByPrimaryKey(Long groupId);

    int updateByPrimaryKeySelective(BwGroup record);

    int updateByPrimaryKey(BwGroup record);
}