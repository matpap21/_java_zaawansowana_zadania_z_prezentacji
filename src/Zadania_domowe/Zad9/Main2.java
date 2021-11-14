package Zadania_domowe.Zad9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<Posilek> posilekList = new ArrayList<> (Arrays.asList (
                new Posilek (642, "Sir Loun", RodzajPosiłku.STEAK, 23.0),
                new Posilek (123, "Margheritta", RodzajPosiłku.PIZZA, 13.3),
                new Posilek (123, "Konczitta", RodzajPosiłku.PIZZA, 13.3),
                new Posilek (132, "Hawajska", RodzajPosiłku.PIZZA, 19.99),
                new Posilek (132, "Farmerska", RodzajPosiłku.PIZZA, 19.99),
                new Posilek (132, "Wiejska", RodzajPosiłku.PIZZA, 19.99),
                new Posilek (231, "Ribeye", RodzajPosiłku.STEAK, 31.1),
                new Posilek (13, "Dobra Kaloria", RodzajPosiłku.SALAD, 23.50),
                new Posilek (14, "Grecka", RodzajPosiłku.SALAD, 29.50)
        ));
        System.out.println (posilekList);
        System.out.println ("wyświetl użytkownikowi dostępne produkty z listy");
        for (Posilek dostepne_posilki : posilekList) {
            System.out.println (dostepne_posilki);
        }

        RodzajPosiłku wybranyRodzajPosilku = wybranyRodzajPosilkuPrzezUzytkownika (scanner);
        Posilek wybranyPosilek = wybranaNazwaPosilkuPrzezUzytkownika (scanner, posilekList, wybranyRodzajPosilku);

        System.out.println ("Wybrano " + wybranyRodzajPosilku + " " + wybranyPosilek);
    }

    private static Posilek wybranaNazwaPosilkuPrzezUzytkownika(Scanner scanner, List<Posilek> posilekList, RodzajPosiłku rodzajPosiłku) {
        Posilek wybranyPosilek = null;
        do {
            try {
                System.out.println ("Podaj nazwe posilku");
                for (Posilek posilek : posilekList) {
                    if (posilek.getRodzajPosiłku ( ).equals (rodzajPosiłku)) {
                        System.out.println (posilek.getNazwa ( ).toUpperCase ());
                    }
                }
                String wybor_uzytkownika2 = scanner.next ( );
                for (Posilek posilek : posilekList) {
                    if (posilek.getNazwa ( ).equalsIgnoreCase (wybor_uzytkownika2.toUpperCase ( ))) {
                        wybranyPosilek = posilek;
                        break;
                    }
                }
            } catch (IllegalArgumentException iae) {
                System.err.println ("Niepoprawne dane, spróbuj ponownie");
            }
        } while (wybranyPosilek == null);
        return wybranyPosilek;
    }

    private static RodzajPosiłku wybranyRodzajPosilkuPrzezUzytkownika(Scanner scanner) {
        RodzajPosiłku rodzajPosiłku = null;
        do {
            System.out.println ("Podaj rodzaj posilku");
            for (RodzajPosiłku elementy : RodzajPosiłku.values ( )) {
                System.out.println (elementy);
            }
            String wybor_uzytkownika = scanner.next ( );
            try {
                rodzajPosiłku = RodzajPosiłku.valueOf (wybor_uzytkownika.toUpperCase ( ));
            } catch (IllegalArgumentException iae) {
                System.err.println ("Niepoprawne dane, spróbuj ponownie");
            }
        } while (rodzajPosiłku == null);
        return rodzajPosiłku;
    }
}
