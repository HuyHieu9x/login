package com.demo.login.dto;

import com.demo.login.entity.Employee;

import java.util.List;

public class DepartmentDTO {
    private int id;
    private String name;

    private int employeeId;

    private String employeeName;
//    private List<EmployeeDTO> employees;
//
//    static class  EmployeeDTO{
//        private int id;
//        private String name;
//
//        public EmployeeDTO() {
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
    public DepartmentDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<EmployeeDTO> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<EmployeeDTO> employees) {
//        this.employees = employees;
//    }


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
