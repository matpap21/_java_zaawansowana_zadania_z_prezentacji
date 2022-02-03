package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    //private Thread thread = new Thread (  );
    //private ExecutorService executorService = Executors.newSingleThreadExecutor ();
    private ExecutorService executorService = Executors.newFixedThreadPool (5);
    private KontoBankowe kontoBankowe = new KontoBankowe ();

    public void wplata(double kwota){
        executorService.submit (new OperacjeBankowe (TypOperacji.WPlATA, kwota,kontoBankowe));
    }

    public void wyplata(double kwota){
        executorService.submit (new OperacjeBankowe (TypOperacji.WYPLATA,kwota,kontoBankowe));
    }

    public KontoBankowe getKontoBankowe() {
        return kontoBankowe;
    }
}
