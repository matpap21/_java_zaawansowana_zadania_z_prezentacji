package Zadania_domowe.Zad9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        List<Posilek> posilekList = new ArrayList<> (Arrays.asList (

                new Posilek (1250,"Dobra Kaloria",RodzajPosiłku.SALAD,8.00),
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

        for (Posilek listaWszystkichPosilkow: posilekList){
            System.out.println (listaWszystkichPosilkow );
        }


        RodzajPosiłku rodzajPosiłkuUzytkownika=  wyborRodzajuPosilkuprzezUzytkownika(scanner);
        Posilek nazwaPosilkuUzytkownika = wyborNazwyPosilkuPrzezUzytkownika(scanner,rodzajPosiłkuUzytkownika,posilekList);

        System.out.println ("Wybrano " + rodzajPosiłkuUzytkownika + " " + nazwaPosilkuUzytkownika);

    }

    private static Posilek wyborNazwyPosilkuPrzezUzytkownika(Scanner scanner, RodzajPosiłku rodzajPosiłkuUzytkownika, List<Posilek> posilekList) {
        Posilek nazwaPosilkuUzytkownika = null;

        do{
            try{
                System.out.println ("Podaj nazwe posilku" );
                for (Posilek posilek : posilekList){
                    if(posilek.getRodzajPosiłku ().equals (rodzajPosiłkuUzytkownika)){
                        System.err.println (posilek.getNazwa ().toUpperCase () );
                    }
                }
                String wyborUzytkownika2 = scanner.next ( );
                for (Posilek posilek: posilekList){
                    if(posilek.getNazwa ().equalsIgnoreCase (wyborUzytkownika2.toUpperCase ())){
                        nazwaPosilkuUzytkownika =posilek;
                        break;
                    }
                }

            }catch (IllegalArgumentException iae){
                System.err.println ("Niepoprawny wybór, spróbuj ponownie" );
            }

        }while (nazwaPosilkuUzytkownika ==null);

        return nazwaPosilkuUzytkownika;
    }

    private static RodzajPosiłku wyborRodzajuPosilkuprzezUzytkownika(Scanner scanner) {
        RodzajPosiłku rodzajPosiłkuUzytkownika = null;
        do{
            try{
                System.out.println ("Rodzaje posiłków do wyboru" );
                for (RodzajPosiłku rodzajPosiłku: RodzajPosiłku.values ()){
                    System.out.println (rodzajPosiłku );
                }

                String wyborUzytkownika = scanner.next ( );
                rodzajPosiłkuUzytkownika = RodzajPosiłku.valueOf (wyborUzytkownika.toUpperCase ());

            }catch (IllegalArgumentException iae){
                System.err.println ("Niepoprawny wybór, spróbuj ponownie" );
            }

        }while (rodzajPosiłkuUzytkownika ==null);

        return rodzajPosiłkuUzytkownika;
    }
}
