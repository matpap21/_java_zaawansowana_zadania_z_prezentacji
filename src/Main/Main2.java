package Main;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {


        // Deklaracja listy
        List<Integer> integerList = new ArrayList<> ( );

        // Deklaracja random'a
        Random random = new Random ( );

        // pętla for i - 10 iteracji
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt (500);
            integerList.add (value);
        }


        // wypisanie całej listy
        System.out.println ("Print IntigerList");
        System.out.println (integerList);

        // ## Obliczanie sumy
        // deklaracja zmiennej suma
        int suma = 0;


        // pętla ma wykonać się tyle iteracji ile jest elementów
        for (int i = 0; i < integerList.size ( ); i++) {
            // sumujemy elementy w pętli
            // wskazówka: int wartosc = list.get(i);
            int value = integerList.get (i);
            suma = suma + value;
        }


        // poza pętlą wypisujemy sumę i średnią

        //               ^int    ^double


        double srednia = suma / integerList.size ( );
        System.out.println ("Sum");
        System.out.println (suma);
        System.out.println ("Average");
        System.out.println (srednia);


        // ## Stworzenie kopii
        // należy pamiętać że kolekcje posiadają konstruktor kopiujący
        // List<Integer> lista_orginalna = new ArrayList<>();
        // ... dodajemy jakieś elementy.. coś się dzieje
        // List<Integer> lista_kopia = new ArrayList<>(lista_orginalna);
        List<Integer> integerList_copy = new ArrayList<> (integerList);


        // sortowanie i wypisanie
        // lista_kopia.sort()
        // Collections.sort(lista_kopia);
        Collections.sort (integerList_copy);


        // ############# Część druga
        // mediana to środkowy element (jeśli taki jest)
        // mediana to średnia dwóch środkowych elementów (jeśli ilość jest parzysta)
        // lista.size() - rozmiar
        // lista.size()%2 - parzystość
        //
        // Przypadek gdy ilość elementów jest parzysta
        // lista.size() = 10
        // 0 1 2 3 (4 5) 6 7 8 9
        // (lista.size() / 2 - 1)
        // lista.get( (lista.size() / 2) - 1 )


        // Przypadek gdy ilość elementów jest nieparzysta
        // 0 1 2 3 4 5 6 7 8 9
        // lista.get(?)
        // (lista.size() / 2) = 5 index = 6 element
        // lista.get( (lista.size() / 2) )

        double mediana = 0;

        if (integerList_copy.size ( ) % 2 == 0) {
            int element1 = integerList_copy.get ((integerList_copy.size ( ) / 2) - 1);
            int element2 = integerList_copy.get ((integerList_copy.size ( ) / 2));
            mediana = (element1 + element2) / 2.0;
        } else {
            int element3 = integerList_copy.get ((integerList_copy.size ( ) / 2));
        }

        System.out.println ("Mediana");
        System.out.println (mediana);


        // Pamiętajcie w tym miejscu pracować na liście pierwszej (orginalnej)
        // zadeklarowanie zmiennej minimum / maximum
        // pobieranie pierwszego elementu z Listy i nadawanie mu wartosci jako mix i max

        int min = integerList.get (0);
        int max = integerList.get (0);


        // pętla która szuka min/max

        for (int i = 1; i < integerList.size ( ); i++) {
            if (min > integerList.get (i)) {
                min = integerList.get (i);
            }

            // jeśli trafiliśmy na liczbę mniejszą to zapisujemy nowe minimum

            // jeśli trafiliśmy na liczbę większą to zapisujemy nowe maksimum
            if (max < integerList.get (i)) {
                max = integerList.get (i);
            }
        }

        System.out.println("Max: " + max + " Min: " + min);
        //     - po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for

        int indexmin = 0;
        int indexmax = 0;

        // pętla która szuka indeksów min/max
        for (int i = 0; i < integerList.size ( ); i++) {
            if (min == integerList.get (i)) {
                indexmin = i;
            }
            if(max == integerList.get (i)){
                indexmax = i;
            }
        }

        // jeśli trafiliśmy na liczbę większą to zapisujemy nowe maksimum

        System.out.println ("Max index " + indexmax + " min index " + indexmin  );

        // - po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof
        System.out.println ("Max index "+ integerList.indexOf (max) + " min index " + integerList.indexOf (min) );

    }
}

