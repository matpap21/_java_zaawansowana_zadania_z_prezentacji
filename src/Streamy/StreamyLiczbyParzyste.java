package Streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamyLiczbyParzyste {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<> ( );
        for (int i = 0; i < 10; i++) {
            integerList.add (i + 100);
        }

        Long starttimeFor = System.currentTimeMillis ( );
        List<Integer> wynik = znajdzLiczbyParzysteFor (integerList);
        Long endtimeFor = System.currentTimeMillis ( );
        System.out.println (wynik);
        System.out.println ("Czas wykonanego zadania sposobem FOR to " + (endtimeFor - starttimeFor));

        Long starttimeStream = System.currentTimeMillis ( );
        List<Integer> integerListStream = znajdzLiczbyParzysteStream (integerList);
        Long endtimeStream = System.currentTimeMillis ( );
        System.out.println (integerListStream);
        System.out.println ("Czas wykonanego zadania sposobem STREAM to " + (endtimeStream - starttimeStream));

        Long starttimeStreamKrotki1 = System.currentTimeMillis ( );
        List<Integer> integerListStreamKrotki1 = znajdzLiczbyParzysteStreamKrotki1 (integerList);
        Long endtimeStreamKrotki1 = System.currentTimeMillis ( );
        System.out.println (integerListStreamKrotki1);
        System.out.println ("Czas wykonanego zadania sposobem STREAM KROTKI 1 to " + (endtimeStreamKrotki1 - starttimeStreamKrotki1));

        Long starttimeStreamKrotki2 = System.currentTimeMillis ();
        List<Integer> integerListStreamKrotki2 = znajdzLiczbyParzysteStreamKrotki2 (integerList) ;
        Long endtimeStreamKrotki2 = System.currentTimeMillis ();
        System.out.println (integerListStreamKrotki2);
        System.out.println ("Czas wykonanego zadania sposobem STREAM KROTKI 2 to " + (endtimeStreamKrotki2 - starttimeStreamKrotki2));

        Long starttimeStreamKrotki3 = System.currentTimeMillis ();
        List<Integer> integerListStreamKrotki3 = znajdzLiczbyParzysteStreamKrotki3 (integerList) ;
        Long endtimeStreamKrotki3 = System.currentTimeMillis ();
        System.out.println (integerListStreamKrotki3);
        System.out.println ("Czas wykonanego zadania sposobem STREAM KROTKI 3 to " + (endtimeStreamKrotki3 - starttimeStreamKrotki3));


    }

    private static List<Integer> znajdzLiczbyParzysteStream(List<Integer> integerList) {
        return (List<Integer>) integerList.stream ( ).
                filter (new Predicate<Integer> ( ) {
                    // klasa anonimowa z interfejsu
                    // uzupełniamy funkcję TEST
                    // wynik true -> obiekt przechodzi dalej do przetwarzania
                    // wynik false-> obiekt jest usuwany ze streamu,nie z kolekcji (przefiltrowanie rzeczy, ktore nas interesuja, nastepuje odsnianie pewnych rzeczy)
                    // Interfejsy funkcyjne maja jedna metode do zaimplementowania,w tym przypadku boolean
                    @Override
                    public boolean test(Integer obiektWStrumieniu) {
                        if (obiektWStrumieniu % 2 == 0) {
                            return true;

                        } else {
                            return false;
                        }
                    }
                })
                //collect jest ELEMENTEM KONCOWYM - zbiera elementy do wybranych kolekcji
                .collect (Collectors.toList ( ));
    }


    private static List<Integer> znajdzLiczbyParzysteFor(List<Integer> integerList) {
        List<Integer> wynik = new ArrayList<> ( );
        for (int i = 0; i < integerList.size ( ); i++) {
            if (integerList.get (i) % 2 == 0) {
                wynik.add (integerList.get (i));
            }
        }
        return wynik;
    }

    // usunięte komentarze
    private static List<Integer> znajdzLiczbyParzysteStreamKrotki1(List<Integer> integerList) {
        return integerList.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer obiektWStrumieniu) {
                        return (obiektWStrumieniu % 2 == 0);
                    }
                })
                .collect(Collectors.toList());
    }

    // zamieniam obiekt na skrócony zapis
    private static List<Integer> znajdzLiczbyParzysteStreamKrotki2(List<Integer> integerList) {
        return integerList.stream ( )
                .filter ((obiektWStrumieniu) -> {
                   return   (obiektWStrumieniu % 2 == 0);
                })
                .collect (Collectors.toList ());
    }

    // zamieniam obiekt na skrócony zapis bez klamerek
    private static List<Integer> znajdzLiczbyParzysteStreamKrotki3(List<Integer> integerList) {
        return integerList.stream()
                // wyrażenie lambda = skrócony zapis bez klamerek
                .filter (obiektWStrumieniu -> obiektWStrumieniu %2==0)
                .collect (Collectors.toList ());
    }
}
