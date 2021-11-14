package Zadania_domowe.Zad13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class OdczytCalegoPlikuScanner {
    public static void main(String[] args) {

        String sciezka = "output_3.txt";

        if (new File (sciezka).exists ()){
            try (Scanner scanner =new Scanner (new FileReader (sciezka))){

                String line;
                while (scanner.hasNextLine ()){
                    line = scanner.nextLine ();
                    System.out.println (line );
                }

            }catch (FileNotFoundException e) {
                System.err.println ("File not exists" );            }
        }else {
            System.err.println ("File not exists" );
        }
    }
}
