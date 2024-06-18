package com.example.credit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
//import java.util.List;
@Document(collection = "CreditCardAccountInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    private String cardHolderName; // Name of the credit card holder
    private String number; // Credit card number
    private String rewardsStatus; // Rewards status or tier of the card
    private String securityCode; // Security code (CVV) of the card
    private String billingAddress; // Billing address of the card holder
    private String zipCode; // ZIP code of the billing address
    private String status; // Status of the card (e.g., Paused, Active, Canceled)

//     private List<Statement> statements;
    // No-argument constructor
    public CreditCard() {}

    // Constructor w parameters
    public CreditCard(String cardHolderName, String number, String rewardsStatus, String securityCode, String billingAddress, String zipCode, String status) {

        this.cardHolderName = cardHolderName;
        this.number = number;
        this.rewardsStatus = rewardsStatus;
        this.securityCode = securityCode;
        this.billingAddress = billingAddress;
        this.zipCode = zipCode;
        this.status = status;
//         this.statements = statements;
    }

    // getters and setters
//    public List<Statement> getStatements() {
//        return statements;
//    }

//    public void setStatements(List<Statement> statements) {
//        this.statements = statements;
//    }

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

    @Override
    public String toString() {
        return "CreditCard{" +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", number='" + number + '\'' +
                ", rewardsStatus='" + rewardsStatus + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
