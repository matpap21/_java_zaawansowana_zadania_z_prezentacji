package Enums;

import java.util.Locale;
import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Choose car from the list");

        Cars choosenEnum = null;
        do {
            try {
                System.out.println ("Available cars " );
                for(Cars mark: Cars.values ()){
                    System.out.println (" - " + mark );
                }

                String enteredValueByUser = scanner.next ( );

                 choosenEnum = Cars.valueOf (enteredValueByUser.toUpperCase ());


            } catch (IllegalArgumentException ie) {
                System.err.println ("Invalid mark of car, please try again");
            }
        } while (choosenEnum == null);
        System.out.println ("Choosen car is " + choosenEnum );
    }
}