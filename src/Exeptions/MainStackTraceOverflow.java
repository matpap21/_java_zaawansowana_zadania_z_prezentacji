package Exeptions;

public class MainStackTraceOverflow {
    public static void main(String[] args) {

        metoda();
    }

    private static void metoda() {
        metoda ();
    }
}
