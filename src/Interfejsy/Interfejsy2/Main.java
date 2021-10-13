package Interfejsy.Interfejsy2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<ICzłonekRodziny> ICzłonekRodzinyList = new ArrayList<> (  );
        ICzłonekRodzinyList.add (new Mama ("Hanna"));
        ICzłonekRodzinyList.add (new Tata ("Dariusz"));
        ICzłonekRodzinyList.add (new Syn ("Mateo"));
        ICzłonekRodzinyList.add (new Corka ("Sylwia"));

        for (ICzłonekRodziny rodzina: ICzłonekRodzinyList){
            System.out.println (rodzina.getClass ().getName ());
            System.out.println (rodzina.getClass ().toString () );
            rodzina.przedstawSie ();
            System.out.println ("Czy dorosły/dorosła ? " + rodzina.jestDorosly ());
            System.out.println ( );

        }

    }
}
