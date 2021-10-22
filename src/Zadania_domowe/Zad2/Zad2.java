package Zadania_domowe.Zad2;

import java.util.*;

public class Zad2 {
    public static <T> void main(String[] args) {
        //Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
        // - dodaj do listy 10 liczb losowych
        // - oblicz sumę elementów na liście (wypisz ją)
        // - oblicz średnią elementów na liście (wypisz ją)
        // - stwórz kopię listy i ją posortuj: (Collections.sort( listaDoPosortowania) - sortuje listę)
        //(przykład użycia Collections.sort(lista):
        //ArrayList<Integer> liczby = new ArrayList<>();
        //liczby.add(5);
        //liczby.add(10);
        //liczby.add(15);
        //Collections.sort(liczby);
        // - podaj medianę elementów na liście posortowanej (wypisz ją)
        // - znajdź największy i najmniejszy element na liście która nie była sortowana. Zrób to pętlą for
        // - po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for
        // - po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof

        Random random = new Random ( );
        List<Integer> integerList = new ArrayList<> ( );

        for (int i = 0; i < 10; i++) {
            int liczba = random.nextInt (50);
            integerList.add (liczba);
        }
        System.out.println ("========================");
        System.out.println (integerList);

        System.out.println ("========================");
        System.out.println ("SUMA");
        int suma = 0;
        for (Integer element : integerList) {
            suma = suma + element;
        }
        System.out.println (suma);

        System.out.println ("========================");
        System.out.println ("SREDNIA");
        double avg = suma / (double) integerList.size ( );
        System.out.println (avg);

        System.out.println ("========================");
        System.out.println ("KOPIA Listy posortowana");
        List<Integer> kopialisty = new ArrayList<> (integerList);
        Collections.sort (kopialisty);
        System.out.println (kopialisty);

        System.out.println ("========================");
        System.out.println ("MEDIANA");
        double mediana;
        if (kopialisty.size ( ) % 2 == 0) {

            int element1 = kopialisty.get ((kopialisty.size ( ) / 2) - 1);
            int element2 = kopialisty.get ((kopialisty.size ( ) / 2));
            System.out.println ("ELEMENTY" );
            System.out.println (element1 );
            System.out.println (element2 );
            mediana = (element1 + element2) / 2.0;
        } else {
            mediana = kopialisty.get ((kopialisty.size ( ) / 2));
        }

        System.out.println (mediana);

        System.out.println ("========================");


        int min = integerList.get (0);
        int max = integerList.get (0);
        for (int i =0; i< integerList.size ( );i++){
            if(min > integerList.get (i)){
                min = integerList.get (i);
            }
            if(max <integerList.get (i)){
                max= integerList.get (i );
            }
        }
        System.out.println ("MIN");
        System.out.println (min );
        System.out.println ("MAX");
        System.out.println (max );

        System.out.println ("========================");


        int indexmin = integerList.indexOf (min );
        int indexmax = integerList.indexOf (max );


        System.out.println("Max index: " + indexmax + " Min index: " + indexmin);
        // - po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof
        System.out.println("Min index: " + integerList.indexOf(max) + " Min index: " + integerList.indexOf(min));

    }

}

