package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwAd;

public interface BwAdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwAd record);

    int insertSelective(BwAd record);

    BwAd selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwAd record);

    int updateByPrimaryKey(BwAd record);
}