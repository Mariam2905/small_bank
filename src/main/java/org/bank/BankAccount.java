package org.bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Money depositing method.
     *
     * @param amount;
     */
    public void depositingMoney(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("You cannot add a negative amount.");
            }
            System.out.println("You are added " + amount + " money.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        accountBalance += amount;
        System.out.println("Your account balance after depositing is: " + accountBalance);
    }

    /**
     * Money withdrawal method.
     * Withdraw only if total money greater than or equal to the money requested for withdrawal.
     *
     * @param amount;
     */
    public void withdrawingMoney(double amount) {
        try {
            if (amount > accountBalance) {
                throw new IllegalArgumentException("Your account balance is insufficient․");
            } else {
                accountBalance -= amount;
                System.out.println("Your balance after withdraw is: " + accountBalance);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * This method show the current balance
     *
     * @return accountBalance;
     */
    public double checkingTheCurrentAccount() {
        System.out.println("Your current balance is: " + accountBalance);
        return accountBalance;
    }
}


