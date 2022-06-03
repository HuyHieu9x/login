package com.demo.login.service;

import com.demo.login.entity.Account;
import com.demo.login.dto.AccountDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAccountService {
    List<Account> getAccList();
    Account getByEmail(String email);
    Account addAcc(Account account);
    Account findByEmailAndPass(String email, String pass);
    ResponseEntity<Account> updateAcc(Account account, int id);
    Account checkLogin(AccountDTO accountDTO);
    void delete(int id);
}
