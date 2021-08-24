package kolekcje.Benchmark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListaBenchmark {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<> (  );

        dodajDoListyNElementow(list, 1000000);
        System.out.println ("================================" );

        long timeStart = System.currentTimeMillis ();
        przeszukajListeElementow(list);
        long timeEnd = System.currentTimeMillis ();

        System.out.println ( timeEnd-timeStart);
    }

    private static void przeszukajListeElementow(List<Integer> list) {
        int zmienna =0;
        for (int i = 0; i < list.size (); i++) {
            list.get (i);
            System.out.println (list.get (i) );
        }

        //System.out.println (zmienna );

    }

    private static void dodajDoListyNElementow(List<Integer> list, int liczbaelementow) {
        for (int i = 0; i < liczbaelementow; i++) {
            list.add (i);

        }
    }

    public static class LinkedLista {
        public static void main(String[] args) {

            List<Integer> list = new LinkedList<> (  );
            Queue<Integer> queue = new LinkedList<> (  );





        }
    }
}
