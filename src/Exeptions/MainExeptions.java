package Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExeptions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj 3 liczby");

        for (int i = 0; i<3;i++){
            try {
                double liczba = scanner.nextDouble ();
                System.out.println ("Wprowadzono " + liczba );
            }catch (InputMismatchException ime){
                String ostatnioWpisaneWejscieScannera = scanner.next ();
                System.err.println ("Wprowadzono niepoprawne dane " + ostatnioWpisaneWejscieScannera + " powtórz" );
                i--; // cofamy iterator o 11
            }

        }
    }
}
