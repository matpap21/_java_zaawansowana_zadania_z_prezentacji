package Zadania_domowe.Zad16;

import Zadania_domowe.Zad15.BrakOCenStudentaExeption;

import java.util.ArrayList;

public class MainMapa {
    public static void main(String[] args) {


        DziennikMapa dziennikMapa = new DziennikMapa ( );
        dziennikMapa.dodajStudenta(new Student("Marian", "Nowak", "100100", new ArrayList<> ()));
        dziennikMapa.dodajStudenta(new Student("Marian", "Kowalski", "100101", new ArrayList<>()));
        dziennikMapa.dodajStudenta(new Student("Marian", "Skalski", "100102", new ArrayList<>()));
        dziennikMapa.dodajStudenta(new Student("Marian", "Kowal", "100103", new ArrayList<>()));
        dziennikMapa.dodajStudenta(new Student("Marian", "Skalski", "100104", new ArrayList<>()));

        dziennikMapa.dodajOcene ("100100", 5.0);
        dziennikMapa.dodajOcene ("100100", 5.0);
        dziennikMapa.dodajOcene ("100101", 5.0);
        dziennikMapa.dodajOcene ("100101", 5.0);
        dziennikMapa.dodajOcene ("100102", 4.0);
        dziennikMapa.dodajOcene ("100102", 2.0);
        dziennikMapa.dodajOcene ("100104", 3.0);


        System.out.println (dziennikMapa.zwróćStudenta ("100100") );
        System.out.println (dziennikMapa.posortujStudentówPoIndeksie () );

        try {
            System.out.println (dziennikMapa.podajŚredniąStudenta ("100100") );
            System.out.println (dziennikMapa.podajŚredniąStudenta ("100101") );
            System.out.println (dziennikMapa.podajŚredniąStudenta ("100102") );
        } catch (BrakOCenStudentaExeption e) {
            System.err.println ("Podany Student nie ma ocen" );
        }
        System.err.println (dziennikMapa.podajStudentówZagrożonych () );
    }
}
