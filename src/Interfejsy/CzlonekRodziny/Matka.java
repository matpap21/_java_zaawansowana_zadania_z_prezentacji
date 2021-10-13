package Interfejsy.CzlonekRodziny;

public class Matka extends ICzłonekRodziny{
    public Matka(String imie) {
        super (imie);
    }

    @Override
    public boolean jestDorosly() {
        return true;
    }
    public void przedstawSie() {
        System.out.println("I am Your mother, " + imie + " !");
    }
}
