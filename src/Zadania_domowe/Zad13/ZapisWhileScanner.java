package Zadania_domowe.Zad13;

import java.io.*;
import java.util.Scanner;
//Należy napisać aplikację która w pętli while czyta ze Scannera
//wejście użytkownika z konsoli, a następnie linia po linii wypisuje
//tekst do pliku 'output_3.txt'. Aplikacja ma się zamykać po wpisaniu
//przez użytkownika komendy "quit"

public class ZapisWhileScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String sciezka = "output_3.txt";
        System.out.println ("Provide anything, system will save the data in database" );
        String wejscieUzytkownika;

        try (PrintWriter printWriter = new PrintWriter (new FileOutputStream (sciezka))) {
            do {
                 wejscieUzytkownika = scanner.nextLine ();
                if(wejscieUzytkownika.toUpperCase ().equalsIgnoreCase ("QUIT")){
                    break;
                }
                printWriter.flush ();
                printWriter.println ( wejscieUzytkownika );

            }while (!wejscieUzytkownika.toUpperCase ().equalsIgnoreCase ("QUIT"));{
                System.out.println ("End" );
            }
        }catch (FileNotFoundException ioe) {
            System.err.println ("File not exists" );
        }

        try(BufferedReader bufferedReader = new BufferedReader (new FileReader (sciezka))){
            System.out.println ("Your values entered to file" );
            bufferedReader.lines ().forEach (lines -> {System.out.println (lines );});

        }catch (FileNotFoundException fnfe){
            System.err.println ("File not exists" );
        } catch (IOException e) {
            System.err.println ("File not exists" );
        }
    }
}

