package Interfejsy.Interfejsy2;

public class Corka extends ICzłonekRodziny{
    public Corka(String imie) {
        super (imie);
    }
    public void przedstawSie(){
        System.out.println ("I am your daughter " + imie);
    }
    public boolean jestDorosly(){
        return false;
    }

}
