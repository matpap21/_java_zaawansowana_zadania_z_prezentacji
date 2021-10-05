package Zad1;

import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {

        // deklaracja listy
        List<Integer> list = new ArrayList<>();
        // deklarujemy scanner / random
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // pętla która wykonuje się 5 razy
        for (int i = 0; i < 5; i++) {
            // w pętli odczytujemy wartość int ze scannera
            int wartosc = scanner.nextInt();

            // dodajemy wartość do listy
            list.add(wartosc);
        }
        // wypisanie listy
        System.out.println("Lista, pierwsze wypisanie: " + list);

        // pętla która wykonuje się 5 razy
        for (int i = 0; i < 5; i++) {
            // w pętli odczytujemy wartość int ze scannera
            int wartosc = random.nextInt(500);

            // dodajemy wartość do listy
            list.add(wartosc);
        }
        // wypisanie listy
        System.out.println("Lista, drugie wypisanie: " + list);


    }
}