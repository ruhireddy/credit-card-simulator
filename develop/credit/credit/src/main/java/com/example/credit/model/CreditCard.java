package com.example.credit.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "CreditCardAccountInfo")
@Data
public class CreditCard {
    private String cardHolderName;
    private String cardNumber;
    private String rewardsStatus;
    private String securityCode;
    private String billingAddress;
    private String zipCode;
    private String status;

    public CreditCard() {
    }

    public CreditCard(String cardHolderName, String number, String rewardsStatus, String securityCode,
            String billingAddress, String zipCode, String status) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = number;
        this.rewardsStatus = rewardsStatus;
        this.securityCode = securityCode;
        this.billingAddress = billingAddress;
        this.zipCode = zipCode;
        this.status = status;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", rewardsStatus='" + rewardsStatus + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", status='" + status + '\'' +
                '}';
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

    public String getRewardsStatus() {
        return rewardsStatus;
    }

    public void setRewardsStatus(String rewardsStatus) {
        this.rewardsStatus = rewardsStatus;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
