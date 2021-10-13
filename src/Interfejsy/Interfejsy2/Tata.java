package Interfejsy.Interfejsy2;

public class Tata extends ICzłonekRodziny{
    public Tata(String imie) {
        super (imie);
    }

    public void przedstawSie(){
        System.out.println ("I am your father " + imie);
    }
    public boolean jestDorosly(){
        return true;
    }
}
