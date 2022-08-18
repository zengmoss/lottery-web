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
 * big wheel 主活动信息表
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_baseInfo")
@ApiModel(value = "BwBaseinfo对象", description = "big wheel 主活动信息表")
public class BwBaseinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("活动ID标识")
    @TableId(value = "activity_id", type = IdType.AUTO)
    private Long activityId;

    @ApiModelProperty("活动名称,独一无二约束")
    private String activityName;

    @ApiModelProperty("开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty("活动描述")
    private String description;

    @ApiModelProperty("发行方，即出资方")
    private String publishedBy;

    @ApiModelProperty("消耗积分")
    private Integer usedScore;

    @ApiModelProperty("免费参与次数")
    private Integer freeTimes;

    @ApiModelProperty("主活动是否生效")
    private Boolean online;

    @ApiModelProperty("活动URL")
    private String activityUrl;

    @ApiModelProperty("创建活动")
    private String createdBy;

    private LocalDateTime createdTime;

    private String system;

    private String status;

    private String updatedBy;

    private Integer actFreeTimes;

    private Integer playRules;

    private String ruleId;

    private String backgroundImg;

    private String backgroundImgwebp;

    @ApiModelProperty("优惠券跳转链接")
    private String skipUrl;

    @ApiModelProperty("品牌换肤：1-合生元换肤，2-Dodie换肤 3-Healthy Times皮肤 4-满乐皮肤")
    private Integer brandSkin;

    @ApiModelProperty("活动对应外部系统URL")
    private String externalUrl;

    @ApiModelProperty("商品领取方式：0-邮寄，1-门店自提")
    private Integer receiveType;

    @ApiModelProperty("商品领取门店编码")
    private String receiveTerminal;

    @ApiModelProperty("活动触发条件：0-不使用快积分触发，1-使用快积分后触发")
    private Integer triggerType;

    @ApiModelProperty("活动触发条件门店编码")
    private String triggerTerminal;

    @ApiModelProperty("活动触发条件优惠券")
    private String triggerCoupon;

    @ApiModelProperty("大区编码")
    private String areaCode;

    @ApiModelProperty("办事处编码")
    private String officeCode;

    @ApiModelProperty("导购奖励规则ID")
    private String guideAwardRuleId;

    @ApiModelProperty("中奖概率类型：0-非100%中奖，1-100%中奖")
    private Integer winType;

    @ApiModelProperty("最高概率奖品触发提醒的数量")
    private Integer winNum;

    @ApiModelProperty("业务类型 1-运营设置抽奖 2-市场部设置抽奖")
    private Integer businessType;

    @ApiModelProperty("能进行抽奖的手机号码")
    private String phones;

    @ApiModelProperty("是否显示奖品剩余数量，0-否，1-是")
    private Integer shownum;

    @ApiModelProperty("当最高概率奖品数小于配置数时，企业微信通知人")
    private String notifyUser;

    @ApiModelProperty("活动对应外部系统URL类型")
    private String externalUrlType;

    @ApiModelProperty("0 不可抽奖 1.抽中“未中奖”")
    private Integer emptyStockSwitch;

    @ApiModelProperty("是否展示会员等级 0 否 1 是")
    private Integer showLevel;

    @ApiModelProperty("是否展示成长值 0 否 1 是")
    private Integer showGrowth;

    @ApiModelProperty("1，无；2，会员日活动；3，社群活动；4，付费卡活动；5，互动活动；6，精准人群活动；7，区域活动；8，总部活动；9，全民导购")
    private Integer activityType;

    @ApiModelProperty(" 是否同步在会员中心小程序，0 否 1 是")
    private Integer syncMemberMiniprogram;


}
