package com.javasm.demo.test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.LocalDateTimeUtil;
import com.javasm.demo.dao.UserDao;
import com.javasm.demo.dao.impl.UserDaoImpl;
import com.javasm.demo.entity.UserInfo;
import com.javasm.demo.util.DruidUtil;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月21日 19:34
 * @description
 */
public class DruidTest {
    public static void main(String[] args) throws Exception {
        //new Thread(DruidTest::demo).start();
        //demo1();
        //demo2();
        demo3();
    }

    private static void demo3() throws SQLException {
        UserDao userDao=new UserDaoImpl();
        userDao.deleteUserById(4);
    }

    private static void demo2() throws SQLException {
        UserDao userDao=new UserDaoImpl();
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("123hah");
        userInfo.setId(4);
        userDao.updateUser(userInfo);
    }

    private static void demo1() throws SQLException {
        UserDao userDao=new UserDaoImpl();
        UserInfo userInfo = userDao.findUserInfoBy(4);
        System.out.println(userInfo);
    }

    private static void demo() {
        try {
            for (int i = 0; i < 100; i++) {
                UserDao userDao = new UserDaoImpl();
                UserInfo userInfo = new UserInfo();
                userInfo.setUsername("sunshine");
                userInfo.setPassword("123456");
                DateTime localDate = DateUtil.parse("2020-01-23");
                userInfo.setBirthday(localDate.toString());
                userInfo.setCreateTime(LocalDateTime.now().toString());
                userDao.insertUser(userInfo);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
