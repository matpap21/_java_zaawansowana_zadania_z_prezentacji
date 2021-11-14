package Iteratory;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<> ( );

        for (int i = 0; i < 10; i++) {
            stringList.add (String.valueOf (i));

        }

        java.util.Iterator<String> iterator = stringList.iterator ( );

        //usun indeksy 5,6,7
        while (iterator.hasNext ( )) {
            String wartosc = iterator.next ( );
            if (wartosc.equals ("5") || wartosc.equals ("6") || wartosc.equals ("7")) {
                iterator.remove ( );
            }
        }
        System.out.println (stringList);
    }
}

