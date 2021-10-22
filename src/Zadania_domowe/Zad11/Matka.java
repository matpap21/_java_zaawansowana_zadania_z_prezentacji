package Zadania_domowe.Zad11;

public class Matka extends ICzłonekRodziny {

    public Matka(String name) {
        super (name);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }

    @Override
    public void przedstawsie() {
        System.out.println ("I am Your mother, " + name + " !" );
    }
}
