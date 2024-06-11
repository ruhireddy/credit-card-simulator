package com.example.credit.controller;

import com.example.credit.model.Statement;
import com.example.credit.repository.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Marks this class as a Spring MVC controller where every method returns a domain object instead of a view
@RequestMapping("/api/Statements") // Maps HTTP requests to /api/Statements to this controller
public class StatementController {

    @Autowired // Injects the StatementRepository dependency - the recomended way is to use contructors  :)
    private StatementRepository statementRepository;


    @GetMapping // Maps HTTP GET requests to /api/Statements to this method
    public List<Statement> getAllStatements() {
        /*
            Fetches and returns all Statement entities from the database
         */
        return statementRepository.findAll();
    }
}