package com.cebbank.liuxiaoming.mybatis.entity;

public class Employee {
    private Integer employId;
    private String lastName;
    private String email;
    private Integer gender;
    private Department dept;

    public Employee() {
    }

    public Employee(Integer employId, String lastName, String email, Integer gender, Department dept) {
        this.employId = employId;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dept = dept;
    }

    public Department getDept() {
        return dept;
    }

    public Integer getEmployId() {
        return employId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setEmployId(Integer employId) {
        this.employId = employId;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employId=" + employId +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", dept=" + dept +
                '}';
    }
}
