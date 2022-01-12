package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGametimeslog;
import com.mama100.lotteryweb.po.BwGametimeslogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BwGametimeslogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    long countByExample(BwGametimeslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByExample(BwGametimeslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insert(BwGametimeslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insertSelective(BwGametimeslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    List<BwGametimeslog> selectByExample(BwGametimeslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    BwGametimeslog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExampleSelective(@Param("record") BwGametimeslog record, @Param("example") BwGametimeslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExample(@Param("record") BwGametimeslog record, @Param("example") BwGametimeslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKeySelective(BwGametimeslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_gameTimesLog
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKey(BwGametimeslog record);
}