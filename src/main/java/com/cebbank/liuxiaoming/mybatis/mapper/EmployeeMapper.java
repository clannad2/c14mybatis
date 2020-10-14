package com.cebbank.liuxiaoming.mybatis.mapper;

import com.cebbank.liuxiaoming.mybatis.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> queryAll();

    /**
     * 根据员工Id查询员工信息和所属部门信息
     * @param empId
     * @return
     */
    public Employee queryEmpById(Integer empId);
    public Employee queryEmpByIdStep(Integer empId);

    /**
     *
     * @param ids
     * @return
     */
    public List<Employee> queryEmpByIds(@Param("ids") List<Integer> ids);
}
