package com.pzh.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.Date;

/**
 * Time: 2020/7/15
 * 用户实体类
 * @author PZH
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel("用户实体类")
public class User implements Serializable {
    private int id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
    private Date registTime;
    @ApiModelProperty("身份")
    private String identity;
    //这个数据存在那个数据库的字段 微服务一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String cem;

}
