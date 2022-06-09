package com.demo.login.service.impl;

import com.demo.login.entity.Emp_Add;
import com.demo.login.repository.EmpAddRepository;
import com.demo.login.service.IEmpAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AddEmpService implements IEmpAddService {
    @Autowired
    private EmpAddRepository empAddRepository;

    @Override
    public Emp_Add add_emp(@RequestBody Emp_Add emp_add) {
        return empAddRepository.save(emp_add);
    }

    @Override
    public List<Emp_Add> getEmpAdd() {
        return empAddRepository.findAll();
    }
}
