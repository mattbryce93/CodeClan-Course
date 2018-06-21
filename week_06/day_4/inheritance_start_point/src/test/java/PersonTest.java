import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person("John", "G6");
    }

    @Test
    public void hasName() {
        assertEquals("John", person.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G6", person.getCohort());
    }

    @Test
    public void canChangeName(){
        person.setName("Steve");
        assertEquals("Steve", person.getName());
    }
    @Test
    public void canChangeCohort(){
        person.setCohort("G7");
        assertEquals("G7", person.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", person.talk("Java"));
    }
}
