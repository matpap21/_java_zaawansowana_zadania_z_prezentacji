package kolekcje.Comparator;

import obj.Obywatel;

import java.util.Comparator;

public class ComparingCitizenReversed implements Comparator<Obywatel> {
    @Override
    public int compare(Obywatel o1, Obywatel o2) {
        return o2.getName ().compareTo (o1.getName ( ));
    }


    }
