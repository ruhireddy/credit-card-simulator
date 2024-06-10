package com.example.credit.model;
import com.example.credit.statement;
import java.util.List;

public class CreditCard {
    private Long id;

    private String cardHolderName;
    private String number;
    private String rewardsStatus;
    private String securityCode;
    private String billingAddress;
    private String zipCode;
    private String status; // Paused, Active, Canceled
    private List<Statement> statements;

    // Getters and Setters
    
}
