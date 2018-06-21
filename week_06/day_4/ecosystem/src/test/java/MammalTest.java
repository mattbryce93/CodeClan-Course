import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal;

    @Before
    public void before(){
        mammal = new Mammal("Steven");
    }

    @Test
    public void hasName() {
        assertEquals("Steven", mammal.getName());
    }

    @Test
    public void canEat() {
        assertEquals("Steven ate", mammal.eat());
    }

    @Test
    public void canBreathe() {
        assertEquals("Steven took a breath", mammal.breathe());
    }

    @Test
    public void canTalk() {
        assertEquals("Hello I am Steven", mammal.talk());
    }
}
