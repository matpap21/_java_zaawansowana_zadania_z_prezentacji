package Zadania_domowe.Zad11;

public abstract class ICzłonekRodziny {
    public String name;


    public void przedstawsie(){
        System.out.println ( "I am just a simple family member");
    }

    public ICzłonekRodziny(String name) {
        this.name = name;
    }

    public boolean jestDorosly() {
        return false;
    }
}
