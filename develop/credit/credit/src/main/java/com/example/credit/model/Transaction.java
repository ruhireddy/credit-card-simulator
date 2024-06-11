package com.example.credit.model;
import java.util.List;
import java.util.Date;

public class Transaction {

    private Long id; // Unique identifier for the transaction
    private String cardHolderName; // Name of the credit card holder (masked)
    private String cardNumber; // Credit card number (masked)
    private Date transactionDate; // Date of the transaction
    private Double amount; // Amount of the transaction
    private String location; // Location where the transaction took place
    private String merchantName; // Name of the merchant involved in the transaction
    private String transactionStatus; // Status of the transaction (e.g., Completed, Pending)
    private String currency; // Currency used in the transaction

    // No-argument constructor
    public Transaction() {}

    // Constructor w parameters
    public Transaction(String cardHolderName, String cardNumber, String transactionId, Date transactionDate, Double amount, String location, String merchantName, String transactionStatus, String currency) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.location = location;
        this.merchantName = merchantName;
        this.transactionStatus = transactionStatus;
        this.currency = currency;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}