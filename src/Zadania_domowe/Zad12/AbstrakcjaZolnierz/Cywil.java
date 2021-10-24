package Zadania_domowe.Zad12.AbstrakcjaZolnierz;

public class Cywil extends Person {
    public String name;
    public String surname;

    public Cywil(String name, String surname) {
        super (name, surname);
    }
    @Override
    public void przedstawSie(){

        System.out.println("Tu " + name + " " + surname + ", jestem obywatelem Polskim!");

    }
}
