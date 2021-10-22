package Zadania_domowe.Zad1;

import java.util.*;

public class IntigerList {
    public static void main(String[] args) {
        //Stwórz listę Integerów. Wykonaj zadania:
        // - dodaj do listy 5 elementów ze scannera
        // - dodaj do listy 5 elementów losowych
        // - wypisz elementy
        //Sprawdź działanie aplikacji.

        List<Integer> intigerList = new ArrayList<> ( );
        Scanner scanner = new Scanner (System.in);
        Random random = new Random ( );


        System.out.println ("Please provide 5 numbers to add them to intigerList");

        add5ScannerValuestoList (intigerList);
        add5RandomValuestoList  (intigerList);

        System.out.println ("intigerList" );
        System.out.println (intigerList);
    }

    private static void add5ScannerValuestoList(List<Integer> intigerList) {
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i<5;i++) {
            try {
                int number = scanner.nextInt ( );
                System.out.println ("Wprowadzono " + number);
                intigerList.add (number);
            } catch (InputMismatchException ime) {
                String LastEnteredValueFromUser = scanner.next ( );
                System.err.println ("Entered incorrect data " + LastEnteredValueFromUser + " please try again");
                i--; // cofamy iterator o 1
            }
        }
    }

    private static void add5RandomValuestoList(List<Integer> intigerList) {
        Random random = new Random (  );
        for (int i = 0; i < 5; i++) {
            int liczba_random = random.nextInt (500);
            intigerList.add (liczba_random);
        }
    }
}

