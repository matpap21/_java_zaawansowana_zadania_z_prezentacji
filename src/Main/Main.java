package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Random random = new Random ( );

        List<Integer> list = new ArrayList<> ();
        System.out.println ("Podaj 5 liczb");
        int liczba = 0;
        for (int i = 0; i < 5; i++) {
            liczba = scanner.nextInt ( );
            list.add (liczba);
        }

        for (int i =0; i< 5; i++){
            int liczba_random = random.nextInt (500);
            list.add (liczba_random);

        }

        System.out.println (list );
    }
}
