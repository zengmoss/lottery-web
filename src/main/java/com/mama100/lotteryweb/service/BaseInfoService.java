package com.mama100.lotteryweb.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mama100.lotteryweb.mapper.BwBaseinfoMapper;
import com.mama100.lotteryweb.po.BwBaseinfo;
import com.mama100.lotteryweb.po.PageReq;
import com.mama100.lotteryweb.util.CacheNameConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * *
 * *@author   Moss
 * *2022/1/11
 **/
@Service
public class BaseInfoService {
    @Autowired
    private BwBaseinfoMapper baseinfoMapper;

    @Cacheable(CacheNameConstant.TWO_MINUTE)
    public BwBaseinfo selectByPrimaryKey(Long activityId){
        return baseinfoMapper.selectById(activityId);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKey(BwBaseinfo record){
        return baseinfoMapper.updateById(record);
    }
    @Transactional(rollbackFor = Exception.class)
    public int insert(BwBaseinfo record){
        int r = baseinfoMapper.insert(record);
        return r;
    }

    public List<BwBaseinfo> list(){
        List<BwBaseinfo> infos =  baseinfoMapper.selectList(null);
        return infos;
    }
    public PageInfo<BwBaseinfo> pageList(PageReq req){
        //使用分页插件工具完成分页
        PageHelper.startPage(req.getPageNum(),req.getPageSize());
        List<BwBaseinfo> infos =  baseinfoMapper.selectList(null);
        return new PageInfo<>(infos);
    }
    public Page<BwBaseinfo> pageList2(PageReq req){
        Page<BwBaseinfo> p = new Page<>(req.getPageNum(),req.getPageSize());
        return baseinfoMapper.selectPage(p,null);
    }


}
