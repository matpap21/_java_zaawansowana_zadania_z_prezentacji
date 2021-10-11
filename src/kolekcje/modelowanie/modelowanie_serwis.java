package kolekcje.modelowanie;

import java.util.List;
import java.util.Map;

public class modelowanie_serwis {

    class Rachunek {
        private double cena;
    }

    class Klient {
        private String IdKlienta;
        private String name;
        private String surname;
        private List<ZgloszenieSerwisowe> zgloszenieSerwisowe;
    }

    class ZgloszenieSerwisowe {
        private String identyfikator;
        private String status;
        private boolean Gwarancja;
        private String OpisSzkody;

        private Produkt produkt;
        private Rachunek rachunek;
    }

    class Produkt {
        private String nazwa;
        private String numerSeryjny;
    }

    class Serwis {
        private List<ZgloszenieSerwisowe> zgloszenieSerwisowe;
        private List<Klient> klients;
        private Map<Klient, ZgloszenieSerwisowe> klientZgloszenieSerwisoweMap;
        private Map<String, ZgloszenieSerwisowe> zgloszeniaMap;
        private Map<String, Klient> klientMap;
    }
}
