package Streamy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Telefon> telefons = new ArrayList<Telefon> (Arrays.asList (
                new Telefon ("seiugseig", 13.0, 8.0, OS.WINDOWS, Arrays.asList ("czesc synku", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon ("3wuihr3w3", 13.0, 7.0, OS.OSX, Arrays.asList ("Hej tu Asia!", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon ("34tc3cc34", 11.0, 4.5, OS.WINDOWS, Arrays.asList ("Co tam marek?", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon ("seiugseig", 13.0, 8.0, OS.WINDOWS, Arrays.asList ("Kocham Cie, mamusia!", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon ("2vu829v8q", 13.0, 5.0, OS.OSX, Arrays.asList ("Tu twój operator...", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon ("skejghdir", 13.0, 5.0, OS.ANDROID, Arrays.asList ("Tu twój operator...", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon ("9843ut938", 15.0, 8.5, OS.ANDROID, Arrays.asList ("czesc synku", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon ("i4ugwhiga", 12.0, 4.0, OS.ANDROID, Arrays.asList ("czesc synku", "co tam u Ciebie?", "Pozdrawiam, mama")),
                new Telefon ("seiugseig", 13.0, 8.0, OS.WINDOWS, Arrays.asList ("czesc synku", "co tam u Ciebie?", "Pozdrawiam, mama"))

        ));

        System.out.println (telefons);

        System.out.println ("===========================================================");
        // przetwarzające
        //  - filter    - filtruje
        //  - map       - mapuje
        //  - sort      - sortuje
        //  - distinct  - usuwa duplikaty
        // ##################################################################################

        // tylko telefony z systemem OSX
        List<Telefon> telefony_z_systemem_OSX =
                telefons.stream ( ).filter (telefon -> telefon.getSystemOperacyjny ( ) == OS.OSX)
                        .collect (Collectors.toList ( ));
        System.out.println ("Telefony osx: " + telefony_z_systemem_OSX);
        System.out.println ("===========================================================");

        // Zmapowanie to znaczy przetworzenie strumienia obiektów typu X na typ Y
        // interesuje mnie jakie numery seryjne posiadają te telefony = w wyniku potrzebuje listy numerów seryjnych
        //List<String> numerySeryjne = telefons.stream().map(telefon -> telefon.getNumerSeryjny()).collect(Collectors.toList());

        // tylko informacje z telefonow o numerze seryjnym
        List<String> numery_seryjne_mapowanie = telefons.stream ( )
                .map (telefon -> telefon.getNumerSeryjny ( ))
                .collect (Collectors.toList ( ));

        System.out.println ("numery_seryjne: " + numery_seryjne_mapowanie);
        System.out.println ("===========================================================");

        // sortowananie wielkoscia sposob pierwszy
        List<Telefon> sortowanie_wielkoscia_powierzchni1 = telefons
                .stream ( )
                .sorted ((t1, t2) -> {
                    double powierchniaT1 = t1.getSzerokosc ( ) * t1.getWysokosc ( );
                    double powierchniaT2 = t2.getSzerokosc ( ) * t2.getWysokosc ( );
                    return Double.compare (powierchniaT1, powierchniaT2);
                }).collect (Collectors.toList ( ));
        System.out.println ("sortowananie wielkoscia sposob pierwszy Double compare: " + sortowanie_wielkoscia_powierzchni1);
        System.out.println ("===========================================================");

        // sortowananie wielkoscia sposob drugi
        List<Telefon> sortowanie_wielkoscia_powierzchni2 = telefons
                .stream ( )
                .sorted (Comparator.comparingDouble (Telefon -> Telefon.getPowierzchnia ( )))
                .collect (Collectors.toList ( ));

        System.out.println ("sortowananie wielkoscia sposob drugi Comparator: " + sortowanie_wielkoscia_powierzchni2);
        System.out.println ("===========================================================");

        //distinct wypisz wszystkie unikalne telefony bez powtorzen
        List<Telefon> unikanlne_telefony_distinct = telefons
                .stream ( )
                .distinct ( ) // nie ma parametrow to bierze po hashcode, usuwa duplicaty
                .collect (Collectors.toList ( ));
        System.out.println ("unikanlne_telefony_distinct: " + unikanlne_telefony_distinct);
        System.out.println ("===========================================================");

        // końcowe
        //  - collect
        //  - find first
        //  - find any
        //  - any
        // -  anymatch
        // ##################################################################################


        // wypisz telefony z Systemem WIndows oraz o powierchni powyzej 90 cm2
        Optional<Telefon> optionalTelefon = telefons.stream ( )
                //parallel () // rownolegle
                .filter (telefon -> telefon.getSystemOperacyjny ( ) == OS.WINDOWS)
                .filter (telefon -> telefon.getPowierzchnia ( ) > 90)
                .findFirst ( );
        System.out.println ("optionalTelefon: " + optionalTelefon);

        if (optionalTelefon.isPresent ( )) {
            Telefon telefon = optionalTelefon.get ( ); // wydobywanie . optional to pudelko, przestrzen
            System.out.println ("Znaleziono: " + telefon);
        }
        optionalTelefon.ifPresent (System.out::println);
        optionalTelefon.ifPresent (telefon -> System.out.println (telefon));
        System.out.println ("===========================================================");

        // wypisz telefony z Systemem WIndows oraz o powierchni powyzej 1000 cm2
        // ponizej pokazano jak dziala opcja Optional, czyli gdy danego elemntu nie ma w streamie
        Optional<Telefon> optionalTelefon2 = telefons.stream ( )
//                .parallel() // równolegle
                .filter (telefon -> telefon.getSystemOperacyjny ( ) == OS.OSX)
                .filter (telefon -> telefon.getPowierzchnia ( ) > 1000.0)
                .findFirst ( );
        System.out.println (optionalTelefon2);
        if (optionalTelefon2.isPresent ( )) {
            Telefon telefon = optionalTelefon2.get ( );       //  wydobyć (get)
            System.out.println ("Znaleziono2: " + telefon);
        }
        // znajdź telefon (wyżej) i go wydoboądź (linia niżej) jeśli go nie znajdziesz (orElse), to stwórz nowy
        Telefon t = optionalTelefon2.orElse (new Telefon ( ));
        System.out.println ("Nowy lub znaleziony: " + t);


        // sprawdz czy istnieje telefon o takich poarametrach

        boolean czyIstniejeTakiTelefon = telefons
                .stream ( )
                .anyMatch (telefon -> telefon.getPowierzchnia ( ) > 1000 && telefon.getSystemOperacyjny ( ) == OS.WINDOWS);
        System.out.println ("czyIstniejeTakiTelefon: " + czyIstniejeTakiTelefon);
        System.out.println ("===========================================================");

        // końcowe specyficzne
        //  - sum
        //  - max
        //  - min
        //  - average
        //  - ...
        // ##################################################################################
        //suma wysokosci wszystkich telefonow
        // map to Double -> powoduje ze zamiast Stream<Object> -> StreamInt StreamDouble
        double sum = telefons.stream ( )
                .mapToDouble (telefon -> telefon.getWysokosc ( ))
                .sum ( );

        // OptionalDouble to Optional<Double> tylko specyficzna klasa
        // Optional<Double> average = telefons.stream()

        OptionalDouble average = telefons.stream ( )
                .mapToDouble (telefon -> telefon.getWysokosc ( ))
                .average ( );

        OptionalDouble min = telefons.stream ( )
                .mapToDouble (telefon -> telefon.getWysokosc ( ))
                .min ( );

        OptionalDouble max = telefons.stream ( )
                .mapToDouble (telefon -> telefon.getWysokosc ( ))
                .max ( );

        //count
        long iloscElementow = telefons.stream ( )
                .mapToDouble (telefon -> telefon.getWysokosc ( ))
                .count ( );

        long iloscelementow2 = telefons.stream ( )
                .mapToDouble (telefon -> telefon.getWysokosc ( ))
                .count ( );


        //       Chcę z listy telefonów które zawierają listę smsów (innymi słowy lista - list) zrobić listę sms-sów
        //       zamieniamy (stream of stream) na (stream) == spłaszczamy strukturę

        List<String> wiadomosci = telefons.stream ( )
                .flatMap (telefon -> telefon.getWiadomosci ( ).stream ( ))
                .distinct ( )
                .collect (Collectors.toList ( ));

        System.out.println ("wiadomosci: " + wiadomosci);
        System.out.println ("===========================================================");

        Optional<Integer> wynikFunkcji = funkcja ( );
        wynikFunkcji.ifPresent (wynik -> wykonajObliczenieNaDouble (wynik));
    }

    public static void wykonajObliczenieNaDouble(Integer dane) {
        // NULL POINTER EXEPTION sprawdza czy mamy jakies dane, mowi ze operujemy na danych ktorych nie ma
        if (dane == null) {
            return;
        } else {
            double wartoscDouble = dane.doubleValue ( );
        }
    }


    public static Optional funkcja() {
        return Optional.empty ();

    }
}
