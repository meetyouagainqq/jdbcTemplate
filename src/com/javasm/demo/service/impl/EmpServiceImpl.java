package com.javasm.demo.service.impl;

import com.javasm.demo.dao.EmpDao;
import com.javasm.demo.dao.impl.EmpDaoImpl;
import com.javasm.demo.entity.Emp;
import com.javasm.demo.service.EmpService;
import com.javasm.demo.util.DruidUtil;
import org.apache.commons.dbutils.DbUtils;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月22日 15:41
 * @description 转账的事务一致性
 */
public class EmpServiceImpl implements EmpService {
    @Override
    public void returnMoney(Emp emp1, Emp emp2, BigDecimal money)  {
        Connection connection = null;
        try {
            connection = DruidUtil.getDataSource().getConnection();
            connection.setAutoCommit(false);
            emp1.setSal(emp1.getSal().subtract(money));//减少金额
            emp2.setSal(emp2.getSal().add(money));
            EmpDao empDao=new EmpDaoImpl(connection);
            empDao.updateEmp(emp1);
//            System.out.println(3/0);
            empDao.updateEmp(emp2);
            DbUtils.commitAndCloseQuietly(connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            DbUtils.rollbackAndCloseQuietly(connection);
        }
    }
}
