package Streamy;

import java.util.List;

public class Telefon {
    private String numerSeryjny;
    private double wysokosc;
    private double szerokosc;
    private OS SystemOperacyjny;
    private List<String> wiadomosci;

    public Telefon() {

    }


    public String getNumerSeryjny() {
        return numerSeryjny;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public OS getSystemOperacyjny() {
        return SystemOperacyjny;
    }

    public List<String> getWiadomosci() {
        return wiadomosci;
    }

    public void setNumerSeryjny(String numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public void setSystemOperacyjny(OS systemOperacyjny) {
        SystemOperacyjny = systemOperacyjny;
    }

    public void setWiadomosci(List<String> wiadomosci) {
        this.wiadomosci = wiadomosci;
    }

    public Telefon(String numerSeryjny, double wysokosc, double szerokosc, OS systemOperacyjny, List<String> wiadomosci) {
        this.numerSeryjny = numerSeryjny;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        SystemOperacyjny = systemOperacyjny;
        this.wiadomosci = wiadomosci;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "numerSeryjny='" + numerSeryjny + '\'' +
                ", wysokosc=" + wysokosc +
                ", szerokosc=" + szerokosc +
                ", System=" + SystemOperacyjny +
                ", wiadomosci=" + wiadomosci +
                '}';
    }
    double getPowierzchnia(){
        return szerokosc * wysokosc;
    }
}
