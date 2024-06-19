package com.example.credit.model;

import java.util.Date;

public class Transaction {

    private String cardHolderName;
    private String cardNumber;
    private Date transactionDate;
    private Double amount;
    private String location;
    private String merchantName;
    private String transactionStatus;
    private String currency;

    public Transaction() {
    }

    public Transaction(String cardHolderName, String cardNumber, String transactionId, Date transactionDate,
            Double amount, String location, String merchantName, String transactionStatus, String currency) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.location = location;
        this.merchantName = merchantName;
        this.transactionStatus = transactionStatus;
        this.currency = currency;
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