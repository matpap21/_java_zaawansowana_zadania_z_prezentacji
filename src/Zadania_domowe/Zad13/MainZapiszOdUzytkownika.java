package Zadania_domowe.Zad13;

import java.io.*;
import java.util.Scanner;
//Napisz aplikację w której:
//- wczytaj od użytkownika jedną linię tekstu
//- po wczytaniu linii otwórz plik o nazwie 'output_2.txt'
//- zapisz do pliku linię pobraną od użytkownika
//- zamknij plik

public class MainZapiszOdUzytkownika {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String sciezka = "output_2.txt";

        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream (sciezka))){



            System.out.println ("Write anything" );
            String wejscieUzytkownika= scanner.nextLine ( );
            printWriter.flush ();
            printWriter.println ( wejscieUzytkownika );



        } catch (FileNotFoundException fne){
            System.err.println ("File not exists" );

        }catch (IOException ioe){
            System.err.println ("Error" );
        }
    }
}

