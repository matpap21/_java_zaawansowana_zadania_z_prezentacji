package Enums;

import java.util.Locale;
import java.util.Scanner;

public class MainPizza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj wielkosc pizzy: ");
         int choosenPizzabyUser = scanner.nextInt ( );

        PizzaSize pizzaSize = PizzaSize.valueOf (String.valueOf (choosenPizzabyUser));
        System.out.println ("Size of choosen pizza is " + pizzaSize.getSIZE () );


    }
}
