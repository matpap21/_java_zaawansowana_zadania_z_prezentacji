package Zadania_domowe.Zad12.AbstrakcjaSoldier2;

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
        Person person;

        if (response.toUpperCase ( ).contains ("YES") || response.toUpperCase ( ).contains ("TAK")
                || "y".equalsIgnoreCase (response) || "t".equalsIgnoreCase (response)) { // unikamy obslugi wyjatku
            SoldierRank soldierRank = null;
            do {
                try {
                    System.out.println ("Provide Your Soldier Rank: ");
                    for (SoldierRank elements: SoldierRank.values ()){
                        System.out.println (" - " + elements );
                    }
                    String rankString = scanner.nextLine ( );
                    soldierRank = SoldierRank.valueOf (rankString.toUpperCase ());

                } catch (IllegalArgumentException ime){
                    System.err.println ("Incorrect data provided, please try again" );
                }
            } while (soldierRank == null);

            person = new Soldier (name, surname, soldierRank);
        }else {
            person = new Civilian (name,surname);
        }

        person.presentYourself ();

    }
}
