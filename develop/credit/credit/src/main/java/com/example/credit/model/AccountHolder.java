package com.example.credit.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import com.example.credit.model.CardInformation;
import java.util.List;

@Data
@Document(collection = "AccountHolder")
public class AccountHolder {
    private String fullName;
    private String address;
    private String country;
    private String phoneNumber;
    private String email;
    private String accountStatus;
    private List<String> ownedCreditCards;

    public AccountHolder() {
    }

    public AccountHolder(String fullName, String address, String country, String phoneNumber, String email, String accountStatus, List<String> ownedCreditCards) {
        this.fullName = fullName;
        this.address = address;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.accountStatus = accountStatus;
        this.ownedCreditCards = ownedCreditCards;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public List<String> getOwnedCreditCards() {
        return ownedCreditCards;
    }

    public void setOwnedCreditCards(List<String> ownedCreditCards) {
        this.ownedCreditCards = ownedCreditCards;
    }

    @Override
    public String toString() {
        return "AccountHolder{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                ", ownedCreditCards=" + ownedCreditCards +
                '}';
    }
}
