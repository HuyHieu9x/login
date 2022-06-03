package com.demo.login.service.impl;

import com.demo.login.entity.Account;
import com.demo.login.dto.AccountDTO;
import com.demo.login.repository.AccountRepository;
import com.demo.login.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAccList(){
        List<Account> lstAcc = accountRepository.findAll();
        return lstAcc;
    }

    @Override
    public Account getByEmail(String email) {
        Account acc = accountRepository.findByEmail(email);
        return acc;
    }

    @Override
    public Account addAcc(@RequestBody Account account) {
        if (account.getEmail() != null && account.getPass()!= null){
            if (account.getEmail().length() >= 5 && account.getPass().length() >= 8){
                String pass = account.getPass();
                String encodedString = Base64.getEncoder().encodeToString(pass.getBytes());

                account.setPass(encodedString);
                return accountRepository.save(account);
            }
        }
        return null;
    }

    @Override
    public Account findByEmailAndPass(String email, String pass) {
        return accountRepository.findByEmailAndPass(email,pass);
    }

    @Override
    public ResponseEntity<Account> updateAcc(@RequestBody Account account, int id) {
        Optional<Account> accountData = accountRepository.findById(id);
        if (accountData.isPresent()){
            Account account1 = accountData.get();

            account1.setName(account.getName());
            account1.setEmail(account.getEmail());
            account1.setPass(account.getPass());

            return new ResponseEntity<>(accountRepository.save(account1),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Account checkLogin(@RequestBody AccountDTO accountDTO) {
        String pass = accountDTO.getPass();
        String encodedString = Base64.getEncoder().encodeToString(pass.getBytes());

        Account acc = accountRepository.findByEmailAndPass(accountDTO.getEmail(),encodedString);

        if (acc != null){
            return acc;
        }
        return null;
    }

    @Override
    public void delete(int id) {
        accountRepository.deleteById(id);
    }
}
