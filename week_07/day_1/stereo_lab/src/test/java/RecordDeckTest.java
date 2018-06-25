import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recorddeck1;

    @Before
    public void setUp() throws Exception {
        recorddeck1 = new RecordDeck("Yamaha", "CS400", 3);
    }

    @Test
    public void hasMake() {
        assertEquals("Yamaha", recorddeck1.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("CS400", recorddeck1.getModel());
    }

    @Test
    public void hasSpeeds() {
        assertEquals(3, recorddeck1.getSpeeds());
    }

    @Test
    public void canPlay() {
        assertEquals("Record is playing!", recorddeck1.play());
    }
}
