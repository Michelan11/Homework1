package com.company;

public class PremiumAccount extends StandardAccount {
    public PremiumAccount(int accountNumber) {

        super(accountNumber,0);

    }

    public double Withdraw(double amount) {

        balance -= amount;
            return amount;

    }
}
