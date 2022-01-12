package com.mama100.lotteryweb.service;

import com.mama100.lotteryweb.client.PointServiceClient;
import com.mama100.lotteryweb.util.SeqNoHolder;
import global.hh.point.inout.DetailListGetRequest;
import global.hh.point.inout.PointDetail;
import global.hh.point.inout.common.BaseRequest;
import global.hh.point.inout.common.PageResult;
import global.hh.point.inout.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * *
 * *@author   Moss
 * *2022/1/12
 **/
@Service
public class PointService {
    @Autowired
    private PointServiceClient psClient;


    /**
     * 积分明细
     *
     * @param customerId
     * @return
     */
    public List<PointDetail> customerPointDetails(Long customerId) {
        BaseRequest<DetailListGetRequest> req = new BaseRequest<>();
        req.setSeqNo(SeqNoHolder.holdSeqNo());
        req.setFromSystem("lottery-web");
        DetailListGetRequest request = new DetailListGetRequest();
        req.setRequest(request);
        request.setUserType(1);
        request.setPageIndex(1);
        request.setPageSize(Integer.MAX_VALUE);
        request.setUserId(customerId);
        Response<PageResult<PointDetail>> res = psClient.accountPointsQuery(req);
        return Optional.ofNullable(res).map(Response::getResult).map(PageResult::getData).orElse(null);
    }
}
