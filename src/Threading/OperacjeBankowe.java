package Threading;

public class OperacjeBankowe  implements Runnable{
    private TypOperacji typOperacji;
    private double kwota;
    private KontoBankowe kontoBankowe;

    public OperacjeBankowe(TypOperacji typOperacji, double kwota, KontoBankowe kontoBankowe) {
        this.typOperacji = typOperacji;
        this.kwota = kwota;
        this.kontoBankowe = kontoBankowe;
    }

    @Override
    public void run() {
        if(typOperacji == TypOperacji.WPlATA){
            kontoBankowe.wplata (kwota);
        }else if (typOperacji == TypOperacji.WYPLATA){
            kontoBankowe.wyplata (kwota);
        }
    }
}
