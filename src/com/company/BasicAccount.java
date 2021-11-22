package com.company;

public class BasicAccount extends StandardAccount {

    protected double withdrawlLimit;

    public BasicAccount(int accountNumber, double withdrawlLimit) {

        super(accountNumber, 0);

        this.withdrawlLimit = withdrawlLimit;

    }


    @Override
    public double Withdraw(double amount) {

        if (amount > withdrawlLimit) {

            balance -= withdrawlLimit;
            return withdrawlLimit;
        } else {
            balance -= amount;
            return amount;
        }
    }
}


