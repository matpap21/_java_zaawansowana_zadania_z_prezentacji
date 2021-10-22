package Zadania_domowe.Zad10;

import java.util.Optional;
import java.util.Scanner;

public class MainKoszykProduktow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        KoszykProduktow koszykProduktow = new KoszykProduktow ( );
        String komenda;

        boolean rozpoczecie = true;
        do {

            System.out.println ("Podaj komende");
            ///// JAk wysiwetlic komendy jako lista ?
            KomendyImpl komendyimpl = new KomendyImpl ();
            komendyimpl.show ();


            //////////////
            komenda = scanner.nextLine ( );

            String[] ElementyKomendy = komenda.split ("");
            String action = ElementyKomendy[0];

            //bierzemy nazwe naszego koszyka
            if (action.equalsIgnoreCase (Komendy.CenaBrutto)) {
                System.out.println ("Cena butto " + koszykProduktow.podsumujRachunekBrutto ( ));
            } else if (action.equalsIgnoreCase (Komendy.CenaNetto)) {
                System.out.println ("Cena butto " + koszykProduktow.podsumujRachunekNetto ( ));
            } else if (action.equalsIgnoreCase (Komendy.Podatek)) {
                System.out.println ("Cena butto " + koszykProduktow.zwróćWartośćPodatku ( ));
            } else if (action.equalsIgnoreCase (Komendy.Produkty)) {
                koszykProduktow.wypiszRachunek ( );
            } else if (action.equalsIgnoreCase (Komendy.DodajProdukt)) {
                Optional<Produkt> optionalProdukt = obsługaDodajProdukt (ElementyKomendy);
                if (optionalProdukt.isPresent ( )) {
                    System.err.println ("Dodano produkt");
                    koszykProduktow.dodajProdukt (optionalProdukt.get ( ));
                } else {
                    System.err.println ("Nie dodano produktu");
                }
            }else if (komenda.toUpperCase ().equalsIgnoreCase (Komendy.quit)){
                System.err.println ("Zamykam program" );
                rozpoczecie = false;
            }

        } while (rozpoczecie);
        System.err.println ("Wyjście z pętli" );
    }

    private static Optional<Produkt> obsługaDodajProdukt(String[] ElementyKomendy) {
        // dodaj / maslo / 2.3 / VAT8
        if (ElementyKomendy.length != 4) {
            // nie zwracamy produktu jeżeli nie mamy dostatecznej ilości parametrów
            System.err.println ("Niedostateczna ilosc parametrow!");
            return Optional.empty ( );
        }
        String nazwa = ElementyKomendy[1];

        Optional<Double> cenaOptional = przetworzTekstNaCene (ElementyKomendy[2]);
        if (!cenaOptional.isPresent ( )) {
            return Optional.empty ( );
        }

        Optional<PodatekProduktu> podatekProduktu = przetworzTekstNaPodatek (ElementyKomendy[3]);
        if (!podatekProduktu.isPresent ( )) {
            return Optional.empty ( );
        }

        Produkt produkt = new Produkt (nazwa,
                cenaOptional.get ( ),
                podatekProduktu.get ( ));

        return Optional.of (produkt);
    }

    public static Optional<PodatekProduktu> przetworzTekstNaPodatek(String komenda) {
        PodatekProduktu podatekProduktu;
        try {
            // przetwarzanie tekstu na podatek
            podatekProduktu = PodatekProduktu.valueOf (komenda.toUpperCase ( ));
        } catch (IllegalArgumentException iae) {
            System.err.println ("Niepoprawna wartość podatku produktu!");
            return Optional.empty ( );
        }
        return Optional.of (podatekProduktu);
    }

    public static Optional<Double> przetworzTekstNaCene(String komenda) {
        Double cena;
        try {
            // przetworzenie tekstu na double
            cena = Double.parseDouble (komenda);
        } catch (NumberFormatException nfe) {
            System.err.println ("Niepoprawna wartość ceny!");
            return Optional.empty ( );
        }
        return Optional.of (cena);
    }
}