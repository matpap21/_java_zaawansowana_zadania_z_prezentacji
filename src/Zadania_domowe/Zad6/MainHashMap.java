package Zadania_domowe.Zad6;

//Utwórz klasę Student o polach (long) numerIndeksu, imie,
//nazwisko oraz:
//- utwórz kilku studentów i dodaj ich do mapy (kluczem jest
//indeks,
//- sprawdź czy mapa zawiera studenta o indeksie 100200,
//- wypisz studenta o indeksie 100400
//- wypisz listę studentów
//- wypisz listę indeksów
//Stwórz drugiego main’a i wykonaj te same instrukcje, ale zamień
//implementację z HashMap na TreeMap

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Student s10 = new Student (100200L, "Jan", "Kowalski");
        Student s11 = new Student (100201L, "Marian", "Kowalski");
        Student s12 = new Student (100202L, "Lukasz", "Podkladka");
        Student s13 = new Student (100203L, "Asia", "Rosol");
        Student s14 = new Student (100204L, "Basia", "Kubek");
        Student s15 = new Student (100205L, "Tosia", "Lyzka");
        Student s16 = new Student (100206L, "Zosia", "Myszka");
        Student s17 = new Student (100207L, "Piotr", "Dlugopis");
        Student s20 = new Student (100400L, "Jan", "Nowak");

        Map<Long, Student> studentMap = new HashMap<> ( );
        studentMap.put (s10.getIndeks ( ), s10);
        studentMap.put (s11.getIndeks ( ), s11);
        studentMap.put (s12.getIndeks ( ), s12);
        studentMap.put (s13.getIndeks ( ), s13);
        studentMap.put (s14.getIndeks ( ), s14);
        studentMap.put (s15.getIndeks ( ), s15);
        studentMap.put (s16.getIndeks ( ), s16);
        studentMap.put (s17.getIndeks ( ), s17);
        studentMap.put (s20.getIndeks ( ), s20);

        // sprawdzenie czy zawiera studenta
        // dopasowanie typów (dopisujemy Long, ponieważ kluczem jest Long)

        if (studentMap.containsKey (100200L)) {
            System.out.println ("Zawiera studenta o indeksie 100200");
        } else {
            System.out.println ("Nie zawiera studenta o indeksie 100200");
        }
        System.out.println ( );
        boolean status = CheckifMapContainsStudent (studentMap, 100200L);
        boolean status2 = CheckifMapContainsStudent (studentMap, 100400L);


        Student studentwithindeks100200L = studentMap.get (100200L);
        System.out.println (studentwithindeks100200L);
        System.out.println ("======================");

        Student studentwithindeks100400L = studentMap.get (100400L);
        System.out.println (studentwithindeks100400L);
        System.out.println ("======================");

        System.out.println ("wypisz listę studentów");
        for (Student student : studentMap.values ( )) {
            System.out.println (student);
        }


        System.out.println ("======================");
        System.out.println ("wypisz listę indeksów ");
        for (Long indeksy : studentMap.keySet ( )) {
            System.out.println (indeksy);
        }
    }




    private static boolean CheckifMapContainsStudent(Map<Long, Student> studentMap, long value) {
        boolean contains = studentMap.containsKey (value);
        System.out.println ("Map has Student with indeks " + value + " ? " + contains);
        return contains;
    }
}
