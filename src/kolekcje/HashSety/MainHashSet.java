package kolekcje.HashSety;

import java.util.*;

public class MainHashSet {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<> (Arrays.asList (12, 10, 10, 10, 3, 4, 12, 12, 300, 12, 40, 55));

        //Wypisz liste elementow na ekran
        System.out.println ("Wypisz liste elementow na ekran");
        System.out.println (hashSet.size ( ));

        //Wypisz wszystkie elementy zbioru na ekran
        System.out.println ("Wypisz wszystkie elementy zbioru na ekran");
        for (Integer elementy : hashSet) {
            System.out.println (elementy);
        }
        //Usun elementy 10 i 12" wykonaj podpunty powyzej
        System.out.println ("Usun elementy 10 i 12" );
        hashSet.remove (10);
        hashSet.remove (12);


        //Wypisz liste elementow na ekran
        System.out.println ("Wypisz liste elementow na ekran");
        System.out.println (hashSet.size ( ));

        //Wypisz wszystkie elementy zbioru na ekran
        System.out.println ("Wypisz wszystkie elementy zbioru na ekran");
        for (Integer elementy : hashSet) {
            System.out.println (elementy);
        }
        System.out.println ("Change HashSet to TreeSet" );
        Set<Integer> changeSet_to_TreeSet =  new TreeSet<Integer> ( hashSet );
        System.out.println (changeSet_to_TreeSet );

        for (Integer elementy: changeSet_to_TreeSet
             ) {
            System.out.println (elementy );
        }


    }
}
