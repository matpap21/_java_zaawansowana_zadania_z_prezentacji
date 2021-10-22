package Zadania_domowe.Zad11;

public class Syn extends ICzłonekRodziny{
    public Syn(String name) {
        super (name);

    }

    @Override
    public boolean jestDorosly() {
        return false;
    }

    @Override
    public void przedstawsie() {
        System.out.println ("Who's asking? I'm " + name);
    }
}





