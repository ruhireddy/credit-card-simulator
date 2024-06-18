package com.example.credit.controller;

import com.example.credit.model.CreditCard;
import com.example.credit.model.Statement;
import com.example.credit.repository.CreditCardRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api")
public class CreditCardController {
    CreditCardRepo creditCardRepo;

    public CreditCardController(CreditCardRepo creditCardRepo) {
        this.creditCardRepo = creditCardRepo;
    }

    @GetMapping("all-cards")
    public List<CreditCard> getAllCards() {
        return creditCardRepo.findAll();
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/credit-card")
    public String creditCard() {
        return "credit-card";
    }

    @GetMapping("/statements")
    public String statements() {
        return "statements";
    }

    @GetMapping("/credit-cardss")
    public CreditCard getCreditCard() {
        Statement statement = new Statement(
                1000.0, // previousBalance
                200.0, // paymentsAndCredits
                500.0, // purchases
                0.0, // balanceTransfers
                50.0, // cashAdvances
                30.0, // fees
                20.0, // interestCharged
                1300.0, // newBalance
                5000.0, // creditLine
                3700.0, // availableCredit
                new Date(), // statementCloseDate (current date for this example)
                30 // daysInBillingCycle
        );

        return new CreditCard(
                "John Doe", // cardHolderName
                "1234567890123456", // number
                "Gold", // rewardsStatus
                "123", // securityCode
                "123 Main St, Anytown, USA", // billingAddress
                "12345", // zipCode
                "Active" // status
        );
    }

}