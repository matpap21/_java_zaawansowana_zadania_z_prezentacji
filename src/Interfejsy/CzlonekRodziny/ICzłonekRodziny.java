package Interfejsy.CzlonekRodziny;

public abstract class ICzłonekRodziny {
    public String imie;

    public ICzłonekRodziny(String imie) {
        this.imie =imie;
    }



    public void przedstawSie(String imie){
        System.out.println ("I am just a simple\n" +
                "family member" );
    }
    public abstract boolean jestDorosly();

    public abstract void przedstawSie();
}

