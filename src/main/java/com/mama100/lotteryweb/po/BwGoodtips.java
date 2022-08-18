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
@TableName("bw_goodTips")
@ApiModel(value = "BwGoodtips对象", description = "")
public class BwGoodtips implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("提示标识")
    @TableId(value = "tip_id", type = IdType.AUTO)
    private Long tipId;

    @ApiModelProperty("活动ID标识")
    private Long activityId;

    @ApiModelProperty("大字标题")
    private String bigTips;

    @ApiModelProperty("小字说明")
    private String smallTips;

    private String updatedBy;


}
