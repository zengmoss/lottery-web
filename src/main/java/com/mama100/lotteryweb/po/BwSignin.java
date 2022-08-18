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
 * 会员签到记录表
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_signin")
@ApiModel(value = "BwSignin对象", description = "会员签到记录表")
public class BwSignin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("客户号")
    private Long customerId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("签到次数")
    private Integer times;


}
