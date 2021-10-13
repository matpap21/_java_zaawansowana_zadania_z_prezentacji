package Interfejsy.CzlonekRodziny;

public class Ojciec extends ICzłonekRodziny{
    public Ojciec(String imie) {
        super (imie);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
    public void przedstawSie() {
        System.out.println("I am " + imie + " Your father!");
    }
}
