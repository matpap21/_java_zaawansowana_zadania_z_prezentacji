package Anagram;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String a = scanner.next ( );
        String b = scanner.next ( );
        scanner.close ( );
        boolean check = isAnagram (a, b);
        System.out.println ((check) ? "Anagrams" : "Not Anagrams");

    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase ( );
        b = b.toLowerCase ( );
        if (a.length ( ) != b.length ( )) {
            return false;
        } else {

            char[] chars = a.toCharArray ( );
            for (char c : chars) {
                int index = b.indexOf (c);
                if (index != -1) {
                    b = b.substring (0, index) + b.substring (index + 1, b.length ( ));
                } else {
                    return false;
                }
            }
            return b.isEmpty ( );
        }
    }
}
