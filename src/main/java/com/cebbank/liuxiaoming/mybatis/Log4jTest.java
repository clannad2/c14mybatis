package com.cebbank.liuxiaoming.mybatis;

import com.cebbank.liuxiaoming.mybatis.dao.EmployeeMapper;
import com.cebbank.liuxiaoming.mybatis.entity.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Log4jTest {
    private static SqlSessionFactory factory;

    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-conf.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test1() {
        //读取配置文件

        SqlSession sqlSession = factory.openSession();

        System.out.println(sqlSession);

        Employee employee = sqlSession.selectOne("suibian.queryEmpById", 1);
        System.out.println(employee);
    }

    @Test
    public void test2() {
        //读取配置文件

        SqlSession sqlSession = factory.openSession();

        System.out.println(sqlSession);

        List<Employee> emps = sqlSession.selectList("suibian.queryAll");
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void test3(){
        SqlSession sqlSession = factory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        List<Employee> employees = mapper.queryAll();
//        System.out.println(employees);
    }


    @Test
    public void test4(){
        SqlSession sqlSession = factory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setLastName("赵本山");
        employee.setEmail("wangwu@qq.com");
        employee.setGender(1);
        Integer rows = mapper.save(employee);
        System.out.println(rows);
        System.out.println(employee.getEmployId());
//        sqlSession.commit();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = factory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Integer row = mapper.delEmpById(9);
        System.out.println(row);
    }

    @Test
    public void test6(){
        SqlSession sqlSession = factory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = new Employee();
        employee.setLastName("赵四");
        employee.setEmail("wangwu@qq.com");
        employee.setGender(1);
        employee.setEmployId(2);
//
//        mapper.updateEmpById(employee);
//        Employee employee = mapper.queryEmpByLastNameAndEmailParam("王五", "wangwu@qq.com");
        Employee employee1 = mapper.queryEmpByPojo(employee);
        System.out.println(employee1);

    }
}
