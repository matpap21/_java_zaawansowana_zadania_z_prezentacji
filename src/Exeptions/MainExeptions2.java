package Exeptions;

import java.util.concurrent.ExecutionException;

public class MainExeptions2 {
    public static void main(String[] args) {


       // final int size = 10;
       // int[] tab = new int[size];

      //  if (tab.length > size) {
      //      System.out.println (tab[15]);
      //  }

       // int number = -1;
      //  try {
      //      checkIndexOfNumber (tab, number);
      //  } catch (NumberisToSmall e) {
      //      e.printStackTrace ( );
      //  } finally { //wykona sie zawsze niezaleznie od tego czy pojawil sie blad czy tez nie bylo bledu
      //      System.out.println ("I will always run this part");
      //  }

        wykonajKodzExeption ( );
        System.out.println ("I will too run this part");
        System.out.println ("End of programe");
    }

    /**
     *
     */
    private static void wykonajKodzExeption() {
        final int size = 10;
        int[] tab = new int[size];

        if (tab.length > size) {
            System.out.println (tab[15]);
        }
        int number = -1;
        try {
            checkIndexOfNumber (tab, number);
            return;
        } catch (NumberisToSmall e) {
            e.printStackTrace ( );
        } finally { //wykona sie zawsze niezaleznie od tego czy pojawil sie blad czy tez nie bylo bledu
            System.out.println ("I will always run this part");
        }
    }

    /**
     *
     * @param tab
     * @param number
     * @throws NumberisToSmall
     */
    private static void checkIndexOfNumber(int[] tab, int number) throws NumberisToSmall {
        if (number < 0) {
            throw new NumberisToSmall ( );
        }
    }


}
