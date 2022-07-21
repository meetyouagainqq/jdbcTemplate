package com.javasm.demo.entity;

import cn.hutool.core.date.DateTime;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    private String birthday;
    private String lastLoginTime;
    private String createTime;
    private String updateTime;
    private int rid;
}
