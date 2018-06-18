import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BearTest {
    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 12, 400.62);
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(12, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(400.62, bear.getWeight(), 0.01);
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80 (){
        Bear thinBear = new Bear("Smokey", 50, 60);
        assertEquals(false, thinBear.readyToHibernate());
    }

}
