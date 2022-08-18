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
@TableName("bw_healthMonitoring")
@ApiModel(value = "BwHealthmonitoring对象", description = "")
public class BwHealthmonitoring implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("客户端端的IP地址信息")
    private String ip;

    private String system;

    @ApiModelProperty("信息类型：超时、错误或者请求失败")
    private String infoType;

    @ApiModelProperty("事件信息")
    private String message;

    @ApiModelProperty("请求路径")
    private String url;

    private String terminal;

    private String activityName;

    private LocalDateTime createdTime;


}
