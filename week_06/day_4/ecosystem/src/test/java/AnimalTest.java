import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal("Matthew");
    }

    @Test
    public void hasName() {
        assertEquals("Matthew", animal.getName());
    }

    @Test
    public void canEat() {
        assertEquals("Matthew ate", animal.eat());
    }

    @Test
    public void canBreathe() {
        assertEquals("Matthew took a breath", animal.breathe());
    }
}
