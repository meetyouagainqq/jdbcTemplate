package com.javasm.demo.entity;

import cn.hutool.core.date.DateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 19:34
 * @description
 */
@Data
public class UserInfo implements Serializable {
    private int id;
    private String username;
    private String password;
    private int age;
    private String image;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date birthday;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastLoginTime;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
    private int rid;
}
