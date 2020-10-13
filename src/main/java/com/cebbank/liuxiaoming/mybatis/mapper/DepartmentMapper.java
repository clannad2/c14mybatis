package com.cebbank.liuxiaoming.mybatis.mapper;

import com.cebbank.liuxiaoming.mybatis.entity.Department;

public interface DepartmentMapper {
    public Department queryDeptByDid(Integer did);
    public Department queryDeptByDidCollection(Integer did);
}
