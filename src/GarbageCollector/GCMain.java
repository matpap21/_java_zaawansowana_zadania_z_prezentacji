package GarbageCollector;

public class GCMain {
    public static void main(String[] args) {

        String tekst = "cwiczenia niekonwencjonalne";

        wypiszIWytnijTekst(tekst);
        System.gc ();
    }

    private static void wypiszIWytnijTekst(String tekst) {
        String wyciety = wytnij(tekst);
        wypisz(wyciety);
        System.gc ();
    }

    private static void wypisz(String wyciety) {
        System.out.println (wyciety.charAt (5) );
        System.out.println (wyciety.substring (5) );
    }

    private static String wytnij(String tekst) {
        int a = 9;
        return tekst.substring (9);
    }

}
