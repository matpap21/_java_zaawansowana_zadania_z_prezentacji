package Exeptions;

public class MainLiczby {
    public static void main(String[] args) {

        int dzielna = 10;
        int dzielnik = 0;

        try {
            double wynik = dzielna / dzielnik;
            System.out.println (wynik);

        } catch (ArithmeticException ae) {
            System.err.println ("Dividing by 0 is not possible" );
        }
    }
}
