package com.javasm.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月22日 15:08
 * @description
 */
@Data
public class Emp {
    private int eid;
    private String ename;
    private String job;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date hiredate;
    private BigDecimal sal;

}
