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

    @GetMapping("/all-account-holders")
    public @ResponseBody List<AccountHolder> getAllAccountHolders() {
        return accountHolderRepo.findAll();
    }

    @GetMapping("/api/account-holders/{phoneNumber}")
    public @ResponseBody AccountHolder getAccountHolder(@PathVariable String phoneNumber) {
        return accountHolderRepo.findByPhoneNumber(phoneNumber);
    }

}
