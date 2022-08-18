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
@TableName("bw_group")
@ApiModel(value = "BwGroup对象", description = "")
public class BwGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("互斥组id")
    @TableId(value = "group_id", type = IdType.AUTO)
    private Long groupId;

    @ApiModelProperty("状态，1启用，0停用，默认值为启用")
    private Integer status;

    @ApiModelProperty("互斥组编码")
    private String code;

    @ApiModelProperty("互斥组描述")
    private String description;

    @ApiModelProperty("创建人工号")
    private String createdBy;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("修改人工号")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedTime;

    @ApiModelProperty("平台 快乐100抽奖，合家抽奖")
    private String publishedBy;


}
