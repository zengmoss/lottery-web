package com.mama100.lotteryweb.po;

public class BwBonusitem {
    private Long id;

    private Long bonusId;

    private String bonusName;

    private String bonus;

    private String bonusUrl;

    private String bonusWebpurl;

    private String updatedBy;

    private String linkedUrl;

    private String system;

    private String createdBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBonusId() {
        return bonusId;
    }

    public void setBonusId(Long bonusId) {
        this.bonusId = bonusId;
    }

    public String getBonusName() {
        return bonusName;
    }

    public void setBonusName(String bonusName) {
        this.bonusName = bonusName == null ? null : bonusName.trim();
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus == null ? null : bonus.trim();
    }

    public String getBonusUrl() {
        return bonusUrl;
    }

    public void setBonusUrl(String bonusUrl) {
        this.bonusUrl = bonusUrl == null ? null : bonusUrl.trim();
    }

    public String getBonusWebpurl() {
        return bonusWebpurl;
    }

    public void setBonusWebpurl(String bonusWebpurl) {
        this.bonusWebpurl = bonusWebpurl == null ? null : bonusWebpurl.trim();
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

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }
}