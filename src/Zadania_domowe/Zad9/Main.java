package Zadania_domowe.Zad9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Posilek> posilekLists = new ArrayList<> (Arrays.asList (
                new Posilek (642, "Sirloin", RodzajPosiłku.STEAK, 23.0),
                new Posilek (123, "Margheritta", RodzajPosiłku.PIZZA, 13.3),
                new Posilek (123, "Konczitta", RodzajPosiłku.PIZZA, 13.3),
                new Posilek (132, "Hawajska", RodzajPosiłku.PIZZA, 19.99),
                new Posilek (132, "Farmerska", RodzajPosiłku.PIZZA, 19.99),
                new Posilek (132, "Wiejska", RodzajPosiłku.PIZZA, 19.99),
                new Posilek (231, "Ribeye", RodzajPosiłku.STEAK, 31.1),
                new Posilek (13, "Bleh", RodzajPosiłku.SALAD, 23.50),
                new Posilek (14, "Fu", RodzajPosiłku.SALAD, 29.50)

        ));


        System.out.println ("wyświetl użytkownikowi dostępne produkty z listy");
        for (Posilek dostepneprodukty : posilekLists) {
            System.out.println (dostepneprodukty);
        }

        System.out.println ("================================================");

        RodzajPosiłku rodzajPosiłku = wybranyRodzajPosilkuprzezUzytkownika (scanner);
        String Nazwaposilku = wybranaNazwaPosilkuprzezUzytkownika (posilekLists, scanner);

        System.out.println ("Wybrano " + rodzajPosiłku + " " + Nazwaposilku);


    }

    private static String wybranaNazwaPosilkuprzezUzytkownika(List<Posilek> posilekLists, Scanner scanner) {
        String NazwaPosilku = null;

        do {
            try {
                System.out.println ("Podaj nazwe posilku");
                for (Posilek posilek : posilekLists) {
                    System.out.println (posilek.getNazwa ( ).toUpperCase ( ));
                }
                String wyboruzytkownika2 = scanner.next ( );
                NazwaPosilku = String.valueOf (wyboruzytkownika2.toUpperCase ( ).contains (Posilek.class.getName ( ).toUpperCase ( )));

            } catch (IllegalArgumentException iae) {
                System.err.println ("Niepoprawny wybór, powtórz");
            }

        } while (NazwaPosilku == null);
        return NazwaPosilku;
    }


    private static RodzajPosiłku wybranyRodzajPosilkuprzezUzytkownika(Scanner scanner) {
        RodzajPosiłku rodzajPosiłku = null;
        do {
            System.out.println ("Podaj rodzaj posilku");
            for (RodzajPosiłku elementy : RodzajPosiłku.values ( )) {
                System.out.println (elementy);
            }
            String wyboruzytkownika = scanner.next ( );

            try {

                rodzajPosiłku = RodzajPosiłku.valueOf (wyboruzytkownika.toUpperCase ( ));

            } catch (IllegalArgumentException iae) {
                System.out.println ("Niepoprawny wybór, powtórz.");
            }

        } while (rodzajPosiłku == null);
        return rodzajPosiłku;
    }


}
