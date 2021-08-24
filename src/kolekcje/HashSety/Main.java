package kolekcje.HashSety;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>  (Arrays.asList (5,10,15,20,25,30,35,40,40,5));
        Set<Integer> nowalista = new HashSet<> (  list);

        System.out.println ("==================================" );
        System.out.println (list );
        System.out.println ("==================================" );
        System.out.println (nowalista );
        System.out.println ("==================================" );
        System.out.println (nowalista.size () );
        System.out.println ("==================================" );
        System.out.println (nowalista.stream( ).max (Comparator.reverseOrder ()) );
    }
}
