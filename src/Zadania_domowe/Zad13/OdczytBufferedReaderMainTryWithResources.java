package Zadania_domowe.Zad13;

import java.io.*;

public class OdczytBufferedReaderMainTryWithResources {
    public static void main(String[] args) {

        File plik = new File ("output_3.txt");

        try (BufferedReader bufferedReader = new BufferedReader (new FileReader (plik))) {

            bufferedReader.lines ().forEach (lines -> System.out.println (lines ) );

            System.out.println ("===============================================" );

            bufferedReader.lines ().forEach (System.out::println);



        } catch (FileNotFoundException e) {
            System.err.println ("File not exists");
        } catch (IOException e) {
            System.err.println ("Error" );
        }
    }
}
