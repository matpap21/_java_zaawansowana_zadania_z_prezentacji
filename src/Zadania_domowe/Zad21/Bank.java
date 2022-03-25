package Zadania_domowe.Zad21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {

    // Thread thread = new Thread (  );
   // ExecutorService service = Executors.newSingleThreadExecutor ();
    private ExecutorService executorService = Executors.newFixedThreadPool (5);
    private KontoBankowe2 kontoBankowe2 = new KontoBankowe2 ();


    public void wplata(double kwota){
        executorService.submit (new OperacjeBankowe (TypOperacji.WPLATA_NA_KONTO,kwota,kontoBankowe2));
    }

    public void wyplata(double kwota){
        executorService.submit (new OperacjeBankowe (TypOperacji.WYPLATA_Z_KONTA,kwota,kontoBankowe2));
    }

    public KontoBankowe2 getKontoBankowe2() {
        return kontoBankowe2;
    }
}
