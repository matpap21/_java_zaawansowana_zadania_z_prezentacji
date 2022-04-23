package Zadania_domowe.Zad21a;

public class BankAccountNumber {
    public Double accountBalance;
    private final Object lock = new Object ();

    public BankAccountNumber() {
        this.accountBalance = 0.0;
    }

    public void putMoney(double amount) {
        synchronized (lock) {
            this.accountBalance += amount;
        }
    }
    public void getMoney(double amount) {
        synchronized (lock) {
            this.accountBalance -= amount;
        }
    }

    public void showAccountBalance(){
        System.out.println ("Current balance is: " + accountBalance );
    }


}
