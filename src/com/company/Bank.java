package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank<myList> implements IBank {

    List<IAccount> myList = new ArrayList<IAccount>();

    public Bank() { }


    @Override
    public void OpenAccount(IAccount account) {
        myList.add(account);
    }


    @Override
    public void CloseAccount(int accountNumber) {
        if (myList.contains(accountNumber) && (balance> 0)) {

                myList.remove(accountNumber);

            }else if (myList.contains(accountNumber) && ( balance < 0 )) {

                System.out.println("The Account is not closed due to debt");
            }
        }


    @Override
    public List<IAccount> GetAllAccounts() {

        for(int i=0;i<myList.size();i++);
         myList.get(account);

    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {

        for(int i=0;i<myList.size();i++)
            myList.get( IAccount< 0) ;

    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        if (balanceAbove < accounts)

            return accounts

    }

}
