package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwBaseinfo;
import com.mama100.lotteryweb.po.BwBaseinfoWithBLOBs;

public interface BwBaseinfoMapper {
    int deleteByPrimaryKey(Long activityId);

    int insert(BwBaseinfoWithBLOBs record);

    int insertSelective(BwBaseinfoWithBLOBs record);

    BwBaseinfoWithBLOBs selectByPrimaryKey(Long activityId);

    int updateByPrimaryKeySelective(BwBaseinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BwBaseinfoWithBLOBs record);

    int updateByPrimaryKey(BwBaseinfo record);
}