package org.example.week3;

import java.util.Arrays;

public class SavingsAccountDemo extends ThisAccountDemo {

    private String accountType;
    private double[] loans;

    private final double SMS_CHARGE = 4.00;
    private final double TRANSACTION_CHARGE = 20.0;

    public SavingsAccountDemo( String actNo, String accountName, double balance ){
        super(actNo, accountName, balance );
        this.accountType = "SAVINGS";
        this.loans = new double[5];
    }

    public SavingsAccountDemo( String actNo, String accountName ){
        this(actNo, accountName, 0.0);
    }

    @Override
    public boolean withdraw(double amount) {
        double amountToWithdraw = (amount + SMS_CHARGE + TRANSACTION_CHARGE);
        if( getAccountBalance() < amountToWithdraw){
            System.out.println("There is insufficient balance in your account");
            return false;
        }
        setAccountBalance( getAccountBalance() - amountToWithdraw);
        System.out.printf("The amount %.2f was withdrawn successfully from account %s\n", amount, getAccountNumber());
        System.out.printf("The charges are SMS: %.2f, TRANSACTION_CHARGE: %.2f\n", SMS_CHARGE, TRANSACTION_CHARGE);
        return true;
    }

    @Override
    public final boolean deposit(double amount) {
        this.setAccountBalance(getAccountBalance() + amount);
        System.out.printf("The amount : %.2f was deposited in the account %s\n", amount, getAccountNumber());
        return true;
    }

    @Override
    public boolean transfer(ThisAccountDemo demo, double amount) {
        if( withdraw( amount ) ){
            demo.setAccountBalance(demo.getAccountBalance() + amount);
//            this.setAccountBalance(getAccountBalance() - amount);
            System.out.printf("The amount %.2f was transferred from %s to %s\n", amount, getAccountNumber(), demo.getAccountNumber());
            return true;
        }
        System.out.println("Either there is no sufficient funds or the account is not receiving deposit");
        return false;
    }

    public String getAccountType() {
        return accountType;
    }

    public double[] getLoans() {
        return loans;
    }

    public double getSMS_CHARGE() {
        return SMS_CHARGE;
    }

    public double getTRANSACTION_CHARGE() {
        return TRANSACTION_CHARGE;
    }

    @Override
    public String toString() {
        return "SavingsAccountDemo{" +
                "accountName='" + getAccountName() + '\'' +
                "accountNumber='" + getAccountNumber() + '\'' +
                "accountType='" + accountType + '\'' +
                "accountBalance='" + getAccountBalance() + '\'' +
                ", loans=" + Arrays.toString(loans) +
                ", SMS_CHARGE=" + SMS_CHARGE +
                ", TRANSACTION_CHARGE=" + TRANSACTION_CHARGE +
                '}';
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}