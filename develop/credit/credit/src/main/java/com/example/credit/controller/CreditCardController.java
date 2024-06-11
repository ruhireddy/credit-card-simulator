package com.example.credit.controller;

import com.example.credit.model.CreditCard;
import com.example.credit.model.Statement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CreditCardController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/credit-card")
    public CreditCard getCreditCard() {
        Statement statement = new Statement(
                1000.0,          // previousBalance
                200.0,           // paymentsAndCredits
                500.0,           // purchases
                0.0,             // balanceTransfers
                50.0,            // cashAdvances
                30.0,            // fees
                20.0,            // interestCharged
                1300.0,          // newBalance
                5000.0,          // creditLine
                3700.0,          // availableCredit
                new Date(),      // statementCloseDate (current date for this example)
                30               // daysInBillingCycle
        );
        List<Statement> statements = new ArrayList<>();
        statements.add(statement);
        return new CreditCard(
                99L,
          "John Doe",
          "1234 2134 2134 2343",
          "active",
          "798",
          "123 Street Road",
          "23452",
          "active",
                statements
        );
    }

}