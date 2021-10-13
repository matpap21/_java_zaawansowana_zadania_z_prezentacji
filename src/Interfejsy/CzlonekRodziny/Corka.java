package Interfejsy.CzlonekRodziny;

public class Corka extends ICzłonekRodziny{

public Corka(String imie){
    super (imie );
}

    @Override
    public boolean jestDorosly() {
        return false;
    }

    @Override
    public void przedstawSie() {
        System.out.println("i am\n" +
                "daughter ;) " + imie);
    }
}
