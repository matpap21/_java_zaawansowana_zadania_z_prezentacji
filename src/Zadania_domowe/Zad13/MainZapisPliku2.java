package Zadania_domowe.Zad13;


import java.io.*;

public class MainZapisPliku2 {
    public static void main(String[] args) throws FileNotFoundException {

        String sciezkaRelatywna = "output_1.txt";

        File sciezka = new File (sciezkaRelatywna);
        BufferedReader reader = new BufferedReader (new FileReader (sciezka));

        try (PrintWriter printWriter = new PrintWriter
                (new FileOutputStream (sciezka))) {
            String newLine;
            newLine = "MorsMordre";
            for (String line;
             (line = reader.readLine ( )) != null; ) {
                line = line.replace (newLine, " ");
            }
            printWriter.flush ( );
            printWriter.println (newLine);
            printWriter.flush ( );

        } catch (FileNotFoundException e) {
            System.out.println ("File not exist");
        } catch (IOException e) {
            System.out.println ("Error");
        }
    }
}
