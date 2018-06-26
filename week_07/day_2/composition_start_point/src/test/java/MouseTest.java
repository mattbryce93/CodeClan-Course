import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void setUp() throws Exception {
        mouse = new Mouse("wireless", 5);
    }

    @Test
    public void canMove() {
        assertEquals("moving: mouse", mouse.move());
    }

    @Test
    public void canClick() {
        assertEquals("clicking: mouse button 1", mouse.clickButton(1));
    }

    @Test
    public void canSendData() {
        assertEquals("sending: close window", mouse.sendData("close window"));
    }
}
