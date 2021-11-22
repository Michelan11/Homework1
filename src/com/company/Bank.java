package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank<myList> extends StandardAccount implements IBank {

    List<IAccount> myList = new ArrayList<IAccount>();

    public Bank(int accountNumber, double creditLimit) {
        super(accountNumber, creditLimit);
    }

    @Override
    public void OpenAccount(IAccount account) {

        myList.add(account);
    }


    @Override
    public void CloseAccount(int accountNumber) {
        if (myList.contains(accountNumber) && (balance >= 0)) {

            myList.remove(accountNumber);

        } else if (myList.contains(accountNumber) && (balance < 0)) {

            System.out.println("The Account is not closed due to debt");
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {

        for (int i = 0; i < myList.size(); i++) ;
            myList.get(accountNumber);

        return myList;
    }

    @Override
    public ArrayList<Integer> GetAllAccountsInDebt() {

        ArrayList<Integer> GetAllAccountsInDebt = new ArrayList<>();

        for (int i = 0; i < myList.size(); i++)
            if (balance < 0) ;
        boolean add = GetAllAccountsInDebt.add(accountNumber);
        return GetAllAccountsInDebt;
    }


    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {

        List<IAccount> GetAllAccountsWithBalance = new ArrayList<IAccount>();

        for (int i = 0; i < myList.size(); i++)

        if (balanceAbove*2 < balance)

            GetAllAccountsWithBalance.get(accountNumber);
        return GetAllAccountsWithBalance;
    }

}
