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
        //if (amount > creditLimit);

        balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if ((amount < creditLimit) && (amount <= balance )
        {
            //double withdrawl = balance + (-creditLimit)
            //return withdrawl;
            balance -= creditLimit
                    return balance
        }
        {
        else if (balance == creditLimit) ;
            return 0;
        }
        }
        else
        {
            balance -= creditLimit
                return balance
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

