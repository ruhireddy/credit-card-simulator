package com.example.credit.controller;

import com.example.credit.model.AccountHolder;
import com.example.credit.repository.AccountHolderRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountHolderController {
    AccountHolderRepo accountHolderRepo;

    public AccountHolderController(AccountHolderRepo accountHolderRepo) {
        this.accountHolderRepo = accountHolderRepo;
    }

    @GetMapping("/admin/password/all-account-holders")
    public List<AccountHolder> getAllAccountHolders() {
        return accountHolderRepo.findAll();
    }

    @GetMapping("/api/account-holders/{email}")
    public AccountHolder getAccountHolder(@PathVariable String email) {
        return accountHolderRepo.findByEmail(email);
    }

    @PostMapping("/login")
    public String handleLogin(
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        AccountHolder accountHolder = accountHolderRepo.findByEmail(email);
        if (accountHolder == null) {
            return "login";
        }
        return "homepage";
    }
}
