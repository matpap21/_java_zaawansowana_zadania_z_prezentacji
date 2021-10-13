package kolekcje.Polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ptak bird1 = new Ptak ();
        bird1.spiewaj ();
        Ptak bird2 = new Kukulka ();
        bird2.spiewaj ();
        Ptak bird3 = new Bocian ();
        bird3.spiewaj ();
        Ptak bird4 = new Sowa ();
        bird4.spiewaj ();

        System.out.println ("=======================================" );

        List<Ptak> ptaki = new ArrayList<> (  );
        ptaki.add (new Kukulka ());
        ptaki.add (new Sowa ());
        ptaki.add (new Bocian ());
        ptaki.add (new Sowa ());
        ptaki.add (new Bocian ());
        ptaki.add (new Kukulka ());

        for (int i =0; i< ptaki.size ( );i++){
            ptaki.get (i).spiewaj ();

        }
        System.out.println ("======================================" );
        for (Ptak spiew: ptaki
             ) {
            spiew.spiewaj ();

        }
    }
}
