package com.cebbank.liuxiaoming.mybatis.test;

import com.cebbank.liuxiaoming.mybatis.entity.Department;
import com.cebbank.liuxiaoming.mybatis.mapper.DepartmentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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

        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
//        Employee employee = mapper.queryEmpByIdStep(1);
//        System.out.println(employee.getEmail() );
//        System.out.println(employee.getDept().getDepartName());
//        List<Employee> employees = mapper.queryAll();
//        System.out.println(employees);
        Department department = mapper.queryDeptByDidCollection(1);
        System.out.println(department);
        sqlSession.commit();
    }


}
