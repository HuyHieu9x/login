package com.demo.login.service;

import com.demo.login.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmpList();
    Employee addEmp(Employee employee);
    ResponseEntity<Employee> updateEmp(Employee employee, int id);
    void delete(int id);
}
