package com.cebbank.liuxiaoming.mybatis.entity;

public class Employee {
    private Integer employId;
    private String lastName;
    private String email;
    private Integer gender;

    public Employee() {
    }

    public Employee(Integer employId, String lastName, String email, Integer gender) {
        this.employId = employId;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
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
                "id=" + employId +
                ", last_name='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
