package com.cebbank.liuxiaoming.mybatis.dao;

import com.cebbank.liuxiaoming.mybatis.entity.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface EmployeeMapper {
    /**
     * 保存
     * @param emp
     * @return
     */
    public Integer save(Employee emp);

    /**
     * 根据员工id删除员工信息
     * @param id
     * @return
     */
    public Integer delEmpById(Integer id);
    public Integer updateEmpById(Employee emp);

    /*
    方法中不同的表现形式
     */
    public Employee queryEmpByLastName(String lastName);
    public Employee queryEmpByLastNameAndEmail(String lastName,String email);
    //使用命名参数
    public Employee queryEmpByLastNameAndEmailParam(@Param("lastName") String lastName,@Param("email") String email);
    //使用Pojo类
    public Employee queryEmpByPojo(Employee emp);
    @MapKey("employId")
    public Map<Integer,Employee> queryEmpByMap();
}
