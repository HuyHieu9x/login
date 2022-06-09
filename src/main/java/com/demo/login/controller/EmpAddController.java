package com.demo.login.controller;

import com.demo.login.entity.Emp_Add;
import com.demo.login.service.IEmpAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-add")
public class EmpAddController {
    @Autowired
    private IEmpAddService iEmpAddService;

    @GetMapping
    public List<Emp_Add> getEmpAdd(){
        return iEmpAddService.getEmpAdd();
    }

    @PostMapping
    public Emp_Add addEmpAdd(@RequestBody Emp_Add emp_add){
        return iEmpAddService.add_emp(emp_add);
    }
}
