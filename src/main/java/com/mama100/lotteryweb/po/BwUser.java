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
 * 
 * </p>
 *
 * @author moss
 * @since 2022-08-17
 */
@Getter
@Setter
@TableName("bw_user")
@ApiModel(value = "BwUser对象", description = "")
public class BwUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("微信ID标识")
    private String openId;

    private String customerId;

    private Boolean gender;

    private String mobile;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    private String name;

    private String system;


}
