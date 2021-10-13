package Interfejsy.Interfejsy2;

public class Mama extends ICzłonekRodziny{
    public Mama(String imie) {
        super (imie);
    }
    public void przedstawSie(){
        System.out.println ("I am Your mother " + imie);
    }
    public boolean jestDorosly(){
        return true;
    }
}
