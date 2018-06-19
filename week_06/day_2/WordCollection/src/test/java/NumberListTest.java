import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;

    @Before
    public void setup(){
        ArrayList<Integer> testNumbers = new ArrayList();
        testNumbers.add(1);
        testNumbers.add(2);
        testNumbers.add(3);
        testNumbers.add(4);
        testNumbers.add(5);
        myNumbers = new NumberList(testNumbers);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(5, myNumbers.getNumberCount());
    }

    @Test
    public void canAddToList(){
        myNumbers.addNumber(12);
        assertEquals(6, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
        assertEquals(1, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
        assertEquals(15, myNumbers.getTotal());
    }
}
