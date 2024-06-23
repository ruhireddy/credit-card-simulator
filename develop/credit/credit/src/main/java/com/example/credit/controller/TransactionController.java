package com.example.credit.controller;

import com.example.credit.model.Transaction;
import com.example.credit.repository.TransactionRepo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TransactionController {
    TransactionRepo transactionRepo;

    public TransactionController(TransactionRepo transactionRepo) {
        this.transactionRepo = transactionRepo;
    }

    @GetMapping("/all-transactions")
    public @ResponseBody List<Transaction> getAllTransactions() {
        return transactionRepo.findAll();
    }

    @GetMapping("/transactions")
    public String transaction() {
        return "transactions";
    }

    @GetMapping("/api/transaction/{transactionId}")
    public @ResponseBody Transaction getTransaction(@PathVariable int transactionId) {
        return transactionRepo.findByTransactionId(transactionId);
    }

}
