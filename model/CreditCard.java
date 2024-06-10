package com.example.credit;

import javax.persistence.*;
import java.util.List;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardHolderName;
    private String number;
    private String rewardsStatus;
    private String securityCode;
    private String billingAddress;
    private String zipCode;
    private String status; // Paused, Active, Canceled

    @OneToMany(mappedBy = "creditCard", cascade = CascadeType.ALL)
    private List<Statement> statements;

    // Getters and Setters
    
}
