package com.demo.login.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(Emp_Add_PK.class)
@Table(name = "Emp_Add")
public class Emp_Add implements Serializable {
    @Id
    @Column(name = "id_employee")
    private int id_employee;
    @Id
    @Column(name = "id_address")
    private int id_address;

    public Emp_Add() {
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
