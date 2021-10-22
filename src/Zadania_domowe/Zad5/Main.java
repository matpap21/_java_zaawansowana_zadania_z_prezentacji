package Zadania_domowe.Zad5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Provide name");
        String name = scanner.next ( );
        System.out.println ("Provide surname");
        String surname = scanner.next ( );


        Gender gender = GenderProvidedbyUser (scanner);

        Citizen person1 = new Citizen (name, surname, GenderProvidedbyUser (scanner));
        System.err.println (person1 );


    }

    private static Gender GenderProvidedbyUser(Scanner scanner) {

        Gender gender = null;

        do {
            try {
                //System.out.println (Arrays.asList (Gender.values () ) );
                System.out.println ("Provide gender");
                for (Gender elements : Gender.values ( )) {
                    System.out.println (" - " + elements);
                }
                String UserInput = scanner.next ( );
                gender = Gender.valueOf (UserInput.toUpperCase ());

            } catch (IllegalArgumentException eae) {
                System.err.println ("Incorrect data provided, please try again");
            }

        }while (gender == null) ;
        return gender;
    }
}





