package Zadania_domowe.Zad14;

import java.util.*;
import java.util.stream.Collectors;

public class MainPerson {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<> (Arrays.asList (
                new Person ("Jacek", "Kowalski", 18, true),
                new Person ("Jacek", "Górski", 15, true),
                new Person ("Andżelika", "Dżoli", 25, false),
                new Person ("Wanda", "Ibanda", 12, false),
                new Person ("Marek", "Marecki", 17, true),
                new Person ("Johny", "Brawo", 25, true),
                new Person ("Stary", "Pan", 80, true),
                new Person ("Newbie", "Noob", 12, true),
                new Person ("Newbies", "Sister", 19, false)
        ));

        System.out.println (persons);

        //a. uzyskaj listę mężczyzn
        List<Person> lista_mezczyzn = persons.stream ( ).filter (mezczyzni -> mezczyzni.isMale ( )).collect (Collectors.toList ( ));
        System.out.println ("uzyskaj listę mężczyzn");
        System.out.println (lista_mezczyzn);

        //b. uzyskaj listę dorosłych kobiet (filter)
        List<Person> dorosle_kobiety = persons.stream ( )
                .filter (doroslekobiety -> doroslekobiety.isMale ( ) == false)
                .filter (wiek ->wiek.getAge ()>=18 )
                .collect(Collectors.toList());

        System.out.println ("uzyskaj listę dorosłych kobiet (filter)" );
        System.out.println (dorosle_kobiety );

        //c. uzyskaj Optional<Person> z dorosłym Jackiem findAny/findfirst

        Optional<Person> doroslyJacek = persons.stream ()
                .filter (wiek -> wiek.getAge ()>=18)
                .filter (imie -> imie.getFirstName ().equals ("Jacek"))
                .findAny ();
        System.out.println ("uzyskaj Optional<Person> z dorosłym Jackiem findAny/findfirst" );
        System.out.println (doroslyJacek );


        //d. uzyskaj listę wszystkich nazwisk osób, które są w przedziale wiekowym: 15-19
        //(filter)
        List<String> nazwiska_doroslych_osob = persons.stream ()
                .filter (wiek -> wiek.getAge () >=15 && wiek.getAge ()<=19)
                .map (nazwisko -> nazwisko.getLastName ())
                .collect(Collectors.toList());


        //e. * uzyskaj sumę wieku wszystkich osób (sum)

        double suma = persons.stream ()
                .mapToDouble (wiek -> wiek.getAge ())
                .sum ();

        System.out.println ("uzyskaj sumę wieku wszystkich osób (sum)" );
        System.out.println (suma );

        //f. * uzyskaj średnią wieku wszystkich mężczyzn (average)
        OptionalDouble average = persons.stream ()
                .filter (mezczyzni -> mezczyzni.isMale ())
                .mapToDouble (wiek-> wiek.getAge ())
                .average ();

        //g. ** znajdź najstarszą osobę w liście (findFirst)

        Optional<Person> najstarsza_osoba = persons.stream ()
                .sorted ( Comparator.comparing (Person::getAge).reversed () )
                .findFirst ();

        System.out.println ("znajdź najstarszą osobę w liście (findFirst)" );
        System.out.println (najstarsza_osoba );

        Optional<Person> najstarsza_osoba2_sposob = persons.stream ()
                .max (Comparator.comparing (Person::getAge));

        System.out.println ("znajdź najstarszą osobę w liście (findFirst)" );
        System.out.println (najstarsza_osoba2_sposob );

    }
}
