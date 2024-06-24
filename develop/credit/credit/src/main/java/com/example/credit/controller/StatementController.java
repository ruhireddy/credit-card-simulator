package com.example.credit.controller;

import com.example.credit.model.Statement;
import com.example.credit.repository.StatementRepo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StatementController {
    StatementRepo statementRepo;

    public StatementController(StatementRepo statementRepo) {
        this.statementRepo = statementRepo;
    }

    @GetMapping("/all-statements")
    public @ResponseBody List<Statement> getAllStatements() {
        return statementRepo.findAll();
    }

    @GetMapping("/statements")
    public String statement() {
        return "statements";
    }

    @GetMapping("/homepage")
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String redirectLogin() {
        return "login";
    }

    @GetMapping("/api/statement/{statementId}")
    public @ResponseBody Statement getStatement(@PathVariable int statementId) {
        return statementRepo.findByStatementId(statementId);
    }

}
