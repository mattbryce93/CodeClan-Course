import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void setUp() throws Exception {
        dealer = new Dealer("Jorp");
    }

    @Test
    public void hasWeirdName() {
        assertEquals("Jorp", dealer.getName());
    }
}
