package com.example.credit.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Transactions")
@Data
public class Transaction {
    private int transactionId;
    private String transactionDate;
    private Double amount;
    private String country;
    private String cityState;
    private String zipCode;
    private String merchantName;
    private String merchantType;
    private String transactionStatus;

    public Transaction() {
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate='" + transactionDate + '\'' +
                ", amount=" + amount +
                ", country='" + country + '\'' +
                ", cityState='" + cityState + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantType='" + merchantType + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +
                '}';
    }

    public Transaction(int transactionId, String transactionDate, Double amount, String country, String cityState, String zipCode, String merchantName, String merchantType, String transactionStatus) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.country = country;
        this.cityState = cityState;
        this.zipCode = zipCode;
        this.merchantName = merchantName;
        this.merchantType = merchantType;
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
}
