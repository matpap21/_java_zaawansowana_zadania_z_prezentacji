package Palindrom;

import java.util.Scanner;

public class Palindrom {

    public static boolean Palindrom(String str) {
        int dlugosc = str.length ( );

        char[] literki = str.toCharArray ( );
        int odPrzodu = 0;
        int odTylu = dlugosc - 1;

        while (odPrzodu <= odTylu) {
            while (literki[odPrzodu] == ' ') {
                odPrzodu++;
            }
            while (literki[odTylu] == ' ') {
                odTylu--;
            }
            if (literki[odPrzodu] != literki[ odTylu ]) {
                return false;
            }
            odTylu--;
            odPrzodu++;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println (Palindrom("eye"));
        System.out.println (Palindrom("never odd or even"));
        System.out.println (Palindrom("taco cat") );
        System.out.println (Palindrom2 ("eye") );
        System.out.println (Palindrom2 ("never odd or even"));
        System.out.println (Palindrom2("taco cat") );

    }

    public static boolean Palindrom2(String str){
        // zamiana spacji, wtedy mamy symetryczny ciag znakow
        char[] literki = str.replaceAll (" ", "").toCharArray ();
        // iterujemy do polowy dlugosci ciagu tekstu
        for (int i = 0; i < str.length ()/2; i++) {
            //porownujemy jeden element od poczatku (charAt(i)) z elementem
            //porownujemy jeden element od konca (charAt(dlugosc - 1 - i))

            // i sprawia, ze petla idzie do przodu od poczatku
            // i sprawia, ze petla idzie do tylu od konca (dlugosc -i)

            //poniewaz elementy tekstu sa iterowane od 0, to ostatni znak jest tak na prawde w indeksie (dlugosc - 1)
            if (str.charAt (i) != str.charAt (str.length ( ) - 1 - i)) {
                // jesli jakikolwiek znak nie pasuje, zwracamy false
                return false;
            }
        }
        // jesli udalo sie wrocic i nie znalezc niepasujacych liter - zwracamy true
        return true;
    }
}
