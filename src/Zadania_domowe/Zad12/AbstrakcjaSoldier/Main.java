package Zadania_domowe.Zad12.AbstrakcjaSoldier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Please provide Your name");
        String name = scanner.nextLine ( );

        System.out.println ("Please provide Your surname");
        String surname = scanner.nextLine ( );

        System.out.println ("Are You from Special Forces");
        String response = scanner.nextLine ( );


        Person2 person2;

        if (response.toUpperCase ( ).contains ("YES") || response.toUpperCase ( ).contains ("Y")) {

            SoldierRank soldierRank = null;
            do {
                try {
                    System.out.println ("Please provide to which Special Forces mainly You belongs to " );
                    for(SoldierRank forces: SoldierRank.values ()){
                        System.out.println ( " - " + forces );
                    }
                    String ValueFromUSer = scanner.nextLine ( );
                    soldierRank = SoldierRank.valueOf (ValueFromUSer.toUpperCase ( ));

                } catch (IllegalArgumentException iae) {
                    System.err.println ("Incorrect, please try again");
                }

            } while (soldierRank == null);
            person2 = new Soldier (name, surname, soldierRank);
        } else {
            person2 = new Civilian (name, surname);
        }
        person2.PresentYourself ( );

    }
}
