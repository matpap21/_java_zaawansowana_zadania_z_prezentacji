package kolekcje.modelowanie;

import java.util.List;

public class modelowanie_serwisAGD {

    class Rachunek {
        private double cena;

    }

    class Klient {
        private String Idklienta;
        private String imie;
        private String nazwisko;

        private List<ZgloszenieSerwisowe> zgloszenieSerwisowe;
    }

    private class ZgloszenieSerwisowe {
        private String identyfikator;
        private String status;
        private String opisSzkody;
        private boolean serwisGwaranccyjny;
        private Product product;
        private Rachunek rachunek;
    }

    private class Product {
        private String nazwa;
        private String numerSeryjnyUrzadzenia;
    }


    class Serwis {
        private List<ZgloszenieSerwisowe> zgloszenieSerwisowe;
        private List<Klient> klients;
    }
}
