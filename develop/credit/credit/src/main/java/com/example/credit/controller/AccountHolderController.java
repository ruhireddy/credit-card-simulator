package com.example.credit.controller;

import com.example.credit.model.AccountHolder;
import com.example.credit.repository.AccountHolderRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountHolderController {
    AccountHolderRepo accountHolderRepo;

    public AccountHolderController(AccountHolderRepo accountHolderRepo) {
        this.accountHolderRepo = accountHolderRepo;
    }

    @GetMapping("/admin/password/all-account-holders")
    public @ResponseBody List<AccountHolder> getAllAccountHolders() {
        return accountHolderRepo.findAll();
    }

    @GetMapping("/api/account-holders/{email}")
    public @ResponseBody AccountHolder getAccountHolder(@PathVariable String email) {
        return accountHolderRepo.findByEmail(email);
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String redirectLogin() {
        return "login";
    }

    @GetMapping("/api/account-holders/{email}/homepage")
    public String register() {
        return "homepage";
    }

    @GetMapping("/api/account-holders/{email}/transactions")
    public String transactions() {
        return "transactions";
    }

    @GetMapping("/api/account-holders/{email}/statements")
    public String statements() {
        return "statements";
    }

}
