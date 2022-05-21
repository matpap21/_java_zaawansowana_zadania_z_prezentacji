package Zadania_domowe.Zad21a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank ();

        for (int i = 0; i < 1000; i++) {
            if (i%2 ==0){
                bank.putMoney (5);
            }else {
                bank.getMoney (5);
            }
        }

        Scanner scanner =new Scanner (System.in);
        String command;
        boolean active = true;

        do {
            command = scanner.nextLine ();
            System.out.println (command );

            if(command.toUpperCase ().equalsIgnoreCase ("SHOW")
            || command.toUpperCase ().equalsIgnoreCase ("CHECK")){
                bank.getBankAccountNumber ().showAccountBalance ();
            }else if (command.toUpperCase ().equalsIgnoreCase ("QUIT")){
                active = false;
            }

        }while (active);




    }
}
