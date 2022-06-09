package com.demo.login.service.impl;

import com.demo.login.entity.Employee;
import com.demo.login.repository.EmployeeRepository;
import com.demo.login.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmpList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmp(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public ResponseEntity<Employee> updateEmp(@RequestBody Employee employee, int id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if (employeeOptional.isPresent()){
             Employee employee2 = employeeOptional.get();

             employee2.setName(employee.getName());
             employee2.setPosition(employee.getPosition());
             employee2.setDepartment_id(employee.getDepartment_id());
             employee2.setAddressSet(employee.getAddressSet());

             return new ResponseEntity<Employee>(employeeRepository.save(employee2), HttpStatus.OK);
        }

        return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
}
