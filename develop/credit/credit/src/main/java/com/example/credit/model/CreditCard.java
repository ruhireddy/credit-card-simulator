package com.example.credit.model;
import java.util.List;

public class CreditCard {

    private Long id; // Unique identifier for the credit card
    private String cardHolderName; // Name of the credit card holder
    private String number; // Credit card number
    private String rewardsStatus; // Rewards status or tier of the card
    private String securityCode; // Security code (CVV) of the card
    private String billingAddress; // Billing address of the card holder
    private String zipCode; // ZIP code of the billing address
    private String status; // Status of the card (e.g., Paused, Active, Canceled)

    private List<Statement> statements;
    // No-argument constructor
    public CreditCard() {}

    // Constructor w parameters
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

    // getters and setters
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
}
