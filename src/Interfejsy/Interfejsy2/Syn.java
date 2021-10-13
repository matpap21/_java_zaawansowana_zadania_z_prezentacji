package Interfejsy.Interfejsy2;

public class Syn extends ICzłonekRodziny{
    public Syn(String imie) {
        super (imie);
    }
    public void przedstawSie(){
        System.out.println ("“who’s asking? " + imie);
    }
    public boolean jestDorosly(){
        return false;
    }
}
