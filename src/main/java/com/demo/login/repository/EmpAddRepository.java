package com.demo.login.repository;

import com.demo.login.entity.Emp_Add;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpAddRepository extends JpaRepository<Emp_Add,Integer> {
}
