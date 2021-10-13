package Anagram;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Provite two values as a Text" );
        String a = scanner.next ( );
        String b = scanner.next ( );


        System.out.println ("String " + a + " and string " + b + " "+ " are anagrams? :" + checkifStrinsAreAnagrams (a, b));

    }

    public static boolean checkifStrinsAreAnagrams(String a, String b) {
        if (a.length ( ) != b.length ( ))
            return false;

        for (int i = 0; i < a.length ( ); i++) {
            char c = a.charAt (i);
            int index = b.indexOf (c);
            // If index of any character is -1, then two strings are not anagrams
            // If index of character is not equal to -1, then remove the chacter from the
            // String
            if (index != -1) {
                b = b.substring (0, index) + b.substring (index + 1, b.length ( ));
            } else
                return false;
        }
        return b.isEmpty ( );
    }
}
