package Zadania_domowe.Zad7;

import java.util.HashSet;
import java.util.Set;

public class ParaLiczb {
    public static void main(String[] args) {


        Pairs pair1 = new Pairs (1,2);
        Pairs pair2 = new Pairs (2,1);
        Pairs pair3 = new Pairs (1,1);
        Pairs pair4 = new Pairs (1,2);

        Set<Pairs> pairs = new HashSet<> (  );
        pairs.add (pair1);
        pairs.add (pair2);
        pairs.add (pair3);
        pairs.add (pair4);

        for (Pairs zbiory: pairs){
            System.out.println (zbiory );
        }
    }
}
