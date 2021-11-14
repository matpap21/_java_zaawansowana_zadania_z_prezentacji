package Zadania_domowe.Zad13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytProstyMainTryWithResources {
    public static void main(String[] args) {

        File plikDoOdczytu = new File ("output_3.txt");

        if(plikDoOdczytu.exists ()){
            try (Scanner scanner = new Scanner (new FileInputStream (plikDoOdczytu))){

                while (scanner.hasNext ()){
                    String slowo = scanner.next ();
                    System.out.println (slowo );
                }

            }catch (FileNotFoundException e) {
                System.out.println("Nie ma takiego pliku");
            }
        }

    }
}
