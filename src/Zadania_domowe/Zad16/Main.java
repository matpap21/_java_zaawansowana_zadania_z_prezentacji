package Zadania_domowe.Zad16;

import Zadania_domowe.Zad15.BrakOCenStudentaExeption;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dziennik dziennik = new Dziennik ();

        dziennik.dodajStudenta(new Student("Marian", "Nowak", "100100", new ArrayList<>()));
        dziennik.dodajStudenta(new Student("Marian", "Kowalski", "100101", new ArrayList<>()));
        dziennik.dodajStudenta(new Student("Marian", "Skalski", "100200", new ArrayList<>()));

        dziennik.dodajOcene ("100100", 5.0);
        dziennik.dodajOcene ("100100", 5.0);
        dziennik.dodajOcene ("100101", 5.0);
        dziennik.dodajOcene ("100101", 4.0);

        System.out.println (dziennik.posortujStudentow () );

        try {
            System.out.println (dziennik.podajŚredniąStudenta ("100100") );
            System.out.println (dziennik.podajŚredniąStudenta ("100101") );
            System.out.println (dziennik.podajŚredniąStudenta ("100200") );
        } catch (BrakOCenStudentaExeption e) {
            System.out.println("Mieliśmy błąd, 100200 nie ma ocen");
        }
        System.out.println ("Lista Studentow zagrozonych"+ dziennik.podajStudentówZagrożonych () );

    }
}
