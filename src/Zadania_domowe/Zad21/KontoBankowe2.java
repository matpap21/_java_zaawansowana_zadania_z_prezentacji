package Zadania_domowe.Zad21;

public class KontoBankowe2 {
    private Double stanKontaBankowego;
    private final Object locked = new Object ();

    public KontoBankowe2() {
        this.stanKontaBankowego = 0.0;
    }

    public void wplata(double kwota) {
        synchronized (locked) {
            this.stanKontaBankowego = this.stanKontaBankowego + kwota;
        }
    }
    public void wyplata(double kwota) {
        synchronized (locked) {
            this.stanKontaBankowego = this.stanKontaBankowego - kwota;
        }
    }

    public void wypiszStanKontaBankowego(){
        System.out.println ("Stan Konta Bankowego: " +stanKontaBankowego );
    }
}
