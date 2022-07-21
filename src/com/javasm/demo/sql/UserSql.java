package com.javasm.demo.sql;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 19:50
 * @description
 */
public interface UserSql {
       String INSERT_USER_SQL="INSERT INTO userinfo (username,password,birthday,create_time) VALUES (?,?,?,?)";
       String SELECT_USER_SQL ="SELECT * FROM userinfo where id=?" ;
       String UPDATE_USER_SQL = "UPDATE userinfo set username=? where id=?";
       String DELETE_USER_SQL = "DELETE FROM userinfo where id=?";
}
