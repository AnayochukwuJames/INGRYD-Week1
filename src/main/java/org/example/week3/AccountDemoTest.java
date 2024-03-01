package org.example.week3;

public class AccountDemoTest {
    public static void main(String[] args) {

        ThisAccountDemo savingAccount = new SavingsAccountDemo("005300331", "Anayochukwu James");
        savingAccount.setAccountBalance(500000);
        ThisAccountDemo currentAccount = new CurrentAccountDemo("0045484871", "Ugwuodoke Micheal");
        currentAccount.setAccountBalance(800000);

        System.out.println(savingAccount);
        System.out.println(currentAccount);

        savingAccount.deposit(1000000);
        System.out.println(savingAccount);
        System.out.println();

        savingAccount.withdraw(5000000);
        System.out.println(savingAccount);
        System.out.println();

        savingAccount.transfer(currentAccount, 200000);
        System.out.println(savingAccount);
        System.out.println(currentAccount);

        System.out.println(ThisAccountDemo.getUserCount());


    }
}