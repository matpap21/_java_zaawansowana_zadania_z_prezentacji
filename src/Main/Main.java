package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Random random = new Random ( );

        List<Integer> list = new ArrayList<> ();
        System.out.println ("Podaj 5 liczb");
        int liczba = 0;
        for (int i = 0; i < 5; i++) {
            liczba = scanner.nextInt ( );
            list.add (liczba);


        }

        for (int i =0; i< 5; i++){
            int liczba_random = random.nextInt (500);
            list.add (liczba_random);

        }

        System.out.println (list );


        String slowa = "MROKOS";

        List<String> stringList = new LinkedList<String> (  );


        for (int i = 0; i < slowa.length (); i++) {
            stringList.add (String.valueOf (slowa.charAt (i)));
        }


        System.out.println ("Tekst w formacie oryginalnym" );
        System.out.println (stringList );
        System.out.println ("Tekst po sformatowaniu" );
        stringList = reverseLinkedList((LinkedList<String>) stringList);
        System.out.println (stringList );
        
    }



    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }

}
