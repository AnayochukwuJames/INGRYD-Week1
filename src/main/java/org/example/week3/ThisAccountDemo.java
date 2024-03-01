package org.example.week3;

public abstract class ThisAccountDemo {

    private String accountNumber;
    private String accountName;
    private double accountBalance;
    private final String ACCOUNT_BRANCH;
    private static int userCount = 0;

    public ThisAccountDemo(String actNo, String accountName, double balance){
        this.accountNumber = actNo;
        this.accountName = accountName;
        this.accountBalance = balance;
        ACCOUNT_BRANCH = "Ingryd Branch";
        userCount++;
    }

    public ThisAccountDemo(String accountNumber, String accountName){
        this(accountNumber, accountName, 0.0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getACCOUNT_BRANCH() {
        return ACCOUNT_BRANCH;
    }

    public static int getUserCount() {
        return userCount;
    }

    public abstract boolean withdraw(double amount);
    public abstract boolean deposit( double amount );
    public abstract boolean transfer( ThisAccountDemo demo, double amount );



}