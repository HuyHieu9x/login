package com.demo.login.service.impl;

import com.demo.login.entity.Department;
import com.demo.login.repository.DepartmentRepository;
import com.demo.login.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department addDep(@RequestBody Department department) {
        return departmentRepository.save(department);
    }
}
