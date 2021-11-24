package Zadania_domowe.Zad17;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RejestrObywateli rejestrObywateli = new RejestrObywateli ();
        Scanner scanner = new Scanner (System.in);
        String komenda;

        boolean uruchomiony = true;
        do{
            komenda = scanner.nextLine ();
            System.out.println (komenda );
            //podzial komendy na slowa
            String[] slowa = komenda.split (" ");
            String akcja = slowa[0];

            if(komenda.equalsIgnoreCase ("dodaj")){
                rejestrObywateli.dodajObywatela (slowa[1],slowa[2],slowa[3] );

            }if(komenda.equalsIgnoreCase ("zmajdz_pesel")){
                Optional<Obywatel> obywatelOptional = rejestrObywateli.znajdźObywatelaPoPeselu (slowa[1]);
                System.out.println (obywatelOptional );

            }else if (komenda.equalsIgnoreCase ("quit")){
                System.out.println ("Zamykam program" );
                uruchomiony = false;
            }
        }while (uruchomiony);
        System.out.println ("Opuszczam pętle" );
    }
}
