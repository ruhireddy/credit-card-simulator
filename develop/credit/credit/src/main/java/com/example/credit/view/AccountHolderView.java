package com.example.credit.view;

import com.example.credit.repository.AccountHolderRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountHolderView {
    AccountHolderRepo accountHolderRepo;

    public AccountHolderView(AccountHolderRepo accountHolderRepo) {
        this.accountHolderRepo = accountHolderRepo;
    }

    @GetMapping("/login")
    public String loginView() {
        return "login";
    }

    @GetMapping("/")
    public String redirectToLoginView() {
        return "login";
    }

    @GetMapping("/api/account-holders/{email}/homepage")
    public String homepageView() {
        return "homepage";
    }

    @GetMapping("/api/account-holders/{email}/transactions")
    public String transactionsView() {
        return "transactions";
    }

    @GetMapping("/api/account-holders/{email}/statements")
    public String statementsView() {
        return "statements";
    }

}
