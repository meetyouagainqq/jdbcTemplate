package com.javasm.demo.test;

import com.javasm.demo.dao.EmpDao;
import com.javasm.demo.dao.impl.EmpDaoImpl;
import com.javasm.demo.entity.Emp;
import com.javasm.demo.service.EmpService;
import com.javasm.demo.service.impl.EmpServiceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月22日 15:25
 * @description
 */
public class EmpTest {
    public static void main(String[] args) throws Exception {
        EmpDao empDao=new EmpDaoImpl();
//        Emp employee = empDao.findEmployeeById(1);
//        System.out.println(employee);
//        List<Map<String, Object>> mapList = empDao.findAllEmp();
//        mapList.forEach(System.out::println);
        Emp emp1 = empDao.findEmployeeById(1);
        Emp emp2 = empDao.findEmployeeById(2);
        BigDecimal money=new BigDecimal("1000");
        EmpService empService=new EmpServiceImpl();
        empService.returnMoney(emp1,emp2,money);

    }
}
