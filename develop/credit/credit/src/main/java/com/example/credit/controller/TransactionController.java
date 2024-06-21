package com.example.credit.controller;

import com.example.credit.model.Transaction;
import com.example.credit.repository.TransactionRepo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@Controller
public class TransactionController{
    TransactionRepo transactionRepo;

    public TransactionController(TransactionRepo transactionRepo) {
        this.transactionRepo = transactionRepo;
    }

    @GetMapping("/all-transactions")
    public List<Transaction> getAllStatements() {
        return transactionRepo.findAll();
    }

}
