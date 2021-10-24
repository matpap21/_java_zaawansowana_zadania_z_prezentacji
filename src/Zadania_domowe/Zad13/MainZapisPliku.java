package Zadania_domowe.Zad13;
//Napisz aplikację która otwiera plik 'output_1.txt', zapisuje do niego
//"Hello World!" a następnie zamyka plik.

import java.io.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class MainZapisPliku {
    public static void main(String[] args) {

        String sciezkaRelatywna = "output_1.txt";
        File file = new File (sciezkaRelatywna);

        // Czy istnieje?
        System.out.println ("Czy istnieje? " + file.exists ( ));
        if (file.exists ( )) {

            System.out.println ("Sciezka absolutna: " + file.getAbsolutePath ( ));
            System.out.println ("Sciezka relative: " + file.getPath ( ));
            System.out.println ("Nazwa: " + file.getName ( ));
            System.out.println ("Czy jest katalogiem: " + file.isDirectory ( ));
            System.out.println ("Wielkosc: " + file.length ( ));
            System.out.println ("Data ostatniej modyfikacji: " + file.lastModified ( ));

            Timestamp timestamp = new Timestamp (file.lastModified ( ));
            LocalDateTime localDate = timestamp.toLocalDateTime ( );
            System.out.println ("Data ostatniej modyfikacji: " + localDate);

        } else {
            System.out.println ("File not exists");
        }


        try (PrintWriter printWriter = new PrintWriter (new FileOutputStream (file))) {

            for (int i = 0; i < 5; i++) {
                String linia = "MorsMordre";

                printWriter.println (linia);
                printWriter.flush ( );

            }


        } catch (FileNotFoundException e) {
            System.err.println ("File not exists");
        } catch (IOException ioe) {
            System.err.println ("Error");
        }


    }
}
