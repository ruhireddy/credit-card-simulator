package com.example.credit.model;
import java.util.ArrayList;
import java.util.Date;

public class Statement {
    private Long id; // Unique identifier for the statement
    private Double previousBalance; // Previous balance from the last statement
    private Double paymentsAndCredits; // Total payments and credits applied
    private Double purchases; // Total purchases made
    private Double balanceTransfers; // Total balance transfers
    private Double cashAdvances; // Total cash advances
    private Double fees; // Total fees charged
    private Double interestCharged; // Total interest charged
    private Double newBalance; // New balance for the current statement
    private Double creditLine; // Total credit line available
    private Double availableCredit; // Available credit left
    private Date statementCloseDate; // Date when the statement closes
    private Integer daysInBillingCycle; // Number of days in the billing cycle
    private ArrayList<Transaction> transactions;

    // No-argument constructor
    public Statement(int i, int i1, double v, double v1, double v2, double v3, double v4, double v5, double v6, double v7, double v8, double v9, String date, int i2) {
    }

    // Parameterized constructor
    public Statement(Double previousBalance, Double paymentsAndCredits, Double purchases, Double balanceTransfers, Double cashAdvances, Double fees, Double interestCharged, Double newBalance, Double creditLine, Double availableCredit, Date statementCloseDate, Integer daysInBillingCycle) {
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
        this.statementCloseDate = statementCloseDate;
        this.daysInBillingCycle = daysInBillingCycle;
        this.transactions = new ArrayList<Transaction>();
    }

// Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(Double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public Double getPaymentsAndCredits() {
        return paymentsAndCredits;
    }

    public void setPaymentsAndCredits(Double paymentsAndCredits) {
        this.paymentsAndCredits = paymentsAndCredits;
    }

    public Double getPurchases() {
        return purchases;
    }

    public void setPurchases(Double purchases) {
        this.purchases = purchases;
    }

    public Double getBalanceTransfers() {
        return balanceTransfers;
    }

    public void setBalanceTransfers(Double balanceTransfers) {
        this.balanceTransfers = balanceTransfers;
    }

    public Double getCashAdvances() {
        return cashAdvances;
    }

    public void setCashAdvances(Double cashAdvances) {
        this.cashAdvances = cashAdvances;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Double getInterestCharged() {
        return interestCharged;
    }

    public void setInterestCharged(Double interestCharged) {
        this.interestCharged = interestCharged;
    }

    public Double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(Double newBalance) {
        this.newBalance = newBalance;
    }

    public Double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(Double creditLine) {
        this.creditLine = creditLine;
    }

    public Double getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(Double availableCredit) {
        this.availableCredit = availableCredit;
    }

    public Date getStatementCloseDate() {
        return statementCloseDate;
    }

    public void setStatementCloseDate(Date statementCloseDate) {
        this.statementCloseDate = statementCloseDate;
    }

    public Integer getDaysInBillingCycle() {
        return daysInBillingCycle;
    }

    public void setDaysInBillingCycle(Integer daysInBillingCycle) {
        this.daysInBillingCycle = daysInBillingCycle;
    }
}