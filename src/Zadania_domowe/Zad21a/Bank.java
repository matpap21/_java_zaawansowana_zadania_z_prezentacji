package Zadania_domowe.Zad21a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {

    private ExecutorService executorService = Executors.newFixedThreadPool (5);
    private BankAccountNumber bankAccountNumber = new BankAccountNumber ();

    public BankAccountNumber getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void putMoney(double amount){
        executorService.submit (new BankOperations (OperationType.PUT_MONEY_ON_ACCOUNT,amount,bankAccountNumber));
    }
    public void getMoney(double amount){
        executorService.submit (new BankOperations (OperationType.GET_MONEY_FROM_ACCOUNT,amount,bankAccountNumber));
    }



}
