package com.company;

import java.util.ArrayList;
import java.util.List;

public class TheBank<myList> implements IBank {

    myList = new ArrayList<string>();

    public Bank() { }


    @Override
    public void OpenAccount(IAccount account) {
        return myList.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        if (myList.contains(accountNumber))
        {
          if (myList.get(accountNumber) > 0)
          {
              myList.remove(accountNumber)
          }
          else
          {
              System.out.println("The Account is not closed due to debt")
          }
        }

    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return myList.get(account);
        //for loop?
        //get accounts?
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        //getall accounts + if <0 return
        return null;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        return null;
    }
}
