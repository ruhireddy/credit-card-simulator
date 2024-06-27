package com.example.credit.controller;

import com.example.credit.model.AccountHolder;
import com.example.credit.repository.AccountHolderRepo;
import com.example.credit.model.CardInformation;
import com.example.credit.model.Transactions;
import com.example.credit.repository.CardInformationRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/account-holders/{phoneNumber}")
    public @ResponseBody AccountHolder getAccountHolder(@PathVariable String phoneNumber) {
        return accountHolderRepo.findByPhoneNumber(phoneNumber);
    }

    @GetMapping("/{phoneNumber}/cards")
    public @ResponseBody List<String> getCardsByPhoneNumber(@PathVariable String phoneNumber) {
        AccountHolder accountHolder = accountHolderRepo.findByPhoneNumber(phoneNumber);
        return accountHolder.getOwnedCreditCards();
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/homepage")
    public String register() {
        return "homepage";
    }

    @GetMapping("/transactions")
    public String transactions() {
        return "transactions";
    }

}
