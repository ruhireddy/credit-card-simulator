package com.example.credit.controller;

import com.example.credit.model.CreditCard;
import com.example.credit.repository.CreditCardRepo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CreditCardController {
    CreditCardRepo creditCardRepo;

    public CreditCardController(CreditCardRepo creditCardRepo) {
        this.creditCardRepo = creditCardRepo;
    }


//    @GetMapping("/all-cards")
//    public @ResponseBody List<CreditCard> getAllCards() {
//        return creditCardRepo.findAll();
//    }
//
//    @GetMapping("/api/card/{cardNumber}")
//    public @ResponseBody CreditCard getCreditCard(@PathVariable String cardNumber) {
//        return creditCardRepo.findByCardNumber(cardNumber);
//    }
}
