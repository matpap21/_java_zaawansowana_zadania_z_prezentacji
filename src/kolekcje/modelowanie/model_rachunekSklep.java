package kolekcje.modelowanie;

import java.util.List;
import java.util.Map;

public class model_rachunekSklep {

    class Produkt{
        private String nazwa;
        private double cena;

    }

    class Sklep {
        Map<String,Produkt> produkty;
        private List<IloscProduktu> koszyk;

        public void dodajIloscDoKoszyka(int ilosc,Produkt produkt){

        }
    }

    class IloscProduktu{
        private double ilosc;
        private String jednostka;
        private Produkt produkt;

    }
    class Rachunek{
        List<IloscProduktu> produkty;

        public double suma(){
            double suma =0.0;
            for (IloscProduktu iloscProduktu:produkty
                 ) {
                suma = suma+ (iloscProduktu.produkt.cena *iloscProduktu.ilosc);
            }
            return suma;
        }

    }

}
