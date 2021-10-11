package kolekcje.Comparator;

import obj.Obywatel;

import java.util.Comparator;

public class ComparingCitizien implements Comparator<Obywatel> {



    @Override
    public int compare(Obywatel o1, Obywatel o2) {

        //    if(peselo1 > peselo2) {
        //        return 1;
        //    }else if (peselo2 > peselo1){
        //return -1;
        //    }else {
        //        return 0;
        //return Long.compare (peselo1, peselo2);
        return o1.getName ().compareTo (o2.getName ( ));
    }

}
