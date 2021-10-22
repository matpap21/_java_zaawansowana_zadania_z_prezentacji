package Zadania_domowe.Zad11;

public class Ojciec  extends ICzłonekRodziny{
    public Ojciec(String name) {
        super (name);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }

    @Override
    public void przedstawsie() {
        System.out.println ("I am Your father, " + name + " !" );
    }

}
