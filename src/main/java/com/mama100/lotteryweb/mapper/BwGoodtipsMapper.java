package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwGoodtips;
import com.mama100.lotteryweb.po.BwGoodtipsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BwGoodtipsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    long countByExample(BwGoodtipsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByExample(BwGoodtipsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByPrimaryKey(Long tipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insert(BwGoodtips record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insertSelective(BwGoodtips record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    List<BwGoodtips> selectByExample(BwGoodtipsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    BwGoodtips selectByPrimaryKey(Long tipId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExampleSelective(@Param("record") BwGoodtips record, @Param("example") BwGoodtipsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExample(@Param("record") BwGoodtips record, @Param("example") BwGoodtipsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKeySelective(BwGoodtips record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_goodTips
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKey(BwGoodtips record);
}