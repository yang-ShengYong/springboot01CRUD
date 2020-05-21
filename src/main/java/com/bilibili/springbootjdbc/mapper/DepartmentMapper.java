package com.bilibili.springbootjdbc.mapper;

import com.bilibili.springbootjdbc.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    List<Department> getDepartments();
    Department getDepartment(Integer id);
}
