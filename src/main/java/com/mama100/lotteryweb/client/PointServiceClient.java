package com.mama100.lotteryweb.client;

import global.hh.point.inout.DetailListGetRequest;
import global.hh.point.inout.PointDetail;
import global.hh.point.inout.common.BaseRequest;
import global.hh.point.inout.common.PageResult;
import global.hh.point.inout.common.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * *
 * *@author   Moss
 * *2022/1/12
 **/
@FeignClient(name="point-service",url="${feign.url.point.service}")
public interface PointServiceClient {
    @PostMapping("/account/points/query")
    Response<PageResult<PointDetail>> accountPointsQuery(@RequestBody BaseRequest<DetailListGetRequest> req);
}
