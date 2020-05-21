package com.bilibili.springbootjdbc.controller;

import com.bilibili.springbootjdbc.mapper.DepartmentMapper;
import com.bilibili.springbootjdbc.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/getDepartments")
    public List<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }

    @GetMapping("/getDepartment/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDepartment(id);
    }
}
