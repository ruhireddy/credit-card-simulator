package com.example.credit.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Statements")
@Data
public class Statement {
    private Double previousBalance;
    private Double paymentsAndCredits;
    private Double purchases;
    private Double balanceTransfers;
    private Double cashAdvances;
    private Double fees;
    private Double interestCharged;
    private Double newBalance;
    private Double creditLine;
    private Double availableCredit;
    private String statementCloseDate;
    private Integer daysInBillingCycle;

    public Statement(Double previousBalance, Double paymentsAndCredits, Double purchases, Double balanceTransfers,
                     Double cashAdvances, Double fees, Double interestCharged, Double newBalance, Double creditLine,
                     Double availableCredit, String statementCloseDate, Integer daysInBillingCycle) {
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
    }

    @Override
    public String toString() {
        return "Statement{" +
                "previousBalance=" + previousBalance +
                ", paymentsAndCredits=" + paymentsAndCredits +
                ", purchases=" + purchases +
                ", balanceTransfers=" + balanceTransfers +
                ", cashAdvances=" + cashAdvances +
                ", fees=" + fees +
                ", interestCharged=" + interestCharged +
                ", newBalance=" + newBalance +
                ", creditLine=" + creditLine +
                ", availableCredit=" + availableCredit +
                ", statementCloseDate='" + statementCloseDate + '\'' +
                ", daysInBillingCycle=" + daysInBillingCycle +
                '}';
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

    public String getStatementCloseDate() {
        return statementCloseDate;
    }

    public void setStatementCloseDate(String statementCloseDate) {
        this.statementCloseDate = statementCloseDate;
    }

    public Integer getDaysInBillingCycle() {
        return daysInBillingCycle;
    }

    public void setDaysInBillingCycle(Integer daysInBillingCycle) {
        this.daysInBillingCycle = daysInBillingCycle;
    }
}

