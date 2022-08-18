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
 * 广告
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_ad")
@ApiModel(value = "BwAd对象", description = "广告")
public class BwAd implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("状态：0-已下线，1-已上线")
    private Integer status;

    @ApiModelProperty("应用平台")
    private String system;

    @ApiModelProperty("图片地址")
    private String image;

    @ApiModelProperty("APP链接")
    private String appUrl;

    @ApiModelProperty("展示该广告的品牌")
    private String displayBrand;

    @ApiModelProperty("微信链接")
    private String wxUrl;

    @ApiModelProperty("备注")
    private String info;

    @ApiModelProperty("操作时间")
    private LocalDateTime operateTime;

    @ApiModelProperty("结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty("开始时间")
    private LocalDateTime startTime;


}
