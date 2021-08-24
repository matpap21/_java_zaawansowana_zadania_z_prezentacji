package kolekcje.ArrayLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<> ( );
        list.add (5);
        list.add (15);
        list.add (25);
        list.add (35);
        list.add (45);

        System.out.printf ("Rozmiar " + list.size ( ));
        for (int i = 0; i < list.size ( ); i++) {
            System.out.println ("Index" + i + " wartość " + list.get (i));
        }
        list.remove (2);
        System.out.println ("=================================");
        System.out.printf ("Rozmiar " + list.size ( ));
        for (int i = 0; i < list.size ( ); i++) {
            System.out.println ("Index" + i + " wartość " + list.get (i));
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
}
