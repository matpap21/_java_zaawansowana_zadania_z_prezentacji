package Zadania_domowe.Zad11;

public class Corka extends ICzłonekRodziny{
    public Corka(String name) {
        super (name);
    }

    @Override
    public boolean jestDorosly() {
        return false;
    }

    @Override
    public void przedstawsie() {
        System.out.println ("I am Your daughter! I am " + name);
    }
}
