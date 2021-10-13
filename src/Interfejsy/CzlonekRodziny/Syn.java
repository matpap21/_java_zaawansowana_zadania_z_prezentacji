package Interfejsy.CzlonekRodziny;

public class Syn extends ICzłonekRodziny{
    public Syn(String imie) {
        super (imie);
    }

    @Override
    public boolean jestDorosly() {
        return false;
    }
    public void przedstawSie() {
        System.out.println("Who's asking? I'm " + imie);
    }
}
