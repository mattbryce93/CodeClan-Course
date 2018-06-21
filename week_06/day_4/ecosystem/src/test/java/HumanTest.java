import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human human;

    @Before
    public void before() {
        human = new Human("Tara");
    }

    @Test
    public void hasName() {
        assertEquals("Tara", human.getName());
    }

    @Test
    public void canEat() {
        assertEquals("Tara ate", human.eat());
    }

    @Test
    public void canBreathe() {
        assertEquals("Tara took a breath", human.breathe());
    }

    @Test
    public void canTalk() {
        assertEquals("Hello I am Tara", human.talk());
    }

    @Test
    public void canWalk() {
        assertEquals("Tara that's one small step", human.walk());
    }
}
