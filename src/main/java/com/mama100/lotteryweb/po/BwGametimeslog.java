package com.mama100.lotteryweb.po;

import java.util.Date;

public class BwGametimeslog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_gameTimesLog.id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_gameTimesLog.game_times_id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private Long gameTimesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_gameTimesLog.old_times
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private Integer oldTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_gameTimesLog.new_times
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private Integer newTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_gameTimesLog.operator
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bw_gameTimesLog.operate_time
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    private Date operateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_gameTimesLog.id
     *
     * @return the value of bw_gameTimesLog.id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_gameTimesLog.id
     *
     * @param id the value for bw_gameTimesLog.id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_gameTimesLog.game_times_id
     *
     * @return the value of bw_gameTimesLog.game_times_id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public Long getGameTimesId() {
        return gameTimesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_gameTimesLog.game_times_id
     *
     * @param gameTimesId the value for bw_gameTimesLog.game_times_id
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setGameTimesId(Long gameTimesId) {
        this.gameTimesId = gameTimesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_gameTimesLog.old_times
     *
     * @return the value of bw_gameTimesLog.old_times
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public Integer getOldTimes() {
        return oldTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_gameTimesLog.old_times
     *
     * @param oldTimes the value for bw_gameTimesLog.old_times
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setOldTimes(Integer oldTimes) {
        this.oldTimes = oldTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_gameTimesLog.new_times
     *
     * @return the value of bw_gameTimesLog.new_times
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public Integer getNewTimes() {
        return newTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_gameTimesLog.new_times
     *
     * @param newTimes the value for bw_gameTimesLog.new_times
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setNewTimes(Integer newTimes) {
        this.newTimes = newTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_gameTimesLog.operator
     *
     * @return the value of bw_gameTimesLog.operator
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_gameTimesLog.operator
     *
     * @param operator the value for bw_gameTimesLog.operator
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bw_gameTimesLog.operate_time
     *
     * @return the value of bw_gameTimesLog.operate_time
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bw_gameTimesLog.operate_time
     *
     * @param operateTime the value for bw_gameTimesLog.operate_time
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}