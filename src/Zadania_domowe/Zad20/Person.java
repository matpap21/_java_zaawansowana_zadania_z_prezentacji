package Zadania_domowe.Zad20;

public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;
    private boolean mezczyzna;

    public Person(String imie, String nazwisko, int wiek, boolean mezczyzna) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.mezczyzna = mezczyzna;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean isMezczyzna() {
        return mezczyzna;
    }

    public void setMezczyzna(boolean mezczyzna) {
        this.mezczyzna = mezczyzna;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", mezczyzna=" + mezczyzna +
                '}';
    }
}
