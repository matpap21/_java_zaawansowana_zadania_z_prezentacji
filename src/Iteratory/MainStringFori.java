package Iteratory;

import java.util.ArrayList;
import java.util.List;

public class MainStringFori {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<> ( );

        for (int i = 0; i < 10; i++) {
            stringList.add (String.valueOf (i));

        }

        for (int i = 0; i < stringList.size ( ); i++) {
            if (stringList.get (i).equals ("5")|| stringList.get (i).equals("6") || stringList.get (i).equals ("7")) {
                //usuwam wartosc (typ usuwany typ obiektu usuwanego, ktory zostal podany jako parametr to Integer
                stringList.remove(i);
                i = i-1;

            }
        }
        System.out.println (stringList );
    }
}