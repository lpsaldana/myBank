package com.mybank.customer_portfolio.controller;

import com.mybank.customer_portfolio.entities.Account;
import com.mybank.customer_portfolio.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public void createAccount(@RequestBody Account account){
        accountService.createAccount(account);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getAccountById(@PathVariable Long id){
        return ResponseEntity.ok(accountService.getAccountById(id));
    }

    @GetMapping("/customer-acc/{id}")
    public ResponseEntity<?> getCustomerAccounts(@PathVariable Long id){
        return ResponseEntity.ok(accountService.getCustomerAccounts(id));
    }


}
