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
 * 奖品项：具体什么奖品
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_bonusItem")
@ApiModel(value = "BwBonusitem对象", description = "奖品项：具体什么奖品")
public class BwBonusitem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("奖品ID")
    private Long bonusId;

    private String bonusName;

    private String bonus;

    private String bonusUrl;

    private String bonusWebpurl;

    private String updatedBy;

    private String linkedUrl;

    private String system;

    private String createdBy;


}
