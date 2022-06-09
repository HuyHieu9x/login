package com.demo.login.service;

import com.demo.login.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> getDepartment();
    Department addDep(Department department);
}
