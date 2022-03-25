package Zadania_domowe.Zad21;

public class OperacjeBankowe implements Runnable{
    private TypOperacji typOperacji;
    private double kwota;
    private KontoBankowe2 kontoBankowe2;

    public OperacjeBankowe(TypOperacji typOperacji, double kwota, KontoBankowe2 kontoBankowe2) {
        this.typOperacji = typOperacji;
        this.kwota = kwota;
        this.kontoBankowe2 = kontoBankowe2;
    }


    @Override
    public void run() {
        if (typOperacji == TypOperacji.WPLATA_NA_KONTO){
            kontoBankowe2.wplata (kwota);
        }else if (typOperacji == TypOperacji.WYPLATA_Z_KONTA){
            kontoBankowe2.wyplata (kwota);
        }
    }
}
