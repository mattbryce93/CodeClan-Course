import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer cdPlayer1;

    @Before
    public void setUp() throws Exception {
        cdPlayer1 = new CdPlayer("Toshiba", "Pocket-Boy", 4);
    }

    @Test
    public void hasMake() {
        assertEquals("Toshiba", cdPlayer1.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Pocket-Boy", cdPlayer1.getModel());
    }

    @Test
    public void hasCdList() {
        assertEquals(4, cdPlayer1.getCdList());
    }

    @Test
    public void canPlay() {
        assertEquals("CD is playing!", cdPlayer1.play());
    }
}
