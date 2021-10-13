package Interfejsy.Zwierzeta;

public class Koty implements Drapieżnik,Ssaki{
public String name;

    public Koty(String name) {
        this.name = name;
    }

    @Override
    public void przytulanie() {
        Drapieżnik.super.przytulanie ( );
        Ssaki.super.przytulanie ( );
    }
}

