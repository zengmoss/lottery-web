package com.mama100.lotteryweb.po;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("bw_baseInfo")
public class BwBaseinfo {
    private Long activityId;

    private String activityName;

    private Date startTime;

    private Date endTime;

    private String description;

    private String publishedBy;

    private Integer usedScore;

    private Integer freeTimes;

    private Boolean online;

    private String activityUrl;

    private String createdBy;

    private Date createdTime;

    private String system;

    private String status;

    private String updatedBy;

    private Byte actFreeTimes;

    private Integer playRules;

    private String ruleId;

    private String backgroundImg;

    private String backgroundImgwebp;

    private String skipUrl;

    private Integer brandSkin;

    private String externalUrl;

    private Integer receiveType;

    private Integer triggerType;

    private String triggerCoupon;

    private String areaCode;

    private String officeCode;

    private String guideAwardRuleId;

    private Integer winType;

    private Integer winNum;

    private Integer businessType;

    private Integer shownum;

    private String notifyUser;

    private String externalUrlType;

    private Integer emptyStockSwitch;

    private Integer showLevel;

    private Integer showGrowth;

    private Integer activityType;

    private Integer syncMemberMiniprogram;

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy == null ? null : publishedBy.trim();
    }

    public Integer getUsedScore() {
        return usedScore;
    }

    public void setUsedScore(Integer usedScore) {
        this.usedScore = usedScore;
    }

    public Integer getFreeTimes() {
        return freeTimes;
    }

    public void setFreeTimes(Integer freeTimes) {
        this.freeTimes = freeTimes;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl == null ? null : activityUrl.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Byte getActFreeTimes() {
        return actFreeTimes;
    }

    public void setActFreeTimes(Byte actFreeTimes) {
        this.actFreeTimes = actFreeTimes;
    }

    public Integer getPlayRules() {
        return playRules;
    }

    public void setPlayRules(Integer playRules) {
        this.playRules = playRules;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg == null ? null : backgroundImg.trim();
    }

    public String getBackgroundImgwebp() {
        return backgroundImgwebp;
    }

    public void setBackgroundImgwebp(String backgroundImgwebp) {
        this.backgroundImgwebp = backgroundImgwebp == null ? null : backgroundImgwebp.trim();
    }

    public String getSkipUrl() {
        return skipUrl;
    }

    public void setSkipUrl(String skipUrl) {
        this.skipUrl = skipUrl == null ? null : skipUrl.trim();
    }

    public Integer getBrandSkin() {
        return brandSkin;
    }

    public void setBrandSkin(Integer brandSkin) {
        this.brandSkin = brandSkin;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl == null ? null : externalUrl.trim();
    }

    public Integer getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(Integer receiveType) {
        this.receiveType = receiveType;
    }

    public Integer getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(Integer triggerType) {
        this.triggerType = triggerType;
    }

    public String getTriggerCoupon() {
        return triggerCoupon;
    }

    public void setTriggerCoupon(String triggerCoupon) {
        this.triggerCoupon = triggerCoupon == null ? null : triggerCoupon.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode == null ? null : officeCode.trim();
    }

    public String getGuideAwardRuleId() {
        return guideAwardRuleId;
    }

    public void setGuideAwardRuleId(String guideAwardRuleId) {
        this.guideAwardRuleId = guideAwardRuleId == null ? null : guideAwardRuleId.trim();
    }

    public Integer getWinType() {
        return winType;
    }

    public void setWinType(Integer winType) {
        this.winType = winType;
    }

    public Integer getWinNum() {
        return winNum;
    }

    public void setWinNum(Integer winNum) {
        this.winNum = winNum;
    }

    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    public Integer getShownum() {
        return shownum;
    }

    public void setShownum(Integer shownum) {
        this.shownum = shownum;
    }

    public String getNotifyUser() {
        return notifyUser;
    }

    public void setNotifyUser(String notifyUser) {
        this.notifyUser = notifyUser == null ? null : notifyUser.trim();
    }

    public String getExternalUrlType() {
        return externalUrlType;
    }

    public void setExternalUrlType(String externalUrlType) {
        this.externalUrlType = externalUrlType == null ? null : externalUrlType.trim();
    }

    public Integer getEmptyStockSwitch() {
        return emptyStockSwitch;
    }

    public void setEmptyStockSwitch(Integer emptyStockSwitch) {
        this.emptyStockSwitch = emptyStockSwitch;
    }

    public Integer getShowLevel() {
        return showLevel;
    }

    public void setShowLevel(Integer showLevel) {
        this.showLevel = showLevel;
    }

    public Integer getShowGrowth() {
        return showGrowth;
    }

    public void setShowGrowth(Integer showGrowth) {
        this.showGrowth = showGrowth;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getSyncMemberMiniprogram() {
        return syncMemberMiniprogram;
    }

    public void setSyncMemberMiniprogram(Integer syncMemberMiniprogram) {
        this.syncMemberMiniprogram = syncMemberMiniprogram;
    }
}