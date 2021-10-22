package Zadania_domowe.Zad10;

public class Produkt {
    private String nazwa;
    private double CenaNetto;
    private PodatekProduktu podatekProduktu;

    public String getNazwa() {
        return nazwa;
    }

    public double getCenaNetto() {
        return CenaNetto;
    }

    public PodatekProduktu getPodatekProduktu() {
        return podatekProduktu;
    }

    public Produkt(String nazwa, double cenaNetto, PodatekProduktu podatekProduktu) {
        this.nazwa = nazwa;
        CenaNetto = cenaNetto;
        this.podatekProduktu = podatekProduktu;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCenaNetto(double cenaNetto) {
        CenaNetto = cenaNetto;
    }

    public void setPodatekProduktu(PodatekProduktu podatekProduktu) {
        this.podatekProduktu = podatekProduktu;
    }

    public double obliczCeneBrutto (){
        double cenaBrutto = getCenaNetto () * (1+ podatekProduktu.getPodatek ( ));
        return cenaBrutto;
    }
}
