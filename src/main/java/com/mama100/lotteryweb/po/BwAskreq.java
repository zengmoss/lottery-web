package com.mama100.lotteryweb.po;

import java.util.Date;

public class BwAskreq {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.question
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String question;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.right_ask
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String rightAsk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.ask1
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String ask1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.ask2
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String ask2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.ask3
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String ask3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.created_time
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.created_by
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.system
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String system;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_askReq.updated_by
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String updatedBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.id
     *
     * @return the value of bw_askReq.id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.id
     *
     * @param id the value for bw_askReq.id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.question
     *
     * @return the value of bw_askReq.question
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getQuestion() {
        return question;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.question
     *
     * @param question the value for bw_askReq.question
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.right_ask
     *
     * @return the value of bw_askReq.right_ask
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getRightAsk() {
        return rightAsk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.right_ask
     *
     * @param rightAsk the value for bw_askReq.right_ask
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setRightAsk(String rightAsk) {
        this.rightAsk = rightAsk == null ? null : rightAsk.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.ask1
     *
     * @return the value of bw_askReq.ask1
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getAsk1() {
        return ask1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.ask1
     *
     * @param ask1 the value for bw_askReq.ask1
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setAsk1(String ask1) {
        this.ask1 = ask1 == null ? null : ask1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.ask2
     *
     * @return the value of bw_askReq.ask2
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getAsk2() {
        return ask2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.ask2
     *
     * @param ask2 the value for bw_askReq.ask2
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setAsk2(String ask2) {
        this.ask2 = ask2 == null ? null : ask2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.ask3
     *
     * @return the value of bw_askReq.ask3
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getAsk3() {
        return ask3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.ask3
     *
     * @param ask3 the value for bw_askReq.ask3
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setAsk3(String ask3) {
        this.ask3 = ask3 == null ? null : ask3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.created_time
     *
     * @return the value of bw_askReq.created_time
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.created_time
     *
     * @param createdTime the value for bw_askReq.created_time
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.created_by
     *
     * @return the value of bw_askReq.created_by
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.created_by
     *
     * @param createdBy the value for bw_askReq.created_by
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.system
     *
     * @return the value of bw_askReq.system
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getSystem() {
        return system;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.system
     *
     * @param system the value for bw_askReq.system
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_askReq.updated_by
     *
     * @return the value of bw_askReq.updated_by
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_askReq.updated_by
     *
     * @param updatedBy the value for bw_askReq.updated_by
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }
}