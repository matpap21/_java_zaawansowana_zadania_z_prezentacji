package Zadania_domowe.Zad6;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MainTreeMap {
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

        Map<Long, Student> studentMap = new TreeMap<> (Comparator.reverseOrder ( ));
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

        System.out.println ("==========================================");
        boolean status100200L = CheckifMapContainsStudent (studentMap, 100200L);
        boolean status100400L = CheckifMapContainsStudent (studentMap, 100400L);


        Student studentwithindeks100200L = studentMap.get (100400L);
        System.out.println (studentwithindeks100200L);
        System.out.println ("======================");

        System.out.println ("wypisz listę studentów");
        for (Student studenci : studentMap.values ( )) {
            System.out.println (studenci);
        }


        System.out.println ("======================");
        System.out.println ("wypisz listę indeksów ");
        for (Long indeksy : studentMap.keySet ( )) {
            System.out.println (indeksy);
        }

    }

    private static boolean CheckifMapContainsStudent(Map<Long, Student> studentMap, long value) {
        boolean status = studentMap.containsKey (value);
        System.out.println ("Map has Student with indeks " + value + " ? " + status);

        return status;
    }
}


