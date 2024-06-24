package com.example.credit.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "CardInformation")
public class CardInformation {
    private String cardNumber;
    private String cardName;
    private Double creditLimit;
    private String expirationDate;
    private String securityCode;
    private String activeStatus;
    private List<Transactions> transactions;

    public CardInformation() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public CardInformation(String cardNumber, String cardName, Double creditLimit, String expirationDate, String securityCode, String activeStatus, List<Transactions> transactions) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.creditLimit = creditLimit;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.activeStatus = activeStatus;
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "CardInformation{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardName='" + cardName + '\'' +
                ", creditLimit=" + creditLimit +
                ", expirationDate='" + expirationDate + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
