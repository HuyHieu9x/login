package com.demo.login.service.impl;

import com.demo.login.entity.Employee;
import com.demo.login.repository.EmployeeRepository;
import com.demo.login.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmpList() {
        return employeeRepository.findAll();
    }
}
