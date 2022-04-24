package Zadania_domowe.Zad17.a;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CitizenRegister citizenRegister = new CitizenRegister ();
        Scanner scanner = new Scanner (System.in);
        String komenda;

        boolean uruchomiony = true;
        do {
            komenda = scanner.nextLine ( );
            System.out.println (komenda );
            //podzial komendy na slowa
            String[] slowa = komenda.split (" ");
            String akcja = slowa[0];


            if(komenda.equalsIgnoreCase ("dodaj")){
                citizenRegister.addCitizen (slowa[1],slowa[2],slowa[3] );
            }if (komenda.equalsIgnoreCase ("znajdz-pesel")){
                Optional<Citizen> optionalCitizen = citizenRegister.FindPersonByPesel (slowa[1]);
                System.out.println (optionalCitizen );

            }else if(komenda.equalsIgnoreCase ("quit")){
                System.out.println ("Exit the program" );
                uruchomiony= false;
            }

        }while (uruchomiony);
        System.out.println ("Out of register" );


    }
}
