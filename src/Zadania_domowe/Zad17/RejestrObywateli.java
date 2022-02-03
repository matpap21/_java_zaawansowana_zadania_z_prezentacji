package Zadania_domowe.Zad17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RejestrObywateli {
    private Map<String, Obywatel> obywatelMap;

    public RejestrObywateli() {
        this.obywatelMap = new HashMap<> (  );
    }


    //- dodajObywatela(String imie, String nazwisko, String pesel):void
    public void dodajObywatela(String imie, String nazwisko, String pesel){
        Obywatel obywatel = new Obywatel (imie,nazwisko,pesel);
        obywatelMap.put (pesel,obywatel);
    }


    //- znajdźObywateliUrodzonychPrzed(int rok):List<Obywatel>
    public List<Obywatel> znajdźObywateliUrodzonychPrzed(int rok){
        return obywatelMap.values ()
                .stream ()
                .filter (obywatel -> {
                    String pesel = obywatel.getPesel ();
                    int rokUrodzenia = Integer.parseInt (pesel.substring (0,2));
                    return rokUrodzenia <rok;
                })
                .collect(Collectors.toList());
    }

    //- znajdźObywateliZRokuZImieniem(int rok, String imie):List<Obywatel>
    public List<Obywatel> znajdźObywateliZRokuZImieniem(int rok, String imie){
        return obywatelMap.values ().stream ()
                .filter (obywatel -> {
                    String pesel = obywatel.getPesel ();
                    String subString = pesel.substring (0,2);
                    int RokUrodzenia = Integer.parseInt (1900 + subString);
                    return RokUrodzenia <rok;
                })
                .filter (obywatel -> obywatel.getImie ().equalsIgnoreCase (imie))
                .collect(Collectors.toList());
    }

    //- znajdźObywatelaPoNazwisku(String nazwisko):List<Obywatel>
    public List<Obywatel> znajdźObywatelaPoNazwisku(String nazwisko){
        return obywatelMap.values ().stream ()
                .filter (obywatel -> obywatel.getNazwisko ().equalsIgnoreCase (nazwisko))
                .collect(Collectors.toList());
    }

    //- znajdźObywatelaPoPeselu(String pesel):Obywatel
    public Optional<Obywatel> znajdźObywatelaPoPeselu(String pesel){
        return obywatelMap.values ().stream ()
                .filter (obywatel -> obywatel.getPesel ().equalsIgnoreCase (pesel))
                .findFirst ();
    }

}
