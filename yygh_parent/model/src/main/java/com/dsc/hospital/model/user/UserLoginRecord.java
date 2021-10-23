package com.dsc.hospital.model.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dsc.hospital.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户登陆记录
 * @author info
 */
@Data
@ApiModel(description = "用户登录日志")
@TableName("user_login_record")
public class UserLoginRecord extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty(value = "ip")
    @TableField("ip")
    private String ip;


    }
