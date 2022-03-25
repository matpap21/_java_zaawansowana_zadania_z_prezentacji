package Zadania_domowe.Zad17.a;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CitizenRegister {
    private Map<String,Citizen> citizenMap;

    public CitizenRegister() {
        this.citizenMap = new HashMap<> (  );
    }

    //- dodajObywatela(String imie, String nazwisko, String pesel):void
    public void addCitizen(String name, String surname, String pesel){
        Citizen citizen = new Citizen (name,surname,pesel);
        citizenMap.put (pesel,citizen);
    }

    public List<Citizen> addCitfindCitizenBeforeYear(int year){
       return citizenMap.values ()
                .stream ()
                .filter (citizen -> {
                    String pesel = citizen.getPesel ( );
                    String subString = pesel.substring (0,2);
                    int yearBirth = Integer.parseInt (subString);
                    return yearBirth<year;
                })
                .collect(Collectors.toList());
    }

    public List<Citizen> findCitizenByYearAndName(int year, String name){
       return citizenMap.values ()
                .stream ()
                .filter (citizen -> {

                    String pesel = citizen.getPesel ( );
                    String subsStr = pesel.substring (0,2);
                    int birthYear = Integer.parseInt (1900 + subsStr);
                    return birthYear < year;
                })
                .filter (citizen -> citizen.getName ().equalsIgnoreCase (name))
                .collect(Collectors.toList());
    }

    public List<Citizen> FindCitizenBySurname(String surname){
      return   citizenMap.values ()
                .stream ()
                .filter (citizen -> citizen.getSurname ().equalsIgnoreCase (surname))
                .collect(Collectors.toList());
    }
    public Optional<Citizen> FindPersonByPesel(String pesel){
      return   citizenMap.values ()
                .stream ()
                .filter (citizen -> citizen.getPesel ().equalsIgnoreCase (pesel))
              .findFirst ();

    }

}
