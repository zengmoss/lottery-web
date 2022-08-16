package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwCustomerSignin;

public interface BwCustomerSigninMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwCustomerSignin record);

    int insertSelective(BwCustomerSignin record);

    BwCustomerSignin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwCustomerSignin record);

    int updateByPrimaryKey(BwCustomerSignin record);
}