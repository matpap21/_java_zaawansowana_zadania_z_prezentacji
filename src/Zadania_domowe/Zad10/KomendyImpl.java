package Zadania_domowe.Zad10;

public class KomendyImpl implements Komendy {
    public void show(){
        System.out.println (Komendy.class.getFields ().toString ());
    }
}
