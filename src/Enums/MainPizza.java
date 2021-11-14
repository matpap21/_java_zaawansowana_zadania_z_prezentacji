package Enums;

import java.util.Scanner;

public class MainPizza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj wielkosc pizzy: ");
         String choosenPizzabyUser = scanner.next ( ).toUpperCase ();

        PizzaSize pizzaSize = PizzaSize.valueOf ( choosenPizzabyUser);
        System.out.println ("Size of choosen pizza is " + pizzaSize.getSIZE () );


    }
}
