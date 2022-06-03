package com.demo.login.repository;

import com.demo.login.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer>{
    Account findByEmail(String email);
    Account findByEmailAndPass(String email , String pass);
}
