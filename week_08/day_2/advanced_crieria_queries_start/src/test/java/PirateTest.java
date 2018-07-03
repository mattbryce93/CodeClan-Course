import models.Pirate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PirateTest {

    Pirate pirate;

    @Before
    public void before(){
        pirate = new Pirate("Jack", "Jarvis", 67);
    }

    @Test
    public void hasFirstName(){
        assertEquals("Jack", pirate.getFirstName());
    }

    @Test
    public void hasLastName(){
        assertEquals("Jarvis", pirate.getLastName());
    }

    @Test
    public void hasAge(){
        assertEquals(67, pirate.getAge());
    }
}