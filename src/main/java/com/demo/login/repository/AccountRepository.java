package com.demo.login.repository;

import com.demo.login.service.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer>{
}
