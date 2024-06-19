package com.example.credit.controller;

import com.example.credit.model.Statement;
import com.example.credit.repository.StatementRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class StatementController {
    StatementRepo statementRepo;

    public StatementController(StatementRepo statementRepo) {
        this.statementRepo = statementRepo;
    }

    @GetMapping("/all-statements")
    public List<Statement> getAllStatements() {
        return statementRepo.findAll();
    }

}
