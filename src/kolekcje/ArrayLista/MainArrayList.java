package kolekcje.ArrayLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<> ( );
        list.add (5);
        list.add (15);
        list.add (25);
        list.add (35);
        list.add (45);

        System.out.println ("=================================");
        System.out.println ("Checking if there is value 15 in list" );
        boolean contains = sprawdzCzyZawieraElement(list, 15);
        System.out.println ("=================================");
        System.out.println ("Checking index of provided value in list" );
        int index = znajdzElementNaIndeksie(list, 5);


        System.out.printf ("Rozmiar " + list.size ( ));
        for (int i = 0; i < list.size ( ); i++) {
            System.out.print ("\n"+ "Index" + i + " wartość " + list.get (i));
        }
        list.remove (2);
        System.out.println ("=================================");
        System.out.println ("Rozmiar " + "\n"+  list.size ( ));
        for (int i = 0; i < list.size ( ); i++) {
            System.out.println ("\n"+ "Index " + i + " wartość " + list.get (i));
        }

        list.removeAll (Arrays.asList (35,45));
        System.out.println ("=================================");
        System.out.printf ("Rozmiar " + list.size ( ));
        for (int i = 0; i < list.size ( ); i++) {
            System.out.println ("\n"+ "Index" +  i + "\n"+ "wartość " +  list.get (i));
        }
        List<Integer> list2 = new ArrayList<> (2 );
        list.add (5);
        list.add (15);
        list.add (25);
        list.add (35);
        list.add (45);


        System.out.println ("=================================");
        System.out.printf ("Rozmiar " + list2.size ( ));
        for (int i = 0; i < list2.size ( ); i++) {
            System.out.println ("\n"+ "Index" +  i + "\n"+ "wartość " +  list2.get (i));
        }
    }

    public static int znajdzElementNaIndeksie(List<Integer> list,int value) {

        int index = list.indexOf (value);
        if (index == list.indexOf (value )){
            System.out.println("Indeks wartości to : " + index);
        } else {
            System.out.println("Nie znaleziono wartości " + value);
        }
        return index;
    }


    public static boolean sprawdzCzyZawieraElement(List<Integer> list, Integer WartoscSzukana) {
        boolean contains = list.contains (WartoscSzukana);
        System.out.println ("Check if there is provided value "  + WartoscSzukana + ": " + contains);
        return contains;
    }

}
