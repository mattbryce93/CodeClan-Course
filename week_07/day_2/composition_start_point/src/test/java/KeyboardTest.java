import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        keyboard = new Keyboard("wireless", 55);
    }

    @Test
    public void canClickKey() {
        assertEquals("clicking: keyboard button 5", keyboard.clickKey(5));
    }

    @Test
    public void canSendData() {
        assertEquals("submitting: print screen", keyboard.sendData("print screen"));
    }
}
