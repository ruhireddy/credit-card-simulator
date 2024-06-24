package com.example.credit.model;

import lombok.Data;

@Data
public class Transactions {
    private String transactionId;
    private String date;
    private String amount;
    private String city;
    private String state;
    private String country;
    private String merchant;
    private String merchantCategory;

    public Transactions() {
    }

    public Transactions(String transactionId, String date, String amount, String city, String state, String merchant, String merchatCategory) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.city = city;
        this.state = state;
        this.merchant = merchant;
        this.merchantCategory = merchatCategory;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getMerchantCategory() {
        return merchantCategory;
    }

    public void setMerchantCategory(String merchantCategory) {
        this.merchantCategory = merchantCategory;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "transactionId='" + transactionId + '\'' +
                ", date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", merchant='" + merchant + '\'' +
                ", merchatCategory='" + merchantCategory + '\'' +
                '}';
    }
}
