package com.mama100.lotteryweb.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.mama100.lotteryweb.po.BwBaseinfo;
import com.mama100.lotteryweb.po.PageReq;
import com.mama100.lotteryweb.service.BaseInfoService;
import com.mama100.lotteryweb.util.JacksonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * *
 * *@author   Moss
 * *2022/1/11
 **/
@RestController
@Api("活动基本信息接口")
@RequestMapping("/baseInfo")
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;
    @Autowired
    private RedisTemplate redisTemplate;

    @ApiOperation("通过主键查询")
    @ApiImplicitParam(name = "activityId", value = "主键 活动id", required = true, paramType = "path")
    @GetMapping("/selectByPrimaryKey/{activityId}")
    public BwBaseinfo selectByPrimaryKey(@PathVariable("activityId") Long activityId){
        BwBaseinfo os = baseInfoService.selectByPrimaryKey(activityId);
        redisTemplate.opsForValue().set(activityId,os,2, TimeUnit.MINUTES);
        System.out.println(JacksonUtil.to(redisTemplate.opsForValue().get(activityId)));
        return os;
    }
    @ApiOperation("修改活动")
    @PostMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestBody BwBaseinfo record){
        return baseInfoService.updateByPrimaryKey(record);
    }@ApiOperation("保存活动")
    @PostMapping("/insert")
    public int insert(@RequestBody BwBaseinfo record){
        return baseInfoService.insert(record);
    }
    @ApiOperation("查找所有活动")
    @GetMapping("/selectAll")
    public List<BwBaseinfo> selectAll(){
        List<BwBaseinfo> list = baseInfoService.list();
        return list;
    }
    @ApiOperation("查找分页活动 pagehelper")
    @GetMapping("/selectPage")
    public PageInfo<BwBaseinfo> selectPage(PageReq req){
        return baseInfoService.pageList(req);
    }
    @ApiOperation("查找分页活动 PaginationInnerInterceptor")
    @GetMapping("/selectPage2")
    public Page<BwBaseinfo> selectPage2(PageReq req){
        return baseInfoService.pageList2(req);
    }
}
