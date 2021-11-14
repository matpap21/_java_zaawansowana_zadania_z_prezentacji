package Iteratory;

import java.util.ArrayList;
import java.util.List;

public class IntegerFori {
    public static void main(String[] args) {
        List<Integer> intigerList = new ArrayList<> (  );

        for (int i = 0; i < 10; i++) {
            intigerList.add (i);

        }

        //usun indeksy 5,6,7
        for (int i = 0; i < intigerList.size ( ); i++) {
            if(intigerList.get (i) ==5 || intigerList.get (i) ==6 || intigerList.get (i) ==7){
                //usuwam wartosc (typ usuwany typ obiektu usuwanego, ktory zostal podany jako parametr to Integer
                intigerList.remove (new Integer (i));

                //usuwanie indeksu (typ usuwany to int)
                intigerList.remove (i);
            }

        }
        System.out.println (intigerList);


    }
}
