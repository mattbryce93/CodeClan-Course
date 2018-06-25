import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio1;

    @Before
    public void setUp() throws Exception {
        radio1 = new Radio("Senheisser", "Tuney");
    }

    @Test
    public void hasMake() {
        assertEquals("Senheisser", radio1.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Tuney", radio1.getModel());
    }

    @Test
    public void canTune() {
        assertEquals("Radio 1", radio1.tune(98));
    }
}
