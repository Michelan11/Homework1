package com.company;

public class StandardAccount implements IAccount {

    protected int accountNumber;
    protected double creditLimit;
    protected double balance;


    public StandardAccount(int accountNumber,double creditLimit) {

        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.balance = 0;

    }

    @Override
    public void Deposit(double amount) {

        balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (creditLimit > 0) {
            return creditLimit = 0;

        } else if ((amount > creditLimit) || (amount == creditLimit)){

            balance -= amount;
                    return amount;

        } else {

            balance -= creditLimit;
                return creditLimit;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }

}

