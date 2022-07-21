package com.javasm.demo.dao;

import com.javasm.demo.entity.UserInfo;

import java.sql.SQLException;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 19:44
 * @description
 */
public interface UserDao {
    int insertUser(UserInfo userInfo) throws SQLException;
    UserInfo findUserInfoBy(int userId) throws SQLException;
    void updateUser(UserInfo userInfo) throws SQLException;
    void deleteUserById(int userId) throws SQLException;
}
