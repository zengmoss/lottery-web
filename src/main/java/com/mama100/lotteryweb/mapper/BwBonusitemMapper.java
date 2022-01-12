package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwBonusitem;
import com.mama100.lotteryweb.po.BwBonusitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BwBonusitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    long countByExample(BwBonusitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByExample(BwBonusitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insert(BwBonusitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insertSelective(BwBonusitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    List<BwBonusitem> selectByExample(BwBonusitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    BwBonusitem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExampleSelective(@Param("record") BwBonusitem record, @Param("example") BwBonusitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExample(@Param("record") BwBonusitem record, @Param("example") BwBonusitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKeySelective(BwBonusitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonusItem
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKey(BwBonusitem record);
}