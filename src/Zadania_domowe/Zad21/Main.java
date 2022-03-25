package Zadania_domowe.Zad21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank ();
        Scanner scanner =new Scanner (System.in);


        for (int i = 0; i < 10000; i++) {
            if(i%2 ==0){
                bank.getKontoBankowe2 ().wplata (5);
            }else {
                bank.getKontoBankowe2 ().wyplata (5);
            }
        }

        String komenda;
        boolean praca = true;

      do{
          komenda = scanner.nextLine ( );

          if(komenda.toUpperCase ().equalsIgnoreCase ("STAN") || komenda.toUpperCase ().equalsIgnoreCase ("CHECK")){
              bank.getKontoBankowe2 ().wypiszStanKontaBankowego ();
          }else if (komenda.equalsIgnoreCase ("quit")){
              System.out.println ("Zamykam program" );
              praca = false;

          }

      }while (praca);
        System.out.println ("Opuszczam petle" );



    }
}
