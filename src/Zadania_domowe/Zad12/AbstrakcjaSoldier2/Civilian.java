package Zadania_domowe.Zad12.AbstrakcjaSoldier2;

public class Civilian extends Person{
    public Civilian(String name, String surname) {
        super (name, surname);
    }

    @Override
    public void presentYourself() {
        System.out.println ("My name is " + name + " " + surname + " I am Civil" );

    }
}
