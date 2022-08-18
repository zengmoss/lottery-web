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
 * big wheel 转盘表格信息表，一个活动对应12个转盘格
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_gridItem")
@ApiModel(value = "BwGriditem对象", description = "big wheel 转盘表格信息表，一个活动对应12个转盘格")
public class BwGriditem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("转盘表ID标识")
    @TableId(value = "item_id", type = IdType.AUTO)
    private Long itemId;

    @ApiModelProperty("活动ID标识")
    private Long activityId;

    @ApiModelProperty("转盘格的序列号")
    private Integer sequence;

    @ApiModelProperty("转盘格的名称")
    private String gridName;

    @ApiModelProperty("奖品类型， 优惠劵、商品、积分等")
    private String bonusType;

    @ApiModelProperty("奖品")
    private String bonus;

    @ApiModelProperty("奖品名称")
    private String bonusName;

    private String bonusPictureurl;

    @ApiModelProperty("奖品图片webp")
    private String webpUrl;

    @ApiModelProperty("大字标题（中奖提示）")
    private String bigTips;

    @ApiModelProperty("小字说明（中奖提示）")
    private String smallTips;

    @ApiModelProperty("免费中奖率")
    private Float freeRate;

    @ApiModelProperty("消耗积分中奖概率	            ")
    private Float payRate;

    private Integer quantity;

    @ApiModelProperty("总数量")
    private Integer totalQuantity;

    private String updatedBy;

    private String linkedUrl;

    @ApiModelProperty("1.表示跳微信链接 2.表示跳微信小程序")
    private Integer jumpType;

    @ApiModelProperty("appId,jump_type为2时需要用到")
    private String metaNameWeixin;

    @ApiModelProperty("小程序路径,jump_type为2时需要用到")
    private String pathWeixin;


}
