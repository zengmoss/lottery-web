package com.mama100.lotteryweb.po;

import com.github.pagehelper.IPage;
import lombok.Data;

/**
 * *
 * *@author   Moss
 * *2022/8/17
 **/
@Data
public class PageReq implements IPage {
    //当前页
    private Integer pageNum = 1;

    //每页的数量
    private Integer pageSize = 20;

    @Override
    public String getOrderBy() {
        return null;
    }
}
