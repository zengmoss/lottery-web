package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwAskquestion;

public interface BwAskquestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BwAskquestion record);

    int insertSelective(BwAskquestion record);

    BwAskquestion selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BwAskquestion record);

    int updateByPrimaryKey(BwAskquestion record);
}