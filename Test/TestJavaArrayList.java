import kolekcje.ArrayLista.MainArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith (JUnit4.class)
public class TestJavaArrayList {
    public static List<Integer> TEST_INTEGER_LIST;

    @Before
     public void BeforeTestingList(){
        TEST_INTEGER_LIST = new ArrayList<> (Arrays.asList (1,2,3));
    }

    @Test
    public void test_sprawdzCzyZawieraElement_true(){
        Assert.assertEquals (true, MainArrayList.sprawdzCzyZawieraElement (TEST_INTEGER_LIST,1));
    }
    @Test
    public void test_sprawdzCzyZawieraElement_fale() {
        Assert.assertEquals (false,MainArrayList.sprawdzCzyZawieraElement (TEST_INTEGER_LIST,15));

    }
    @Test
    public void test_sprawdzCzyZawieraElement_false_with_null(){
        Assert.assertEquals (false,MainArrayList.sprawdzCzyZawieraElement (TEST_INTEGER_LIST,null));
    }
    @Test
    public void test_znajdzElementNaIndeksie(){
        Assert.assertEquals (0,MainArrayList.znajdzElementNaIndeksie (TEST_INTEGER_LIST,1));
    }
    @Test
    public void test_UsuwanieElementu(){
        Assert.assertEquals (3,TEST_INTEGER_LIST.size ());
        TEST_INTEGER_LIST.remove (1);
        Assert.assertEquals (2,TEST_INTEGER_LIST.size ());
    }
    @Test
    public void test_ClearAll(){
        Assert.assertEquals (3,TEST_INTEGER_LIST.size ());
        TEST_INTEGER_LIST.clear ();
        Assert.assertEquals (0,TEST_INTEGER_LIST.size ());
    }
}
