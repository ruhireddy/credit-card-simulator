package com.example.credit.model;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;

import java.util.List;

public class Statement {
    double previousBalance;
    double paymentsAndCredits;
    double purchases;
    double balanceTransfers;
    double cashAdvances;
    double fees;
    double interestCharged;
    double newBalance;
    double creditLine;
    double availableCredit;
    int daysInBillingCycle;
    List<PulsarProperties.Transaction> transactions;

    public Statement(double previousBalance, double paymentsAndCredits, double purchases, double balanceTransfers, double cashAdvances, double fees, double interestCharged, double newBalance, double creditLine, double availableCredit, int daysInBillingCycle, List<PulsarProperties.Transaction> transactions) {
        this.previousBalance = previousBalance;
        this.paymentsAndCredits = paymentsAndCredits;
        this.purchases = purchases;
        this.balanceTransfers = balanceTransfers;
        this.cashAdvances = cashAdvances;
        this.fees = fees;
        this.interestCharged = interestCharged;
        this.newBalance = newBalance;
        this.creditLine = creditLine;
        this.availableCredit = availableCredit;
        this.daysInBillingCycle = daysInBillingCycle;
        this.transactions = transactions;
    }

    // getters and setters

    public double getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public double getPaymentsAndCredits() {
        return paymentsAndCredits;
    }

    public void setPaymentsAndCredits(double paymentsAndCredits) {
        this.paymentsAndCredits = paymentsAndCredits;
    }

    public double getPurchases() {
        return purchases;
    }

    public void setPurchases(double purchases) {
        this.purchases = purchases;
    }

    public double getBalanceTransfers() {
        return balanceTransfers;
    }

    public void setBalanceTransfers(double balanceTransfers) {
        this.balanceTransfers = balanceTransfers;
    }

    public double getCashAdvances() {
        return cashAdvances;
    }

    public void setCashAdvances(double cashAdvances) {
        this.cashAdvances = cashAdvances;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getInterestCharged() {
        return interestCharged;
    }

    public void setInterestCharged(double interestCharged) {
        this.interestCharged = interestCharged;
    }

    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(double availableCredit) {
        this.availableCredit = availableCredit;
    }

    public int getDaysInBillingCycle() {
        return daysInBillingCycle;
    }

    public void setDaysInBillingCycle(int daysInBillingCycle) {
        this.daysInBillingCycle = daysInBillingCycle;
    }

    public List<PulsarProperties.Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<PulsarProperties.Transaction> transactions) {
        this.transactions = transactions;
    }
}

