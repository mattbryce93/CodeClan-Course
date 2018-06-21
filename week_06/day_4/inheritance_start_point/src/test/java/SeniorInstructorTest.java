import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeniorInstructorTest {
    
    SeniorInstructor seniorInstructor;

    @Before
    public void setUp() throws Exception {
        seniorInstructor = new SeniorInstructor("John", "G6", "Ruby");
    }

    @Test
    public void canSpeak() {
        assertEquals("I love Java", seniorInstructor.talk("Java"));
    }
}
