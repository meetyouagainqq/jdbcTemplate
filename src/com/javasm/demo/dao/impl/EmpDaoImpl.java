package com.javasm.demo.dao.impl;

import com.javasm.demo.dao.EmpDao;
import com.javasm.demo.entity.Emp;
import com.javasm.demo.sql.EmpSql;
import com.javasm.demo.util.DruidUtil;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月22日 15:13
 * @description
 */
public class EmpDaoImpl implements EmpDao {
    private QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());
    private Connection connection;

    public EmpDaoImpl(Connection connection) {
        this.connection = connection;
    }
    public EmpDaoImpl(){

    }

    @Override
    public List<Map<String, Object>> findAllEmp() throws SQLException {
        return queryRunner.query(EmpSql.EMP_FIND_ALL_USER, new MapListHandler());
    }

    @Override
    public Emp findEmployeeById(int id) throws Exception {
        return queryRunner.query(EmpSql.EMP_FIND_USER, new BeanHandler<>(Emp.class, new BasicRowProcessor(new GenerousBeanProcessor())), id);
    }

    @Override
    public void updateEmp(Emp emp) throws SQLException {
        new QueryRunner().update(connection, EmpSql.UPDATE_USER, emp.getSal(), emp.getEid());
    }
}
