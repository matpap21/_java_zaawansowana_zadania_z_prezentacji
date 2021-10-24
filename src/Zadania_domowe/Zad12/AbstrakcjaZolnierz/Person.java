package Zadania_domowe.Zad12.AbstrakcjaZolnierz;

public abstract class Person {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void przedstawSie();


}
