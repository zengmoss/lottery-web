package com.mama100.lotteryweb.controller;

import com.mama100.lotteryweb.service.PointService;
import global.hh.point.inout.PointDetail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * *
 * *@author   Moss
 * *2022/1/11
 **/
@RestController
@Api("积分接口")
@RequestMapping("/point")
public class PointController {

    @Autowired
    private PointService pointService;

    @ApiOperation("通过客户id查询")
    @ApiImplicitParam(name = "customerId", value = "客户id", required = true, paramType = "path")
    @GetMapping("/customerPointDetails/{customerId}")
    public List<PointDetail> customerPointDetails(@PathVariable("customerId") Long customerId){
        return pointService.customerPointDetails(customerId);
    }
}
