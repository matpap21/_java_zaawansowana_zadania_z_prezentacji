package Zadania_domowe.Zad13;
//1. Stwórz aplikację która służy do odczytywania danych z plików które zapisaliśmy,
// stwórz main'a w którym sprawdzaj że w katalogu w którym uruchomiłeś program jest plik o nazwie 'output_1.txt'
// który posiada treść "Hello World!".
// Jeśli pliku nie ma lub posiada inną zawartość napisz odpowiedni komunikat.

import java.io.*;

public class OczytPlikuzeSlowamiHelloWorld {
    public static void main(String[] args) {

        String sciezkaAbsolutna = "C:/Users/Mateusz/Desktop/repoz/";
        String sciezkaRelatywna = "output_1.txt";

        File sciezka = new File(sciezkaAbsolutna + sciezkaRelatywna);

        if (new File(String.valueOf(sciezka)).exists()) {
            if (new File(String.valueOf(sciezka)).exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(sciezka))) {
                    if (reader.readLine().equalsIgnoreCase("Hello World!")) {
                        System.out.println("Znaleziono linię!");
                    } else {
                        System.out.println("Nie znaleziono linii!");
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Nie ma takiego pliku");
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            } else {
                System.err.println("Nie ma takiego pliku!");
            }
        }
    }
}
