package Zadania_domowe.Zad10;

import java.util.ArrayList;
import java.util.List;

public class KoszykProduktow {
    private List<Produkt> produktList = new ArrayList<> (  );


    public void dodajProdukt( Produkt produkt){
        produktList.add (produkt);
    }

    public void wypiszRachunek(){
        System.out.println ("\n Produkty" );
        for (Produkt produkt:produktList){
            System.out.println (produkt );
        }
        System.out.println ( );
    }
    public double podsumujRachunekNetto(){
        double suma =0;
        for (Produkt produkt:produktList){
            suma = suma +produkt.getCenaNetto ();
        }
        return suma;
    }
    public double podsumujRachunekBrutto(){
        double suma = 0;
        for (Produkt produkt:produktList){
            suma = suma + produkt.obliczCeneBrutto ();
        }
        return suma;
    }
    public double zwróćWartośćPodatku(){
       return podsumujRachunekBrutto () -podsumujRachunekNetto () ;

    }


}
