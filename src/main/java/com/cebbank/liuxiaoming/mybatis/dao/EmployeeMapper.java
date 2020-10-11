package com.cebbank.liuxiaoming.mybatis.dao;

import com.cebbank.liuxiaoming.mybatis.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    public Employee queryEmpById(Integer id);
    public List<Employee> queryAll();
}
