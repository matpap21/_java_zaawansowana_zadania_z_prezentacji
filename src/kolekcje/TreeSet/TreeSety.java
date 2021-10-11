package kolekcje.TreeSet;

import kolekcje.Comparator.ComparingCitizien;
import obj.Obywatel;

import java.util.*;

public class TreeSety {
    public static void main(String[] args) {
        Obywatel o1 = new Obywatel (111111111, "Jan", "Kowalski");
        Obywatel o2 = new Obywatel (111111112, "Marian", "Kowalski");
        Obywatel o3 = new Obywatel (111111113, "Miłosz", "Kowalski");
        Obywatel o4 = new Obywatel (111111114, "Filip", "Kowalski");
        Obywatel o5 = new Obywatel (111111115, "Grażyna", "Nowak");


        List<Obywatel> citizens = new ArrayList<> (Arrays.asList (o1, o2, o3, o4, o5));

        Set<Obywatel> obywatelSet = new TreeSet<> (new ComparingCitizien ( ));
        obywatelSet.add (o1);
        obywatelSet.add (o2);
        obywatelSet.add (o3);
        obywatelSet.add (o4);
        obywatelSet.add (o5);
        System.out.println ("============================================");
        System.out.println ("List of citiziens");
        for (Obywatel list_of_citiziens : obywatelSet) {
            System.out.println (list_of_citiziens);
        }

        System.out.println ("=========================================");
        Map<String, Obywatel> citizienMap = new TreeMap<> (new Comparator<String> ( ) {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo (o2);
            }
        });
        citizienMap.put (o1.getName ( ), o1);
        citizienMap.put (o2.getName ( ), o2);
        citizienMap.put (o3.getName ( ), o3);
        citizienMap.put (o4.getName ( ), o4);
        citizienMap.put (o5.getName ( ), o5);

        citizienMap.containsKey ("Jan");
        citizienMap.containsValue ("Kowalski");

        System.out.println ("=========================================");
        System.out.println ("Searching for keys");
        for (String keys : citizienMap.keySet ( )) {
            System.out.println ("Keys " + keys);
        }

        System.out.println ("=========================================");
        System.out.println ("Searching for values");
        for (Obywatel values : citizienMap.values ( )) {
            System.out.println ("Value " + values);

        }
        System.out.println ("=========================================");
        System.out.println ("Searching for key_values + iteration");
        for (Map.Entry<String, Obywatel> key_and_values : citizienMap.entrySet ( )) {
            System.out.println ("Key: " + key_and_values.getKey ( ) + " value " + key_and_values.getValue ( ));
        }
    }
}
