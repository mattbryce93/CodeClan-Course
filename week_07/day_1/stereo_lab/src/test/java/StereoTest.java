import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo1;
    CdPlayer cdPlayer1;
    RecordDeck recorddeck1;
    Radio radio1;
    ArrayList<Component> components;

    @Before
    public void setUp() throws Exception {
        stereo1 = new Stereo("Boom-box", "MU-20");
        cdPlayer1 = new CdPlayer("Toshiba", "Pocket-Boy", 4);
        recorddeck1 = new RecordDeck("Yamaha", "CS400", 3);
        radio1 = new Radio("Senheisser", "Tuney");
        components = new ArrayList<Component>();
        components.add(cdPlayer1);
        components.add(recorddeck1);
        components.add(radio1);
    }

    @Test
    public void hasMake() {
        assertEquals("Boom-box", stereo1.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("MU-20", stereo1.getModel());
    }

    @Test
    public void startsWithNoComponents() {
        assertEquals(0, stereo1.getComponents().size());
    }

    @Test
    public void canAddComponents() {
        stereo1.addComponents(components);
        assertEquals(3, stereo1.getComponents().size());
    }

    @Test
    public void canTuneRadio(){
        stereo1.addComponents(components);
        assertEquals("Radio 1", stereo1.tuneRadio(98));
    }

    @Test
    public void canPlayRecordDeck() {
        stereo1.addComponents(components);
        assertEquals("Record is playing!", stereo1.playRecord());
    }

    @Test
    public void canPlayCdPlayer() {
        stereo1.addComponents(components);
        assertEquals("CD is playing!", stereo1.playCD());
    }
}
