package org.bank;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<BankAccount> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<BankAccount>();
    }

    /**
     * This method is for a open an account.
     *
     * @param accountNumber;
     * @param accountHolderName;
     * @param accountBalance;
     */
    public void openAccount(String accountNumber, String accountHolderName, double accountBalance) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolderName, accountBalance);
        accounts.add(newAccount);
    }


    /**
     * This method is for a close an account.
     *
     * @param accountNumber;
     */
    public void closeAccount(String accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
//            for (BankAccount account : accounts) {
            BankAccount account = accounts.get(i);
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(i);
                break;
            }
        }
    }

    /**
     * This method take an account number and deposit method on the corresponding BankAccount object.
     *
     * @param accountNumber
     * @param amount
     */
    public void deposit(String accountNumber, double amount) {
//        for (int i = 0; i < accounts.size(); i++) {
//            BankAccount account = accounts.get(i);
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.depositingMoney(amount);
                break;
            }
        }
    }

    /**
     * This method take an account number and withdraw on the corresponding BankAccount object.
     *
     * @param accountNumber
     * @param amount
     */
    public void withdraw(String accountNumber, double amount) {
//            for (int i = 0; i < accounts.size(); i++) {
//                BankAccount account = accounts.get(i);
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdrawingMoney(amount);
                break;
            }
        }
    }

    /**
     * This method return the total balance as a double.
     */
    public double balance(String accountNumber) {
        double sum = 0.0;
        for (int i = 0; i < accounts.size(); i++) {
            BankAccount account = accounts.get(i);
            sum += account.checkingTheCurrentAccount();
        }
        return sum;
    }
}


