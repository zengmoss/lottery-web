package com.mama100.lotteryweb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;

/**
 * *
 * *@author   Moss
 * *2022/8/19
 **/
@RestController
@RequestMapping("/baseInfo")
@Api("测试接口")
public class TestController {
    @Autowired
    private org.springframework.integration.redis.util.RedisLockRegistry redisLockRegistry;

    private int num = 50;
    @ApiOperation("测试分布式锁")
    @GetMapping("/lock")
    public String lock(){
        Lock l = redisLockRegistry.obtain("lock");
        l.lock();
        try{
            String r;
            String s = Thread.currentThread().getName();
            if(num > 0){
                r = s + " 取号成功 号码为 " + num--;
            }else {
                r = " 取号失败 因为号码已派完";
            }
            return r;
        }finally {
            l.unlock();
        }

    }
}
