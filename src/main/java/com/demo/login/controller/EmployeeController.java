package com.demo.login.controller;

import com.demo.login.entity.Employee;
import com.demo.login.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmpList(){
        return employeeService.getEmpList();
    }

    @PostMapping
    public Employee addEmp(@RequestBody Employee employee){
        return employeeService.addEmp(employee);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee,@PathVariable("id") int id){
        return employeeService.updateEmp(employee,id);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id){
        employeeService.delete(id);
    }
}
