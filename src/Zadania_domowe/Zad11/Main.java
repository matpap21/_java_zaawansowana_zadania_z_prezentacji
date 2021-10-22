package Zadania_domowe.Zad11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ICzłonekRodziny> członekRodzinyList = new ArrayList<> ( );
        członekRodzinyList.add (new Corka ("Tosia"));
        członekRodzinyList.add (new Matka ("Leia"));
        członekRodzinyList.add (new Syn ("Marian"));
        członekRodzinyList.add (new Ojciec ("Darth Vader"));
        członekRodzinyList.add (new Corka ("Zosia"));
        członekRodzinyList.add (new Syn ("Franek"));
        członekRodzinyList.add (new Ojciec ("Luke"));


        System.out.println ("======================================");

        for (ICzłonekRodziny rodzinka : członekRodzinyList) {
            System.out.println(rodzinka.toString ().getClass ().getName ());
            rodzinka.przedstawsie ();
            System.out.println ("Czy jest dorosly/dorosla " + rodzinka.jestDorosly () );
            System.out.println ( );

        }
    }
}
