import models.Pirate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PirateTest {

    Pirate pirate;

    @Before
    public void before(){
        pirate = new Pirate("Jack", "Sparrow", 32);
    }

    @Test
    public void hasFirstName(){
        assertEquals("Jack", pirate.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("Sparrow", pirate.getLastName());
    }

    @Test
    public void hasAge(){
        assertEquals(32, pirate.getAge());
    }


}