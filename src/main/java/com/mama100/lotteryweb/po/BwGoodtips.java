package com.mama100.lotteryweb.po;

public class BwGoodtips {
    private Long tipId;

    private Long activityId;

    private String bigTips;

    private String smallTips;

    private String updatedBy;

    public Long getTipId() {
        return tipId;
    }

    public void setTipId(Long tipId) {
        this.tipId = tipId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getBigTips() {
        return bigTips;
    }

    public void setBigTips(String bigTips) {
        this.bigTips = bigTips == null ? null : bigTips.trim();
    }

    public String getSmallTips() {
        return smallTips;
    }

    public void setSmallTips(String smallTips) {
        this.smallTips = smallTips == null ? null : smallTips.trim();
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}