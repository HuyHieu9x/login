package com.demo.login.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;

//    @ManyToMany(mappedBy = "addressSet")
//    private Set<Employee> employeeSet;

    public Address() {
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

//    public Set<Employee> getEmployeeSet() {
//        return employeeSet;
//    }
//
//    public void setEmployeeSet(Set<Employee> employeeSet) {
//        this.employeeSet = employeeSet;
//    }
}
