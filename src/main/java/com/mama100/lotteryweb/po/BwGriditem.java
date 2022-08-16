package com.mama100.lotteryweb.po;

public class BwGriditem {
    private Long itemId;

    private Long activityId;

    private Integer sequence;

    private String gridName;

    private String bonusType;

    private String bonus;

    private String bonusName;

    private String bonusPictureurl;

    private String webpUrl;

    private String bigTips;

    private String smallTips;

    private Float freeRate;

    private Float payRate;

    private Integer quantity;

    private Integer totalQuantity;

    private String updatedBy;

    private String linkedUrl;

    private Integer jumpType;

    private String metaNameWeixin;

    private String pathWeixin;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getGridName() {
        return gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName == null ? null : gridName.trim();
    }

    public String getBonusType() {
        return bonusType;
    }

    public void setBonusType(String bonusType) {
        this.bonusType = bonusType == null ? null : bonusType.trim();
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus == null ? null : bonus.trim();
    }

    public String getBonusName() {
        return bonusName;
    }

    public void setBonusName(String bonusName) {
        this.bonusName = bonusName == null ? null : bonusName.trim();
    }

    public String getBonusPictureurl() {
        return bonusPictureurl;
    }

    public void setBonusPictureurl(String bonusPictureurl) {
        this.bonusPictureurl = bonusPictureurl == null ? null : bonusPictureurl.trim();
    }

    public String getWebpUrl() {
        return webpUrl;
    }

    public void setWebpUrl(String webpUrl) {
        this.webpUrl = webpUrl == null ? null : webpUrl.trim();
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

    public Float getFreeRate() {
        return freeRate;
    }

    public void setFreeRate(Float freeRate) {
        this.freeRate = freeRate;
    }

    public Float getPayRate() {
        return payRate;
    }

    public void setPayRate(Float payRate) {
        this.payRate = payRate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public String getLinkedUrl() {
        return linkedUrl;
    }

    public void setLinkedUrl(String linkedUrl) {
        this.linkedUrl = linkedUrl == null ? null : linkedUrl.trim();
    }

    public Integer getJumpType() {
        return jumpType;
    }

    public void setJumpType(Integer jumpType) {
        this.jumpType = jumpType;
    }

    public String getMetaNameWeixin() {
        return metaNameWeixin;
    }

    public void setMetaNameWeixin(String metaNameWeixin) {
        this.metaNameWeixin = metaNameWeixin == null ? null : metaNameWeixin.trim();
    }

    public String getPathWeixin() {
        return pathWeixin;
    }

    public void setPathWeixin(String pathWeixin) {
        this.pathWeixin = pathWeixin == null ? null : pathWeixin.trim();
    }
}