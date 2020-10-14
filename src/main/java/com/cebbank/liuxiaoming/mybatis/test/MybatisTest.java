package com.cebbank.liuxiaoming.mybatis.test;

import com.cebbank.liuxiaoming.mybatis.entity.Employee;
import com.cebbank.liuxiaoming.mybatis.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
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

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(9);
        List<Employee> employees = mapper.queryEmpByIds(ids);
        System.out.println(employees);
//        Employee employee = mapper.queryEmpByIdStep(1);
//        System.out.println(employee.getEmail() );
//        System.out.println(employee.getDept().getDepartName());
//        List<Employee> employees = mapper.queryAll();
//        System.out.println(employees);
//        Department department = mapper.queryDeptByDidCollection(1);
//        System.out.println(department);
        sqlSession.commit();
    }


}
