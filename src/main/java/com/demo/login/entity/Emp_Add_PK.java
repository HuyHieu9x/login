package com.demo.login.entity;

import java.io.Serializable;

public class Emp_Add_PK implements Serializable {
    private int id_employee;
    private int id_address;

    public Emp_Add_PK() {
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public int getId_address() {
        return id_address;
    }

    public void setId_address(int id_address) {
        this.id_address = id_address;
    }
}
