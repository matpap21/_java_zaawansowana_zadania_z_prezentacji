package Zadania_domowe.Zad21a;

public class BankOperations implements Runnable{
    private OperationType operationType;
    private double amount;
    private BankAccountNumber bankAccountNumber;

    public BankOperations(OperationType operationType, double amount, BankAccountNumber bankAccountNumber) {
        this.operationType = operationType;
        this.amount = amount;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void run() {
        if(operationType == OperationType.PUT_MONEY_ON_ACCOUNT){
            bankAccountNumber.putMoney (amount);
        }else if (operationType == OperationType.GET_MONEY_FROM_ACCOUNT){
            bankAccountNumber.getMoney (amount);
        }
    }
}
