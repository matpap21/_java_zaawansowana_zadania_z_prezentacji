package Iteratory;

import java.util.ArrayList;
import java.util.List;

public class StringForEach {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<> ( );

        for (int i = 0; i < 10; i++) {
            stringList.add (String.valueOf (i));

        }

        List<String> kopia = new ArrayList<> ( stringList );


        for (String element:kopia) {
            if (element.equals ("5")|| element.equals ("6") || element.equals ("7")) {
                stringList.remove (element);
            }
        }
        System.out.println (stringList );
    }
}
