package Zadania_domowe.Zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.io.File.separator;

public class Zadanie3 {
    public static void main(String[] args) {


        //Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
        // - dodaj do listy elementy 10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355,
        //2222, 1111, 3546, 138751, 235912 (jako stringi) (dodaj je posługując się metodą
        //Arrays.asList())
        //Przykład użycia Arrays.asList():
        //ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
        //Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonać
        //na liście String’ów.
        // - określ indeks elementu 138751 posługując się metodą indexOf
        // - sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
        // - sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
        // - usuń z listy obiekt 67888 oraz 67889 (metoda remove)
        // - wykonaj ponownie powyższe sprawdzenia.
        // - iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element w oddzielnej
        //linii).
        //Sprawdź działanie aplikacji.


        List<String> stringList;
        stringList = new ArrayList (Arrays.asList ("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355", "2222",
                "1111", "3546", "138751", "235912"));


        System.out.println ("LISTA");
        System.out.println (stringList);

        System.out.println ("określ indeks elementu 138751 posługując się metodą indexOf");
        int index = znajdzElementNaIndeksie (stringList, "138751");

        System.out.println ("sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran");
        boolean contains = sprawdzCzyZawieraElement (stringList, "67888");

        System.out.println ("sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran");
        contains = sprawdzCzyZawieraElement (stringList, "67889");

        System.out.println ("usuń z listy obiekt 67888 oraz 67889 (metoda remove");
        stringList.remove ("67888");
        stringList.remove ("67889");

        System.out.println ("iteruj całą listę, wypisz elementy na ekran  w jednej linii");
        for (String elementy : stringList) {
            System.out.print (elementy + " - ");
        }

        System.out.println ("iteruj całą listę, wypisz elementy na ekran  każdy element w oddzielnej linii");
        for (String elementy : stringList) {
            System.out.println (elementy);

        }

    }


    private static boolean sprawdzCzyZawieraElement(List<String> stringList, String wartoscszukana) {
        boolean contains = stringList.contains (wartoscszukana);
        System.out.println ("Czy udało się znaleźć wartość " + wartoscszukana + ": " + contains);
        return contains;
    }

    private static int znajdzElementNaIndeksie(List<String> stringList, String wartoscszukana) {
        int index = stringList.indexOf (wartoscszukana);
        if (index != -1) {
            System.out.println ("Indeks wartości to : " + index);
        } else {
            System.out.println ("Nie znaleziono wartości " + wartoscszukana);
        }
        return index;
    }
}
