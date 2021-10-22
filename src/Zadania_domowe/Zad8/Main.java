package Zadania_domowe.Zad8;

import Zadania_domowe.Zad5.Gender;

import java.util.*;
//Stwórz klasę Student która posiada pola:
//nr indeksu
//imie
//nazwisko
//płeć (wartość enum)
//W mainie stwórz instancję kolekcji typu ArrayList, która zawiera
//obiekty klasy Student.
//Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz
//cokolwiek).
//a. Spróbuj wypisać elementy listy stosując zwykłego
//"sout'a"
//b. Spróbuj wypisać elementy stosując pętlę foreach
//c. Wypisz tylko kobiety
//d. Wypisz tylko mężczyzn
//e. Wypisz tylko indeksy osób

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<> (Arrays.asList (

                new Student (100200, "Gellert", "Grindewalt", Gender.MAN),
                new Student (100201, "Marian", "Kowalski", Gender.MAN),
                new Student (100202, "Lukasz", "Podkladka", Gender.MAN),
                new Student (100203, "Asia", "Rosol", Gender.WOMAN),
                new Student (100204, "Basia", "Kubek", Gender.WOMAN),
                new Student (100205, "Tosia", "Lyzka", Gender.WOMAN),
                new Student (100206, "Zosia", "Myszka", Gender.WOMAN),
                new Student (100207, "Piotr", "Dlugopis", Gender.MAN),
                new Student (100400, "Jan", "Nowak", Gender.MAN)

        ));

        System.out.println ("elementy listy stosując zwykłego sout'a");
        System.out.println (students);
        System.out.println ("elementy stosując pętlę foreach" );
        for (Student studenci : students) {
            System.out.println (studenci);
        }
        System.out.println ("WOMANS" );
        for (Student kobiety : students) {
            if (kobiety.getGender ( ).equals (Gender.WOMAN)) {
                System.out.println (kobiety);
            }

        }
        System.out.println ("MAN" );
        for (Student mezczyzni: students){
            if(mezczyzni.getGender ().equals (Gender.MAN)){
                System.out.println (mezczyzni );
            }
        }



        System.out.println ("INDEKSY" );
        for (Student indeksy: students){
            System.out.println (indeksy.getIndeks () );
        }

        System.out.println ("INDEKSY w odwrotnej kolenosci" );
        Collections.reverse(students);
        for (Student indeksy: students){
            System.out.println (indeksy.getIndeks ( ) );
        }
    }
}
