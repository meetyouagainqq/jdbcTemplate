package com.javasm.demo.service;

import com.javasm.demo.entity.Emp;

import java.math.BigDecimal;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月22日 15:41
 * @description
 */
public interface EmpService {
    void returnMoney(Emp emp1, Emp emp2, BigDecimal money);
}
