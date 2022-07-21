package com.javasm.demo.dao.impl;

import com.javasm.demo.dao.UserDao;
import com.javasm.demo.entity.UserInfo;
import com.javasm.demo.sql.UserSql;
import com.javasm.demo.util.DruidUtil;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 19:44
 * @description
 */
public class UserDaoImpl implements UserDao {
    private static QueryRunner queryRunner = new QueryRunner(DruidUtil.getDataSource());

    @Override
    public int insertUser(UserInfo userInfo) throws SQLException {
        int row = queryRunner.update(UserSql.INSERT_USER_SQL,
                userInfo.getUsername(),
                userInfo.getPassword(),
                userInfo.getBirthday(),
                userInfo.getCreateTime()
        );
        return row;
    }

    @Override
    public UserInfo findUserInfoBy(int userId) throws SQLException {
        UserInfo userInfo = queryRunner.query(UserSql.SELECT_USER_SQL, new BeanHandler<>(UserInfo.class, new BasicRowProcessor(new GenerousBeanProcessor())), userId);
        return userInfo;
    }

    @Override
    public void updateUser(UserInfo userInfo) throws SQLException {
        queryRunner.update(UserSql.UPDATE_USER_SQL,userInfo.getUsername(),userInfo.getId());
    }

    @Override
    public void deleteUserById(int userId) throws SQLException {
        queryRunner.update(UserSql.DELETE_USER_SQL,userId);
    }
}
