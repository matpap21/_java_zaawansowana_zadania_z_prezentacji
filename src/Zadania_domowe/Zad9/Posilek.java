package Zadania_domowe.Zad9;

public class Posilek {
    private int kalorycznosc;
    private String nazwa;
    private RodzajPosiłku rodzajPosiłku;
    private double cena;

    public int getKalorycznosc() {
        return kalorycznosc;
    }

    public void setKalorycznosc(int kalorycznosc) {
        this.kalorycznosc = kalorycznosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public RodzajPosiłku getRodzajPosiłku() {
        return rodzajPosiłku;
    }

    public void setRodzajPosiłku(RodzajPosiłku rodzajPosiłku) {
        this.rodzajPosiłku = rodzajPosiłku;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Posilek(int kalorycznosc, String nazwa, RodzajPosiłku rodzajPosiłku, double cena) {
        this.kalorycznosc = kalorycznosc;
        this.nazwa = nazwa;
        this.rodzajPosiłku = rodzajPosiłku;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Posilek{" +
                "kalorycznosc='" + kalorycznosc + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", rodzajPosiłku=" + rodzajPosiłku +
                ", cena=" + cena +
                '}';
    }
}
