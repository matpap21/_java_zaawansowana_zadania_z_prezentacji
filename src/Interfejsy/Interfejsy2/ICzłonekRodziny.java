package Interfejsy.Interfejsy2;

public abstract class ICzłonekRodziny {
    public String imie;

    public ICzłonekRodziny(String imie) {
        this.imie = imie;
    }

    public void przedstawSie(){
        System.out.println ("I am just a simple family member " + imie);
    }
    public boolean jestDorosly(){
        return true;
    }
}
