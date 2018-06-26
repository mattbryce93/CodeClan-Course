import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("Yamaha", "1500X");
    }

    @Test
    public void hasMake() {
        assertEquals("Yamaha", engine.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("1500X", engine.getModel());
    }
}
