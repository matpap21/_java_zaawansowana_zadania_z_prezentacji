package Zadania_domowe.Zad19;

import Zadania_domowe.Zad18.Gender;
import Zadania_domowe.Zad18.WypelnionyFormularz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        long ilosclinii = 0;
        try (BufferedReader bufferedReader = new BufferedReader (new FileReader ("Formularz.txt"))) {
            ilosclinii = bufferedReader.lines ( ).count ( );


        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        System.out.println ("Ilośc linii = " + ilosclinii);


        long iloscFormularzy = ilosclinii/5;

        List<WypelnionyFormularz> wypelnionyFormularzList = new ArrayList<> (  );
        Set<WypelnionyFormularz> wypelnionyFormularzSet = new HashSet<> (  );
        Map<String, Map<String, Integer>> IloscPytanNaOpdowiedzMap = new HashMap<> (  );

        try(BufferedReader bufferedReader = new BufferedReader (new FileReader ("Formularz.txt"))) {
            for (int i = 0; i <iloscFormularzy ; i++) {
                String data = bufferedReader.readLine ().replace ("dataUrodzenia", "");
                umiescWMapie(IloscPytanNaOpdowiedzMap,"dataUrodzenia=" ,data);

                String gender = bufferedReader.readLine ().replace ("gender","");
                umiescWMapie (IloscPytanNaOpdowiedzMap,"gender=", gender);

                String pali = bufferedReader.readLine ().replace ("pali","");
                umiescWMapie (IloscPytanNaOpdowiedzMap,"pali=",pali);

                String chodziZestresowany = bufferedReader.readLine ().replace ("chodziZestresowany","");
                umiescWMapie (IloscPytanNaOpdowiedzMap,"chodziZestresowany=",chodziZestresowany);

                bufferedReader.readLine ();
                wypelnionyFormularzList.add (new WypelnionyFormularz (
                        LocalDate.parse (data),
                        Gender.valueOf (gender),
                        Boolean.parseBoolean (pali),
                        Boolean.parseBoolean (chodziZestresowany)
                ));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        for (WypelnionyFormularz formularze: wypelnionyFormularzList){
            System.out.println (formularze );
        }

        OptionalDouble sredniWiekKobiet = wypelnionyFormularzList.stream ( )
                .filter (wypelnionyFormularz -> wypelnionyFormularz.getGender ( ) == Gender.FEMALE)
                .mapToDouble (form -> Period.between (form.getDataUrodzenia ( ), LocalDate.now ( )).getYears ( ))
                .average ( );

        OptionalDouble sredniWiekMezczyzn = wypelnionyFormularzList.stream ()
                .filter (wypelnionyFormularz -> wypelnionyFormularz.getGender ().equals (Gender.MALE))
                .mapToDouble (form -> Period.between (form.getDataUrodzenia (),LocalDate.now ()).getYears ())
                .average ();

        Long iloscMezczyzn = wypelnionyFormularzList.stream ()
                .filter (wypelnionyFormularz -> wypelnionyFormularz.getGender () == Gender.MALE)
                .count ();

        Long iloscKobiet = wypelnionyFormularzList.stream ()
                .filter (wypelnionyFormularz -> wypelnionyFormularz.getGender ().equals (Gender.FEMALE))
                .count ();

        System.out.println ("Kobiet jest : " + iloscKobiet + " Mezczyzn jest: " + iloscMezczyzn );

        for (Map.Entry<String,Map<String,Integer>> pytaniaIodpowiedzi: IloscPytanNaOpdowiedzMap.entrySet ()){
            System.out.println ( );
            System.out.println ("Pytanie " + pytaniaIodpowiedzi.getKey () );
            for (Map.Entry<String,Integer> odpowiedzNaIlosc: pytaniaIodpowiedzi.getValue ().entrySet ()){
                System.out.println ("Odpowiedz: " + odpowiedzNaIlosc.getKey () +" udzielona: " + odpowiedzNaIlosc.getValue () );
            }
        }
    }

    private static void umiescWMapie(Map<String,Map<String,Integer> > iloscPytanNaOpdowiedzMap, String pytanie, String odpowiedz) {
        pytanie=pytanie.toUpperCase ();
        odpowiedz=odpowiedz.toUpperCase (  );

        // NIE WIEM O CO CHODZI
        if(iloscPytanNaOpdowiedzMap.containsKey (pytanie)){
            iloscPytanNaOpdowiedzMap.put (pytanie,new HashMap<> (  ));
        }

        Map<String,Integer> OdpowiedznaIloscMap = iloscPytanNaOpdowiedzMap.get (pytanie);
        if(OdpowiedznaIloscMap.containsKey (odpowiedz)){
            OdpowiedznaIloscMap.put (odpowiedz,OdpowiedznaIloscMap.get (odpowiedz) +1);
        }else {
            OdpowiedznaIloscMap.put (odpowiedz,1);
        }


    }


}
