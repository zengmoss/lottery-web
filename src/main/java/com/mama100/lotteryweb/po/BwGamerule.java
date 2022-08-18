package com.mama100.lotteryweb.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_gameRule")
@ApiModel(value = "BwGamerule对象", description = "")
public class BwGamerule implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("活动ID")
    private Long activityId;

    @ApiModelProperty("奖品类型")
    private String bonusType;

    @ApiModelProperty("奖品")
    private String bonus;

    @ApiModelProperty("中奖次数，没人每天的中奖次数")
    private Integer times;

    @ApiModelProperty("1：天计算，2：月计算")
    private Integer type;


}
