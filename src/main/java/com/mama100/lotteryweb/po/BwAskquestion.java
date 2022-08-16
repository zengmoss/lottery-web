package com.mama100.lotteryweb.po;

import java.util.Date;

public class BwAskquestion {
    private Long id;

    private String question;

    private String rightAsk;

    private String ask1;

    private String ask2;

    private String ask3;

    private String category;

    private Date createdTime;

    private String createdBy;

    private String system;

    private String updatedBy;

    private Integer priority;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getRightAsk() {
        return rightAsk;
    }

    public void setRightAsk(String rightAsk) {
        this.rightAsk = rightAsk == null ? null : rightAsk.trim();
    }

    public String getAsk1() {
        return ask1;
    }

    public void setAsk1(String ask1) {
        this.ask1 = ask1 == null ? null : ask1.trim();
    }

    public String getAsk2() {
        return ask2;
    }

    public void setAsk2(String ask2) {
        this.ask2 = ask2 == null ? null : ask2.trim();
    }

    public String getAsk3() {
        return ask3;
    }

    public void setAsk3(String ask3) {
        this.ask3 = ask3 == null ? null : ask3.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}