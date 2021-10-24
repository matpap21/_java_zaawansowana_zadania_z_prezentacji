package Zadania_domowe.Zad12.AbstrakcjaZolnierz;

public class Zolnierz extends Person {
    public Ranga ranga;
    public Zolnierz(String name, String surname, Ranga ranga) {
        super (name, surname);
        this.ranga = ranga;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Tu " + name + " " + surname + ", " + ranga.getNazwarangi () + " Polskich sił zbrojnych!");
    }
}

