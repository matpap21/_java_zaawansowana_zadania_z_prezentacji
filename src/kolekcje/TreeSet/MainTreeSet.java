package kolekcje.TreeSet;



import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {

        Set<Integer> TreeSet = new TreeSet<> (Arrays.asList (10, 12, 10, 10, 3, 4, 12, 12, 300, 12, 40, 55));

        //Wypisz liste elementow na ekran
        System.out.println ("Wypisz liste elementow na ekran");
        System.out.println (TreeSet);

        //Wypisz wszystkie elementy zbioru na ekran
        System.out.println ("Wypisz wszystkie elementy zbioru na ekran");
        for (Integer elementy : TreeSet
        ) {
            System.out.println (elementy);
        }
        //Usun elementy 10 i 12" wykonaj podpunty powyzej
        System.out.println ("Usun elementy 10 i 12");
        TreeSet.remove (10);
        TreeSet.remove (12);

        //Wypisz liste elementow na ekran
        System.out.println ("Wypisz liste elementow na ekran");
        System.out.println (TreeSet);

        //Wypisz wszystkie elementy zbioru na ekran
        System.out.println ("Wypisz wszystkie elementy zbioru na ekran");
        for (Integer elementy : TreeSet) {
            System.out.println (elementy);
        }
    }
}
