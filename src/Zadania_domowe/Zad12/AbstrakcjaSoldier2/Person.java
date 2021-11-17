package Zadania_domowe.Zad12.AbstrakcjaSoldier2;

public abstract class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void presentYourself();
}
