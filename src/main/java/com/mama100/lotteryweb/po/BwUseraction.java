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
 * 用户活动记录：记录每次用户活动的日志操作。
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_userAction")
@ApiModel(value = "BwUseraction对象", description = "用户活动记录：记录每次用户活动的日志操作。")
public class BwUseraction implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("操作ID")
    @TableId(value = "action_id", type = IdType.AUTO)
    private Long actionId;

    @ApiModelProperty("转盘表ID标识")
    private Long itemId;

    @ApiModelProperty("活动ID标识")
    private Long activityId;

    @ApiModelProperty("电话号码")
    private String phone;

    @ApiModelProperty("操作次数，与活动设置有关")
    private Integer actionTimes;

    @ApiModelProperty("会员编码")
    private String userCode;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("是否中奖，默认为0，没有中奖")
    private Boolean isWinning;

    @ApiModelProperty("中奖用户省编码")
    private String provinceCode;

    @ApiModelProperty("中奖用户省")
    private String province;

    @ApiModelProperty("中奖用户市编码")
    private String cityCode;

    @ApiModelProperty("中奖用户市")
    private String city;

    @ApiModelProperty("中奖用户区编码")
    private String districtCode;

    @ApiModelProperty("中奖用户区")
    private String district;

    @ApiModelProperty("中奖地址：接收中奖的地址")
    private String address;

    @ApiModelProperty("收件人电话")
    private String giftPhone;

    @ApiModelProperty("邮编号")
    private String mailCode;

    @ApiModelProperty("收件人名")
    private String receivedName;

    @ApiModelProperty("更新时间")
    private LocalDateTime receivedTime;

    private Boolean hasReceived;

    private String updatedBy;

    @ApiModelProperty("中奖时间")
    private LocalDateTime winningTime;

    @ApiModelProperty("中奖名称")
    private String bonus;

    private String bonusType;

    private String system;

    private Boolean isPay;

    private Integer usedScore;

    private String activityName;

    private String bonusName;

    @ApiModelProperty("门店编码")
    private String terminalCode;

    @ApiModelProperty("门店名称")
    private String terminalName;

    @ApiModelProperty("实际领取礼品门店名称")
    private String receivedTerminalName;

    @ApiModelProperty("会员ID")
    private String customerId;

    @ApiModelProperty("商户订单号：商户发放红包的商户订单号")
    private String orderCode;

    @ApiModelProperty("实际领取礼品门店编码")
    private String receivedTerminalCode;

    @ApiModelProperty("实际领取奖品名称")
    private String receivedBonus;

    @ApiModelProperty("核销系统来源")
    private String writeOffSystem;


}
