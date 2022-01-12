package com.mama100.lotteryweb.mapper;

import com.mama100.lotteryweb.po.BwBonus;
import com.mama100.lotteryweb.po.BwBonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BwBonusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    long countByExample(BwBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByExample(BwBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int deleteByPrimaryKey(Long bonusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insert(BwBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int insertSelective(BwBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    List<BwBonus> selectByExample(BwBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    BwBonus selectByPrimaryKey(Long bonusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExampleSelective(@Param("record") BwBonus record, @Param("example") BwBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByExample(@Param("record") BwBonus record, @Param("example") BwBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKeySelective(BwBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bw_bonus
     *
     * @mbg.generated Tue Jan 11 16:35:30 CST 2022
     */
    int updateByPrimaryKey(BwBonus record);
}