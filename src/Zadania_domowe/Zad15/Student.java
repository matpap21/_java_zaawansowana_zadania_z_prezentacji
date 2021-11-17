package Zadania_domowe.Zad15;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Student {
    private String imie;
    private String nazwisko;
    private String indeks;
    private List<Double> oceny = new ArrayList<> (  );

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", indeks='" + indeks + '\'' +
                ", oceny=" + oceny +
                '}';
    }

    public Student(String imie, String nazwisko, String indeks, List<Double> oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.oceny = oceny;
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


    public Double ObliczSredniaOcen() throws BrakOCenStudentaExeption {
        if (oceny.isEmpty ()){
            throw new BrakOCenStudentaExeption();
        }
        OptionalDouble averageOptional = oceny.stream().mapToDouble(value -> value).average();
        return averageOptional.orElseThrow ( BrakOCenStudentaExeption::new );

    }
}
