package Zadania_domowe.Zad15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dziennik dziennik = new Dziennik ();

        dziennik.dodajStudenta (new Student ("Zenon", "Martyniuk","100100", new ArrayList<> (  )));
        dziennik.dodajStudenta (new Student ("Marian", "Kowalski","100101", new ArrayList<> (  )));
        dziennik.dodajStudenta (new Student ("Marian", "Nowak","100102", new ArrayList<> (  )));

        dziennik.dodajOcene ( ("100100"),3.0);

        System.out.println (dziennik.posortujStudentówPoIndeksie () );

        dziennik.dodajOcene ("100100", 5.0);
        dziennik.dodajOcene ("100101", 3.0);
        dziennik.dodajOcene ("100101", 4.0);

        try{
            System.out.println (dziennik.podajSredniaStudenta ("100100") );
            System.out.println (dziennik.podajSredniaStudenta ("100101") );
            System.out.println (dziennik.podajSredniaStudenta ("100102") );

        }catch (BrakOCenStudentaExeption bose){
            System.out.println ("Poniewaz, indeks 100102 nie ma ocen" );
        }

        System.out.println ("Studenci zagrozeni: "+  dziennik.podajStudentówZagrożonych () );

    }
}
