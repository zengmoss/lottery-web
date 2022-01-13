package com.mama100.lotteryweb.service;

import com.mama100.lotteryweb.mapper.BwBaseinfoMapper;
import com.mama100.lotteryweb.po.BwBaseinfoWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * *
 * *@author   Moss
 * *2022/1/11
 **/
@Service
public class BaseInfoService {
    @Autowired
    private BwBaseinfoMapper baseinfoMapper;

    @Cacheable("BaseInfoService")
    public BwBaseinfoWithBLOBs selectByPrimaryKey(Long activityId){
        return baseinfoMapper.selectByPrimaryKey(activityId);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKey(BwBaseinfoWithBLOBs record){
        return baseinfoMapper.updateByPrimaryKey(record);
    }
    @Transactional(rollbackFor = Exception.class)
    public int insert(BwBaseinfoWithBLOBs record){
        return baseinfoMapper.insert(record);
    }
}
