package Zadania_domowe.Zad13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class OdczytProstyMain {
    public static void main(String[] args) {

        File plikDoOdczytu = new File ("output_3.txt");
        FileInputStream strumienWejsciaPliku = null;
        Scanner scanner = null;


        if (plikDoOdczytu.exists ( )) {
            try {
                strumienWejsciaPliku = new FileInputStream (plikDoOdczytu);
                scanner = new Scanner (strumienWejsciaPliku);

                while (scanner.hasNextLine ( )) {
                    String slowo = scanner.next ( );
                    System.out.println (slowo);
                }


            } catch (FileNotFoundException e) {
                System.err.println ("Nie ma takiego pliku");
            } finally {
                if (scanner != null) {
                    scanner.close ( );
                }
                if (strumienWejsciaPliku != null) {
                    try {
                        strumienWejsciaPliku.close ( );
                    } catch (IOException ioe) {
                        ioe.printStackTrace ( );
                    }
                }
            }
        }
    }
}
