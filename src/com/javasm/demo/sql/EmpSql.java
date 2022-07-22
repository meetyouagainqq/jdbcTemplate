package com.javasm.demo.sql;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月22日 15:17
 * @description
 */
public interface EmpSql {
    String EMP_FIND_USER="select * from emp where eid=?";
    String EMP_FIND_ALL_USER="select * from emp";
    String UPDATE_USER = "update emp set sal=? where eid=?";
}
