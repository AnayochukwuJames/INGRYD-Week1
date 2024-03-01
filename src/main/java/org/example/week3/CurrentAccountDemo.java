package org.example.week3;

import java.util.Arrays;

public final class CurrentAccountDemo extends SavingsAccountDemo {

    private static final double CURRENT_ACCOUNT_TRANSACTION_CHARGE = 50.0;

    public CurrentAccountDemo(String actNo, String accountName, double balance ){
        super(actNo, accountName, balance);
        this.setAccountType("CURRENT");
    }

    public CurrentAccountDemo( String actNo, String accountName ){
        this(actNo, accountName, 0.0);
    }

    @Override
    public boolean withdraw(double amount) {
        double amountToWithdraw = (amount + getSMS_CHARGE() + CURRENT_ACCOUNT_TRANSACTION_CHARGE);
        if( getAccountBalance() < amountToWithdraw){
            System.out.println("There is insufficient balance in your account");
            return false;
        }
        setAccountBalance( getAccountBalance() - amountToWithdraw);
        System.out.printf("The amount %f was withdrawn successfully from account %s\n", amount, getAccountNumber());
        System.out.printf("The charges are SMS: %f, TRANSACTION_CHARGE: %f", getSMS_CHARGE(), CURRENT_ACCOUNT_TRANSACTION_CHARGE);
        return true;
    }

    @Override
    public boolean transfer(ThisAccountDemo demo, double amount) {
        if( withdraw( amount ) ){
            demo.setAccountBalance(demo.getAccountBalance() + amount);
//            this.setAccountBalance(getAccountBalance() - amount);
            System.out.printf("The amount %f was transferred from %s to %s", amount, getAccountNumber(), demo.getAccountNumber());
            System.out.printf("The charges are SMS: %f, TRANSACTION_CHARGE: %f", getSMS_CHARGE(), CURRENT_ACCOUNT_TRANSACTION_CHARGE);
            return true;
        }
        System.out.println("Either there is no sufficient funds or the account is not receiving deposit");
        return false;
    }

    @Override
    public String toString() {
        return "CurrentAccountDemo{" +
                "accountName='" + getAccountName() + '\'' +
                "accountNumber='" + getAccountNumber() + '\'' +
                "accountType='" + getAccountType() + '\'' +
                "accountBalance='" + getAccountBalance() + '\'' +
                ", loans=" + Arrays.toString(getLoans()) +
                ", SMS_CHARGE=" + getSMS_CHARGE() +
                ", TRANSACTION_CHARGE=" + CURRENT_ACCOUNT_TRANSACTION_CHARGE +
                '}';
    }
}