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
 * 奖品表：展示奖品清单。
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_bonus")
@ApiModel(value = "BwBonus对象", description = "奖品表：展示奖品清单。")
public class BwBonus implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("奖品ID")
    @TableId(value = "bonus_id", type = IdType.AUTO)
    private Long bonusId;

    private String bonusType;

    private String bonusName;


}
