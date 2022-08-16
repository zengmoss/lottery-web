package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwSignin;

public interface BwSigninMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwSignin record);

    int insertSelective(BwSignin record);

    BwSignin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwSignin record);

    int updateByPrimaryKey(BwSignin record);
}