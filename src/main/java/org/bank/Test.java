package org.bank;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("123", "Mariam", 12000);
        obj.depositingMoney(2000);
        obj.withdrawingMoney(3000);
        obj.checkingTheCurrentAccount();
        ArrayList<BankAccount> accounts = new ArrayList<>();
        BankAccount account1 = new BankAccount("123", "Serob", 25000);
        BankAccount account2 = new BankAccount("137", "Toma", 34000);
        accounts.add(account1);
        accounts.add(account2);
        Bank bank = new Bank("HSBC");
        bank.openAccount("157", "Sona", 21000);
    }
}
