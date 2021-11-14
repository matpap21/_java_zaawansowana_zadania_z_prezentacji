package Zadania_domowe.Zad12.AbstrakcjaSoldier;

public abstract class Person2 {
    protected String name;
    protected String surname;

    public Person2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public abstract void PresentYourself();
}
