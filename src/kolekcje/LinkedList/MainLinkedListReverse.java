package kolekcje.LinkedList;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainLinkedListReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Provide anything, the output will be in reversed order" );
        String slowa = scanner.nextLine ( );

        String slowawlasne = "MROKOS";
        List<String> stringList = new LinkedList<String> ( );

        for (int i = 0; i < slowa.length ( ); i++) {
            stringList.add (String.valueOf (slowa.charAt (i)));
        }


        System.out.println ("Txt in original form converted to list");
        System.out.println (stringList);
        System.out.println ("Txt converted above into reverse order to list");
        stringList = reverseLinkedList ((LinkedList<String>) stringList);
        System.out.println (stringList);
        System.out.println ("Reversed txt excluding table" );
        System.out.println (reverseStringvalue (slowa) );

    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
        LinkedList<String> revLinkedList = new LinkedList<String> ( );
        for (int i = llist.size ( ) - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revLinkedList.add (llist.get (i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }

    public static String reverseStringvalue(String slowa){
        StringBuilder stringBuilder = new StringBuilder ( slowa );
        stringBuilder.reverse ();
        return stringBuilder.toString ();
    }

}
