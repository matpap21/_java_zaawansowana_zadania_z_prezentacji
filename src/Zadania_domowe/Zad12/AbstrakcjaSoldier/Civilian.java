package Zadania_domowe.Zad12.AbstrakcjaSoldier;

public class Civilian extends Person2{
    public Civilian(String name, String surname) {
        super (name, surname);
    }

    @Override
    public void PresentYourself() {
        System.out.println ("My name is " + name + " " + surname + " I am Civil" );
    }
}
