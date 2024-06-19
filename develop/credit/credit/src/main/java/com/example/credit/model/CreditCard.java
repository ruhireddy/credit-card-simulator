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
}
