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
 * 积分和优惠劵推送记录表，积分包括扣积分和加积分，优惠劵包括发优惠劵是否成功。
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_points")
@ApiModel(value = "BwPoints对象", description = "积分和优惠劵推送记录表，积分包括扣积分和加积分，优惠劵包括发优惠劵是否成功。")
public class BwPoints implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long customerId;

    private String status;

    private Integer point;

    private String accountType;

    private String typeId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    private String operationType;

    private Long activityId;

    private String seqNo;


}
