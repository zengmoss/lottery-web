package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwPoints;
import com.mama100.lotteryweb.po.BwPointsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BwPointsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    long countByExample(BwPointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByExample(BwPointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insert(BwPoints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insertSelective(BwPoints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    List<BwPoints> selectByExample(BwPointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    BwPoints selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExampleSelective(@Param("record") BwPoints record, @Param("example") BwPointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExample(@Param("record") BwPoints record, @Param("example") BwPointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKeySelective(BwPoints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_points
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKey(BwPoints record);
}