package com.example.credit.controller;

import com.example.credit.model.Transaction;
import com.example.credit.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Marks this class as a Spring MVC controller where every method returns a domain object instead of a view
@RequestMapping("/api/Transactions") // Maps HTTP requests to /api/Transactions to this controller
public class TransactionController {

    @Autowired // Injects the TransactionRepository dependency - the recomended way is to use contructors  :)
    private TransactionRepository transactionRepository;


    @GetMapping // Maps HTTP GET requests to /api/Transactions to this method
    public List<Transaction> getAllTransactions() {
        /*
            Fetches and returns all Transaction entities from the database
         */
        return transactionRepository.findAll();
    }
}