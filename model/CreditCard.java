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

    public CreditCard(Long id, String cardHolderName, String number, String rewardsStatus, String securityCode, String billingAddress, String zipCode, String status, List<Statement> statements) {
        this.id = id;
        this.cardHolderName = cardHolderName;
        this.number = number;
        this.rewardsStatus = rewardsStatus;
        this.securityCode = securityCode;
        this.billingAddress = billingAddress;
        this.zipCode = zipCode;
        this.status = status;
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getRewardsStatus() {
        return rewardsStatus;
    }

    public void setRewardsStatus(String rewardsStatus) {
        this.rewardsStatus = rewardsStatus;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "creditCard", cascade = CascadeType.ALL)
    private List<Statement> statements;

    // Getters and Setters
    
}
