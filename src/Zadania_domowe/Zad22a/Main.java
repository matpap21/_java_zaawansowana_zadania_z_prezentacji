package Zadania_domowe.Zad22a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Work work = new Work ();
        Thread thread = new Thread ( work );

        thread.start ();

        Thread sleepingThread = new Thread ( new ThreadSleep () );
        sleepingThread.start ();

        Scanner scanner =  new Scanner (System.in);
        String command;
        boolean activework =true;

        do{
            command = scanner.nextLine ( );
            System.out.println (command );

            if(command.toUpperCase ().equalsIgnoreCase ("STOP")
            || command.toUpperCase ().equalsIgnoreCase ("FINNISH")){
                System.out.println ("STOP/FINISH processing" );
                work.setWorking (false);
            }else if (command.toUpperCase ().equalsIgnoreCase ("QUIT")){
                System.out.println ("Close the programme" );
                activework =false;
            }
        }while (activework);

    }
}
