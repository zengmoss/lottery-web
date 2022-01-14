package com.mama100.lotteryweb.controller;

import com.mama100.lotteryweb.po.BwBaseinfoWithBLOBs;
import com.mama100.lotteryweb.service.BaseInfoService;
import com.mama100.lotteryweb.util.JacksonUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

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
    public BwBaseinfoWithBLOBs selectByPrimaryKey(@PathVariable("activityId") Long activityId){
        BwBaseinfoWithBLOBs os = baseInfoService.selectByPrimaryKey(activityId);
        redisTemplate.opsForValue().set(activityId,os,2, TimeUnit.MINUTES);
        System.out.println(JacksonUtil.to(redisTemplate.opsForValue().get(activityId)));
        return os;
    }
    @ApiOperation("修改活动")
    @PostMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestBody BwBaseinfoWithBLOBs record){
        return baseInfoService.updateByPrimaryKey(record);
    }@ApiOperation("保存活动")
    @PostMapping("/insert")
    public int insert(@RequestBody BwBaseinfoWithBLOBs record){
        return baseInfoService.insert(record);
    }
}
