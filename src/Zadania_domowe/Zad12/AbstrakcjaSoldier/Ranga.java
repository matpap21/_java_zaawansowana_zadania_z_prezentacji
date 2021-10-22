package Zadania_domowe.Zad12.AbstrakcjaSoldier;

public enum Ranga {
    POLKOWNIK("Półkownik"),
    MAJOR("Major"),
    KAPITAN("Kapitan"),
    PORUCZNIK("Porucznik"),
    CHORAZY("Chorąży"),
    SIERZANT("Sierżant"),
    KAPRAL("Kapral");

    public final String nazwarangi;

    Ranga(String ranga) {
        this.nazwarangi = ranga;
    }

    public String getNazwarangi() {
        return nazwarangi;
    }
}
