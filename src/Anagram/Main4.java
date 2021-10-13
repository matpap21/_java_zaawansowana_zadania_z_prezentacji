package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Please provide text to verify if they are anagrams");
        String a = scanner.next ( );
        String b = scanner.next ( );
        scanner.close ();

        isAnagramverification (a, b);
    }

    private static void isAnagramverification(String a, String b) {
        a = a.toUpperCase ( );
        b = b.toUpperCase ( );

        boolean status = true;


        if (a.length ( ) != b.length ( )) {
            status = false;

        } else {

            char[] s1 = a.toCharArray ( );
            char[] s2 = b.toCharArray ( );
            Arrays.sort (s1);
            Arrays.sort (s2);

            if (Arrays.equals (s1, s2)) {
                status = true;
            }
        }if(status){
            System.out.println ("Provided Strings are anagrams" );
        }else{
            System.out.println ("Provided Strings are not anagrams" );
        }
    }
}


