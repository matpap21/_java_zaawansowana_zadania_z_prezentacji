package kolekcje.Copmarator;

import obj.Obywatel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListandSorting {
    public static void main(String[] args) {


        Obywatel o1 = new Obywatel(111111111, "Jan", "Kowalski");
        Obywatel o2 = new Obywatel(111111112, "Marian", "Kowalski");
        Obywatel o3 = new Obywatel(111111113, "Miłosz", "Kowalski");
        Obywatel o4 = new Obywatel(111111114, "Filip", "Kowalski");
        Obywatel o5 = new Obywatel(111111115, "Grażyna", "Nowak");


        List<Obywatel> citizens = new ArrayList<> (Arrays.asList (o1,o2,o3,o4,o5));

        System.out.println ("Before comparing " + citizens );

        ComparingCitizien comparingCitizien = new ComparingCitizien ();
        citizens.sort (comparingCitizien);
        System.out.println ("======================================" );
        System.out.println ("After comparing " + citizens);

        System.out.println ("======================================" );
        ComparingCitizenReversed comparingCitizenReversed = new ComparingCitizenReversed ();
        citizens.sort (comparingCitizenReversed);
        System.out.println ("======================================" );
        System.out.println ("After comparing with reversed " + citizens);


    }
}
