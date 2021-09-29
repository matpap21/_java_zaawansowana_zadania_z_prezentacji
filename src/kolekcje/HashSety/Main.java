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
        System.out.println ("==================================" );
        System.out.println (nowalista.stream ().max (Comparator.naturalOrder ()));



        String s1 = "common_prefixDB";
        System.out.println("common_prefixDB" + s1.hashCode());
        String s2 = "common_prefixCa";
        System.out.println("common_prefixCa" + s2.hashCode());

        Set<String> strings_asText = new HashSet<> (  );
        strings_asText.add (s1);
        strings_asText.add (s2);

        System.out.println ("============================================" );
        System.out.println ("Rozmiar " + strings_asText.size () );
        System.out.println ("============================================" );
        System.out.println (s1.equals (s2) );
        System.out.println ("============================================" );
        System.out.println (s1.equalsIgnoreCase (s2) );


    }

}
