package com.demo.login.controller;

import com.demo.login.entity.Account;
import com.demo.login.dto.AccountDTO;
import com.demo.login.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class LoginController {
    @Autowired
    private IAccountService accountService;

    @GetMapping
    public List<Account> getListAcc(){
        return accountService.getAccList();
    }

    @GetMapping(value = "/{email}")
    public Account getAccByUser(@PathVariable("email") String email){
       return accountService.getByEmail(email);
    }

    @PostMapping
    public Account addAcc(@RequestBody Account account){
        return accountService.addAcc(account);
    }

    @GetMapping(value = "/{email}/{password}")
    public Account findByEmailAndPass(@PathVariable("email") String email,@PathVariable("password") String pass){
        return accountService.findByEmailAndPass(email,pass);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Account> updateAcc(@PathVariable("id") int id, @RequestBody Account account){
          return accountService.updateAcc(account,id);
    }

    @PostMapping(value = "/check-login")
    public Account checkLogin(@RequestBody AccountDTO accountDTO){
        return accountService.checkLogin(accountDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id){
        accountService.delete(id);
    }
}
