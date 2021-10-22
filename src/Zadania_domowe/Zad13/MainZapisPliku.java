package Zadania_domowe.Zad13;
//Napisz aplikację która otwiera plik 'output_1.txt', zapisuje do niego
//"Hello World!" a następnie zamyka plik.

import java.io.*;

public class MainZapisPliku {
    public static void main(String[] args) {

        String sciezkaRelatywna = "output_1.txt";

        File sciezka = new File (sciezkaRelatywna);

        try (PrintWriter printWriter = new PrintWriter (new FileOutputStream (sciezka))) {
        String linia;
        linia = "Avada Kedavra";

        printWriter.println (linia);
        printWriter.flush ();


        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku.");
        }

    }
}
