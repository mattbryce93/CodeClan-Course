import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    MP3 mp3;
    Stereo stereo1;

    @Before
    public void setUp() throws Exception {
        mp3 = new MP3();
        stereo1 = new Stereo("Boom-box", "MU-20");
    }

    @Test
    public void canConnectToStereo() {
        assertEquals("You've connected to a Boom-box MU-20",mp3.connect(stereo1));
    }
}
