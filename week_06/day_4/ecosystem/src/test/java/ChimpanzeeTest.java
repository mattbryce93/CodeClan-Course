import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {

    Chimpanzee chimpanzee;

    @Before
    public void before(){
        chimpanzee = new Chimpanzee("Bobo");
    }

    @Test
    public void hasName() {
        assertEquals("Bobo", chimpanzee.getName());
    }

    @Test
    public void canEat() {
        assertEquals("Bobo ate", chimpanzee.eat());
    }

    @Test
    public void canBreathe() {
        assertEquals("Bobo took a breath", chimpanzee.breathe());
    }

    @Test
    public void canTalk() {
        assertEquals("Hello I am Bobo", chimpanzee.talk());
    }

    @Test
    public void canWalk() {
        assertEquals("Bobo crawled with his fists", chimpanzee.walk());
    }
}
