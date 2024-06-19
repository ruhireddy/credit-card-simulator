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

    public Statement() {
    }

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
}
