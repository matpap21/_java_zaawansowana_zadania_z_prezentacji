package Threading;

public class KontoBankowe {
    private Double stanKontaBankowego;
    private final Object locked = new Object ();

    public KontoBankowe() {
        this.stanKontaBankowego = 0.0;
    }

    public void wplata(double kwota) {
        // sekcja krytyczna
        // zjawisko wyścigów
        // nakładamy synchronizację (mutex)
        synchronized (locked) {
            this.stanKontaBankowego = this.stanKontaBankowego + kwota;
        }
    }
    public void wyplata(double kwota) {
        // sekcja krytyczna
        // zjawisko wyścigów
        // nakładamy synchronizację (mutex)

        synchronized (locked) {
            this.stanKontaBankowego = stanKontaBankowego - kwota;
        }
    }
    public void wypiszStanKontaBankowego(){
        System.out.println ("Stan Konta Bankowego " + stanKontaBankowego );
    }


}
