package com.example.credit.controller;

import com.example.credit.model.CreditCard;
import com.example.credit.repository.CreditCardRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class CreditCardController {
    CreditCardRepo creditCardRepo;

    public CreditCardController(CreditCardRepo creditCardRepo) {
        this.creditCardRepo = creditCardRepo;
    }

    @GetMapping("/all-cards")
    public List<CreditCard> getAllCards() {
        return creditCardRepo.findAll();
    }

}
