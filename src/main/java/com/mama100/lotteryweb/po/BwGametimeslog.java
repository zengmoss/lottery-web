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
 * 活动抽奖次数变更日志
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_gameTimesLog")
@ApiModel(value = "BwGametimeslog对象", description = "活动抽奖次数变更日志")
public class BwGametimeslog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("活动抽奖次数ID")
    private Long gameTimesId;

    @ApiModelProperty("变更前抽奖次数")
    private Integer oldTimes;

    @ApiModelProperty("变更后抽奖次数")
    private Integer newTimes;

    @ApiModelProperty("操作人")
    private String operator;

    @ApiModelProperty("操作时间")
    private LocalDateTime operateTime;


}
