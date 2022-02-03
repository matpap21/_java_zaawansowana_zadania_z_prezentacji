package Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank ( );
        Scanner scanner = new Scanner (System.in);

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                bank.wplata (10);
            } else {
                bank.wyplata (10);
            }
        }
        String komenda;
        boolean uruchomiony = true;

        do {
            komenda = scanner.nextLine ( );
            System.out.println (komenda);

            if (komenda.equalsIgnoreCase ("stan")) {
                bank.getKontoBankowe ( ).wypiszStanKontaBankowego ( );
            } else if (komenda.equalsIgnoreCase ("quit")) {
                System.out.println ("Zamykam system");
                uruchomiony = false;
            }

        } while (uruchomiony);
        System.out.println ("Opuszczam petle");


    }
}
