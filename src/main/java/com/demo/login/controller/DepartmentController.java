package com.demo.login.controller;

import com.demo.login.configuration.ModelMapperConfig;
import com.demo.login.dto.DepartmentDTO;
import com.demo.login.entity.Department;
import com.demo.login.service.impl.DepartmentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<Department> getDepartment(){
        return departmentService.getDepartment();
    }

    @GetMapping(value = "/list")
    public List<DepartmentDTO> getDepartmentDTO(){
        List<Department> departmentList = departmentService.getDepartment();
        List<DepartmentDTO> departmentDTOS = modelMapper.map(departmentList,new TypeToken<List<DepartmentDTO>>(){}.getType());

        return departmentDTOS;
    }

    @PostMapping
    public Department addDep(@RequestBody Department department){
        return departmentService.addDep(department);
    }
}
