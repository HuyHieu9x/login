package com.demo.login.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "pass")
    private String pass;
    @Column(name = "email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "acc_id")
    private List<Name> nameList;

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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Name> getNameList() {
        return nameList;
    }

    public void setNameList(List<Name> nameList) {
        this.nameList = nameList;
    }
}
