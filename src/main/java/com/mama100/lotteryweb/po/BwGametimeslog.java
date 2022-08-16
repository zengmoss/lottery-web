package com.mama100.lotteryweb.po;

import java.util.Date;

public class BwGametimeslog {
    private Long id;

    private Long gameTimesId;

    private Integer oldTimes;

    private Integer newTimes;

    private String operator;

    private Date operateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGameTimesId() {
        return gameTimesId;
    }

    public void setGameTimesId(Long gameTimesId) {
        this.gameTimesId = gameTimesId;
    }

    public Integer getOldTimes() {
        return oldTimes;
    }

    public void setOldTimes(Integer oldTimes) {
        this.oldTimes = oldTimes;
    }

    public Integer getNewTimes() {
        return newTimes;
    }

    public void setNewTimes(Integer newTimes) {
        this.newTimes = newTimes;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}