package Zadania_domowe.Zad16;

import Zadania_domowe.Zad15.BrakOCenStudentaExeption;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String imie;
    private String nazwisko;
    private String indeks;

    public Student(String imie, String nazwisko, String indeks, List<Double> oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.oceny = oceny;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks='" + indeks + '\'' +
                ", oceny=" + oceny +
                '}';
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

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public List<Double> getOceny() {
        return oceny;
    }

    public void setOceny(List<Double> oceny) {
        this.oceny = oceny;
    }

    private List<Double> oceny = new ArrayList<> ();

    public Double obliczSredniaOcenStudenta() throws BrakOCenStudentaExeption {
        double suma;
        if (oceny.isEmpty ( )) {
            throw new BrakOCenStudentaExeption ( );
        } else {
            suma = 0.00;
            for (Double ocena : oceny) {
                suma = suma + ocena;
            }
        }

        return (suma / oceny.size ( ));
    }
}
