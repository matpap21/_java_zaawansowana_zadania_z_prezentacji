package paradygmaty.interf1;

public class Kot implements Drapieżnik, Ssaki{
    @Override
    public void przytulajSie() {
        Drapieżnik.super.przytulajSie();
//        Ssaki.super.przytulajSie();
    }
}
