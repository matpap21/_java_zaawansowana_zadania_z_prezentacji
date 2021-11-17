package Zadania_domowe.Zad11;

public class Ciocia extends ICzłonekRodziny {
    public Ciocia(String name) {
        super (name);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
}
