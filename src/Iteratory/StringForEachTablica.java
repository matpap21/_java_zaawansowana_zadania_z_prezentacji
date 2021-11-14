package Iteratory;

import java.util.ArrayList;
import java.util.List;

public class StringForEachTablica {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<> ( );

        for (int i = 0; i < 10; i++) {
            stringList.add (String.valueOf (i));

        }

        String [] kopia = new String[stringList.size ( )];
        kopia = stringList.toArray ( kopia );


        for (String element:kopia) {
            if (element.equals ("5")|| element.equals ("6") || element.equals ("7")) {
                stringList.remove (element);
            }
        }
        System.out.println (stringList );
    }
}
