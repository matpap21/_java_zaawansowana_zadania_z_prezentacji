package Zadania_domowe.Zad12.AbstrakcjaZolnierz;

import java.util.Scanner;

public class MainZolnierzeiCywile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj imie:");
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.nextLine();

        System.out.println("Czy jesteś żołnierzem?");
        String odpowiedz = scanner.nextLine();

        Person person;
        if(odpowiedz.toUpperCase ().contains ("TAK") || odpowiedz.toUpperCase ().contains ("YES")){
        Ranga ranga = null;

        do{
            try {
                System.out.println("Podaj swoją rangę:");
                String wejsieUzytkownika = scanner.nextLine ();
                ranga = Ranga.valueOf (wejsieUzytkownika.toUpperCase ());
            }catch (IllegalArgumentException iae){
                System.err.println("Błąd, wprowadź ponownie.");
            }
        }while (ranga==null);

        person = new Zolnierz (imie,nazwisko,ranga);


    }else {
            person = new Cywil (imie,nazwisko);
        }
        person.przedstawSie ();
    }
}
