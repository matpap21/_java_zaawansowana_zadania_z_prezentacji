package Zadania_domowe.Zad4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainArrrayList {
    public static void main(String[] args) {
        //Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
        // - dodaj do listy losowe 100 elementów z zakresu 0-100. (konwersja int na string to
        //String.valueOf())
        // - oblicz średnią liczb
        // - usuń wszystkie liczby powyżej średniej
        // - wypisz wszystkie liczby
        // - wykonaj kopię listy do tablicy
        //
        //Sprawdź działanie aplikacji


        List<Integer> integerList = new ArrayList<> ( );

        add100RandomElements (integerList);
        addelementstoListchoosenbyuser(integerList,15);
        System.out.println ("integerlist");
        System.out.println (integerList);

        System.out.println ("integer list convertet to String");

        List<String> stringList = integerList.stream ( )
                .map (s -> String.valueOf (s))
                .collect (Collectors.toList ( ));

        System.out.println (stringList);

        System.out.println ("oblicz średnią liczb");
        double sum = 0;

        for (int i = 0; i < stringList.size ( ); i++) {
            sum = sum + i;
        }
        double avg = sum / stringList.size ( );
        System.out.println ("sum " + sum + " number of elements " + stringList.size ( ) + " gives avg " + avg);

        System.out.println ("usuń wszystkie liczby powyżej średniej");
        System.out.println ("List of values greater than avg");
        List<String> copyStringList = new ArrayList<String> (stringList);
        List<Integer> copyIntegerList = new ArrayList<> (  );

        for (int i = 0; i < integerList.size ( ); i++) {
            // jeśli trafiliśmy na liczbę mniejszą niz AVG to usuwany
            if (avg > integerList.get (i)) {
                System.out.print (i + ", " + integerList.get (i));
                integerList.remove (i);
                i = i-1;
            }else {
                copyIntegerList.add (i);
            }
        }


        System.out.println ( );
        System.out.println ("stringList after removing values greater than avg");
        System.out.println (copyIntegerList);
    }

    private static void addelementstoListchoosenbyuser(List<Integer> integerList, int wartosc) {
        //for(int i =0; i< integerList.size ( );i++){
         //   wartosc = i;
            integerList.add (wartosc);
        }


    private static void add100RandomElements(List<Integer> integerList) {
        Random random = new Random ( );

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt (100);
            integerList.add (number);
        }
    }
}

