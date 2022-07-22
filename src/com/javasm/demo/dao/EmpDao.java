package com.javasm.demo.dao;

import com.javasm.demo.entity.Emp;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月22日 15:13
 * @description
 */
public interface EmpDao {
    public List<Map<String,Object>> findAllEmp() throws SQLException;
    Emp findEmployeeById(int id) throws Exception;
    void updateEmp(Emp emp) throws SQLException;
}
