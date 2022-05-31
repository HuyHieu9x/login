package com.demo.login.controller;

import com.demo.login.repository.AccountRepository;
import com.demo.login.service.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/account")
public class LoginController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping(value = "/add")
    public Account add(@RequestBody Account account){
        return accountRepository.save(account);
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

}
