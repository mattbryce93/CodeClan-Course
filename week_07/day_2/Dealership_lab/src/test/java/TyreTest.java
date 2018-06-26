import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void setUp() throws Exception {
        tyre = new Tyre("Michelin", "900Z");
    }

    @Test
    public void hasMake() {
        assertEquals("Michelin", tyre.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("900Z", tyre.getModel());
    }
}
