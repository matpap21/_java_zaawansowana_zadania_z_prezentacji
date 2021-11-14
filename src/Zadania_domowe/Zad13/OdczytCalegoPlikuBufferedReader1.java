package Zadania_domowe.Zad13;

import java.io.*;

public class OdczytCalegoPlikuBufferedReader1 {
    public static void main(String[] args) {

        String sciezka = "output_3.txt";
        if(new File (sciezka).exists ()){
            try (BufferedReader bufferedReader = new BufferedReader (new FileReader(sciezka))){

                String line = bufferedReader.readLine ();

                while (line != null){
                    System.out.println (line );
                    line = bufferedReader.readLine ();
                }

            }catch (FileNotFoundException fnfe){
                System.err.println ("File not exists" );
            } catch (IOException e) {
                System.err.println ("Error" );
            }
        }else {
            System.out.println ("File not exists" );
        }
    }
}
