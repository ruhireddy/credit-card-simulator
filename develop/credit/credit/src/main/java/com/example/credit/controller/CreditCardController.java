package com.example.credit.controller;

import com.example.credit.model.CreditCard;
import com.example.credit.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Marks this class as a Spring MVC controller where every method returns a domain object instead of a view
@RequestMapping("/api/CreditCards") // Maps HTTP requests to /api/CreditCards to this controller
public class CreditCardController {

    @Autowired // Injects the CreditCardRepository dependency - the recomended way is to use contructors  :)
    private CreditCardRepository creditCardRepository;


    @GetMapping // Maps HTTP GET requests to /api/CreditCards to this method
    public List<CreditCard> getAllCreditCards() {
        /*
            Fetches and returns all CreditCard entities from the database
         */
        return creditCardRepository.findAll();
    }
}