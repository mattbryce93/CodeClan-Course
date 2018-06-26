import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setUp() throws Exception {
        till = new Till(10);
    }

    @Test
    public void hasBalance() {
        assertEquals(10, till.getBalance(), 0.01);
    }
}
