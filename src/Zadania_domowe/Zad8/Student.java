package Zadania_domowe.Zad8;

import Zadania_domowe.Zad5.Gender;

public class Student {
    private int indeks;
    private String name;
    private String surname;
    private Gender gender;

    public int getIndeks() {
        return indeks;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Student(int indeks, String name, String surname, Gender gender) {
        this.indeks = indeks;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "indeks=" + indeks +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }
}
