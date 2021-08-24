package kolekcje.Mapy;

import obj.Obywatel;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapy {
    private static Object Obywatel;

    public static void main(String[] args) {



        Obywatel j1 = new Obywatel(100200, "Marek", "Kowalski");
        Obywatel j2 = new Obywatel(100201, "Adam",  "Kowalski");
        Obywatel j3 = new Obywatel(100202, "Kamil", "Kowalski");
        Obywatel j4 = new Obywatel(100203, "Zenek", "Martyniuk");

        List<Obywatel> obywatels = new ArrayList<> ( Arrays.asList (j1,j2,j3,j4) );

        Map<Long, Obywatel> map = new HashMap<>();
        map.put (j1.getPesel (),j1);
        map.put (j2.getPesel (),j2);
        map.put (j3.getPesel (),j3);
        map.put (j4.getPesel (),j4);


        System.out.println ("Sposob1" );
        System.out.println (Arrays.asList (map ));
        System.out.println ("Sposob2" );
        System.out.println (Arrays.toString(map.entrySet().toArray()));
        System.out.println ("Sposob3" );
        map.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println ("Sposob4" );
        Map<String, List<Obywatel>> mapViaSurname = new HashMap<> (  );
        mapViaSurname.put ("Kowalski",new ArrayList<> ( Arrays.asList (j1,j2,j3) ));


        System.out.println ("Sposob5" );
        //WYPISZ tylko i wyłącznie osoby z nazwiskiem Kowalski wraz z odpowiadajacymi im indeksami

            for (Map.Entry<Long, Obywatel> entry : map.entrySet()) {
                if (entry.getValue ( ).getNazwisko ( ).equals ("Kowalski")){
                    System.out.println ("key: " + entry.getKey ( ) + " value: "
                             + " " + entry.getValue ( ).getName ( ) + " " + entry.getValue ( ).getNazwisko ( ));

                }if (!entry.getValue ( ).getNazwisko ( ).equals ("Kowalski")){
                    System.out.println ("Obywatel nie posiada nazwiska Kowalski" );

                }else
                    System.out.println ( "Brak Obywatela o nazwisku Kowalski");
                }
        System.out.println ("==============================" );

            // INTELIJ IDEA KRZYCZY
        Map<Long, Obywatel> nazwiskoKowalski = map.entrySet ( ).stream ( )
                .collect(Collectors.toList (
                        e -> e.getKey(),
                        e -> e.getValue ().getNazwisko ().equals ("Kowalski")
                ));
        // INTELIJ IDEA KRZYCZY
        Map<Long, String> nazwiskoKowalski2 = map.entrySet ( ).stream ( )
                        .filter (nazwisko ->nazwisko.getValue ().getNazwisko ().equals ("Kowalski"))
                                .map (Map.Entry::getKey)
                                        .collect (Collectors.toMap ());

        // INTELIJ IDEA KRZYCZY
        Map<Long, Obywatel> nazwiskoKowalski3 = map.entrySet ( ).stream ( )
                        .map(nazwisko ->nazwisko.getValue ().getNazwisko ().equals ("Kowalski"))
                        .flatMap ()
                        .collect (Collectors.toMap ());

        // INTELIJ IDEA KRZYCZY
        Map<Long, Obywatel> nazwiskoKowalski4 = map.entrySet ( ).stream ( )
                .map(e -> new HashMap (e.getKey(), e.getValue().getNazwisko ().equals ("Kowalski")))
                .collect(Collectors.toList());



        System.out.println ( nazwiskoKowalski);



        System.out.println ("Sposob6" );
        System.out.println (Collections.singletonList (map.get (100203L)) );

    }
}
