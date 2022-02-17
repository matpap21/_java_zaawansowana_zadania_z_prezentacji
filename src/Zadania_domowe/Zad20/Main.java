package Zadania_domowe.Zad20;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Programmer programmernew = new Programmer (new Person ("Marian", "Kowalski", 31, true), Arrays.asList ("Java", "Python"));
        Person person1 = new Person ("Jacek", "Kowalski", 18, true);
        Person person2 = new Person ("Jacek", "Górski", 15, true);
        Person person3 = new Person ("Andżelika", "Dżoli", 25, false);
        Person person4 = new Person ("Wanda", "Ibanda", 12, false);
        Person person5 = new Person ("Marek", "Marecki", 17, true);
        Person person6 = new Person ("Johny", "Brawo", 25, true);
        Person person7 = new Person ("Stary", "Pan", 80, true);
        Person person8 = new Person ("Newbie", "Noob", 12, true);
        Person person9 = new Person ("Newbies", "Sister", 19, false);

        List<String> languages1 = Arrays.asList ("Java;Cobol;Lisp".split (";"));
        List<String> languages2 = Arrays.asList ("Java;Lisp".split (";"));
        List<String> languages3 = Arrays.asList ("Java;Cobol;Cpp;Lisp;C#".split (";"));
        List<String> languages4 = Arrays.asList ("C#;C;Cpp".split (";"));
        List<String> languages5 = Arrays.asList ("Java;Assembler;Scala;Cobol".split (";"));
        List<String> languages6 = Arrays.asList ("Java;Scala".split (";"));
        List<String> languages7 = Arrays.asList ("C#;C".split (";"));
        List<String> languages8 = Collections.emptyList ( );
        List<String> languages9 = Arrays.asList ("Java");
        Programmer programmer1 = new Programmer (person1, languages1);
        Programmer programmer2 = new Programmer (person2, languages2);
        Programmer programmer3 = new Programmer (person3, languages3);
        Programmer programmer4 = new Programmer (person4, languages4);
        Programmer programmer5 = new Programmer (person5, languages5);
        Programmer programmer6 = new Programmer (person6, languages6);
        Programmer programmer7 = new Programmer (person7, languages7);
        Programmer programmer8 = new Programmer (person8, languages8);
        Programmer programmer9 = new Programmer (person9, languages9);

        List<Programmer> programmers = Arrays.asList (programmer1, programmer2, programmer3, programmer4, programmer5, programmer6, programmer7, programmer8, programmer9);

        //Stwórz klasę Programmer, która ma klasę Person jakopole.
        // Poza tym, posiada listęjęzyków, którymi się posługuje.
        // Mogą być one reprezentowaneprzez klasę String


        //uzyskaj listę programistów, którzy są mężczyznami
        //Mając listę programistów i korzystając ze streamów:
        //a. uzyskaj listę programistów, którzy są mężczyznami

        List<Programmer> lpksm = programmers.stream ( )
                .filter (mezczyzna -> mezczyzna.getPerson ( ).isMezczyzna ( ) == true)
                .collect (Collectors.toList ( ));

        System.out.println ("uzyskaj listę programistów, którzy są mężczyznami " + lpksm);

        //b. uzyskaj listę niepełnoletnich programistów (obydwóch płci), którzy piszą w Cobolu
        System.out.println ("uzyskaj listę niepełnoletnich programistów (obydwóch płci), którzy piszą w Cobolu");
        List<Programmer> lnpkpwCobolu = programmers
                .stream ( )
                .filter (osoba -> osoba.getPerson ( ).getWiek ( ) < 18)
                .filter (osoba -> osoba.getLanguages ( ).equals ("Cobol"))
                .collect (Collectors.toList ( ));

        System.out.println ("niepełnoletni_programiści " + lnpkpwCobolu);

        //c. uzyskaj listę programistów, którzy znają więcej, niż jeden język programowania
        System.out.println ("uzyskaj listę programistów, którzy znają więcej, niż jeden język programowania");
        List<Programmer> lpkzwizJedenJezykProgramowania = programmers
                .stream ( )
                .filter (osoba -> osoba.getLanguages ( ).size ( ) > 1)
                .collect (Collectors.toList ( ));


        System.out.println ("listę programistów, którzy znają więcej, niż jeden język programowania" + lpkzwizJedenJezykProgramowania);

        //d. uzyskaj listę programistek, które piszą w Javie i Cpp
        System.out.println ("uzyskaj listę programistek, które piszą w Javie i Cpp");
        List<Programmer> lpkpwJAvieiCpp = programmers
                .stream ( )
                .filter (osoba -> osoba.getPerson ( ).isMezczyzna ( ) == false)
                .filter (osoba -> osoba.getLanguages ( ).equals ("Java"))
                .filter (osoba -> osoba.getLanguages ( ).equals ("Cpp"))
                .collect (Collectors.toList ( ));

        List<Programmer> lpkpwJAvieiCpp2 = programmers.stream ( )
                .filter (osoba -> osoba.getPerson ( ).isMezczyzna ( ) == false)
                .filter (osoba -> osoba.getLanguages ( ).equals (Arrays.asList ("Java", "Cpp")))
                .collect (Collectors.toList ( ));

        System.out.println ("programistki,które piszą w Javie i Cpp " + lpkpwJAvieiCpp2);

        //e. uzyskaj listę męskich imion
        System.out.println ("uzyskaj listę męskich imion: ");
        // zamiana klasy Programmer na String
        List<String> lista_meskich_imion = programmers
                .stream ( )
                .filter (programmer -> programmer.getPerson ( ).isMezczyzna ( ) == true)
                .map (programmer -> programmer.getPerson ( ).getImie ( ))
                .collect (Collectors.toList ( ));


        System.out.println ("lista_meskich_imion " + lista_meskich_imion);

        //f. uzyskaj set wszystkich języków opanowanych przez programistów

        // List<List<String>> // zamiast tego:
        // List<String>
        // Set<String>

        Set<String> wjoprzezProgramistow = programmers
                .stream ( )
                .flatMap (programmer -> programmer.getLanguages ( ).stream ( ))
                .collect (Collectors.toSet ( ));

        System.out.println ("wszystkie_jezyki " + wjoprzezProgramistow);

        //g. uzyskaj listę nazwisk programistów, którzy znają więcej, niż dwa języki
        System.out.println ("uzyskaj listę nazwisk programistów, którzy znają więcej, niż dwa języki: ");
        List<String> lnpkzwn2j = programmers
                .stream ( )
                .filter (programmer -> programmer.getLanguages ( ).size ( ) > 2)
                .map (programmer -> programmer.getPerson ( ).getNazwisko ( ))
                .collect (Collectors.toList ( ));


        System.out.println ("lnpkzwn2j " + lnpkzwn2j);

        //h. * sprawdź, czy istnieje chociaż jedna osoba, która nie zna żadnego języka
        System.out.println ("sprawdź, czy istnieje chociaż jedna osoba, która nie zna żadnego języka");
        List<String> onzj = programmers
                .stream ( )
                .filter (programmer -> programmer.getLanguages ( ).isEmpty ( ))
                .map (programmer -> programmer.getPerson ( ).getNazwisko ( ))
                .collect (Collectors.toList ( ));

        boolean onzj2 = programmers
                .stream ( )
                .anyMatch (programmer -> programmer.getLanguages ( ).isEmpty ( ));


        System.out.println ("boolean onzj " +onzj );
        System.out.println ("boolean onzj2 " +onzj2);

        //i. * uzyskaj ilość wszystkich języków opanowanych przez programistki
        System.out.println ("uzyskaj ilość wszystkich języków opanowanych przez programistki: ");
        //  List<Programmer> iwjopp = programmers
        //          .stream()
        //          .filter(programmer -> programmer.getPerson().isMale() == false)
        //          .filter(programmer -> programmer.getLanguages().isEmpty() ==false)
        //          .collect(Collectors.toList());

        List<Programmer> iwjopp2 = programmers
                .stream ( )
                .filter (programmer -> programmer.getPerson ( ).isMezczyzna ( ) == false)
                .filter (programmer -> programmer.getLanguages ( ).isEmpty ( ) == false)
                .collect (Collectors.toList ( ));

        long iwjopp = programmers
                .stream ( )
                .filter (programmer -> programmer.getPerson ( ).isMezczyzna ( ) == false)
                .flatMap (programmer -> programmer.getLanguages ( ).stream ( ))
                .distinct ( )
                .count ( );

        System.out.println ("iwjopp " +iwjopp );

        //j. **Używając streamów znajdź długość najdłuższej linii w wybranym przez ciebie pliku.
        // ja jako wybrany plik wybieram ten który aktualnie implementuje:
        System.out.println ("Używając streamów znajdź długość najdłuższej linii w wybranym przez ciebie pliku" );

        String plik = "C:/Users/Mateusz/Downloads/Kurs Java/_java_zaawansowana_zadania_z_prezentacji/src/Zadania_domowe/Zad20/Main.java";


        //C:\Users\Mateusz\Downloads\Kurs Java\zd_java_92_zadania_domowe-master\src\main\java\com\sda\Zadanie15\Main.java

        try (BufferedReader bufferedReader = new BufferedReader (new FileReader (plik))) {
            Optional<String> najdlizszalinia = bufferedReader.lines ()
                    .max (Comparator.comparing (String::length));

            if(najdlizszalinia.isPresent ( )){
                System.out.println (najdlizszalinia.get () );
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
