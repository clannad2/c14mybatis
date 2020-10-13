package com.cebbank.liuxiaoming.mybatis.entity;

import java.util.List;

public class Department {
    private Integer departId;
    private String departName;
    private List<Employee> employees;

    public Department() {
    }

    public Department(Integer departId, String departName, List<Employee> employees) {
        this.departId = departId;
        this.departName = departName;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getDepartId() {
        return departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departId=" + departId +
                ", departName='" + departName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
