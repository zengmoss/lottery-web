package com.mama100.lotteryweb.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 活动抽奖次数
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_gameTimes")
@ApiModel(value = "BwGametimes对象", description = "活动抽奖次数")
public class BwGametimes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("活动ID")
    private Long activityId;

    @ApiModelProperty("用户标识")
    private String userId;

    @ApiModelProperty("用户类型：1-促销员，2-会员")
    private Integer userType;

    @ApiModelProperty("抽奖次数")
    private Integer times;

    @ApiModelProperty("状态：1-正常，0-冻结")
    private Integer status;

    @ApiModelProperty("备注")
    private String info;

    @ApiModelProperty("最后操作时间")
    private LocalDateTime operateTime;


}
