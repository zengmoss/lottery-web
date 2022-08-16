package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGametimes;

public interface BwGametimesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwGametimes record);

    int insertSelective(BwGametimes record);

    BwGametimes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwGametimes record);

    int updateByPrimaryKey(BwGametimes record);
}