package com.demo.login.service;

import com.demo.login.entity.Emp_Add;

import java.util.List;

public interface IEmpAddService {
    Emp_Add add_emp(Emp_Add emp_add);
    List<Emp_Add> getEmpAdd();
}
