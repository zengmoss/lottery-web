package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwBaseinfo;
import com.mama100.lotteryweb.po.BwBaseinfoExample;
import com.mama100.lotteryweb.po.BwBaseinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BwBaseinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    long countByExample(BwBaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByExample(BwBaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByPrimaryKey(Long activityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insert(BwBaseinfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insertSelective(BwBaseinfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    List<BwBaseinfoWithBLOBs> selectByExampleWithBLOBs(BwBaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    List<BwBaseinfo> selectByExample(BwBaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    BwBaseinfoWithBLOBs selectByPrimaryKey(Long activityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExampleSelective(@Param("record") BwBaseinfoWithBLOBs record, @Param("example") BwBaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") BwBaseinfoWithBLOBs record, @Param("example") BwBaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExample(@Param("record") BwBaseinfo record, @Param("example") BwBaseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKeySelective(BwBaseinfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(BwBaseinfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_baseInfo
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKey(BwBaseinfo record);
}