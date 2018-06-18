import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BearTest {

    @Test
    public void hasName(){
        Bear bear = new Bear("Baloo", 12);
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        Bear bear = new Bear("Baloo", 12);
        assertEquals(12, bear.getAge());
    }

}
