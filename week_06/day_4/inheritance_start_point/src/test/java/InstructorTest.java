import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructorTest {

    Instructor instructor;

    @Before
    public void before(){
        instructor = new Instructor("John", "G4", "Ruby");
    }

    @Test
    public void hasName(){
        assertEquals("John", instructor.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G4", instructor.getCohort());
    }

    @Test
    public void canChangeName(){
        instructor.setName("Steve");
        assertEquals("Steve", instructor.getName());
    }
    @Test
    public void canChangeCohort(){
        instructor.setCohort("G6");
        assertEquals("G6", instructor.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", instructor.talk("Java"));
    }

    @Test
    public void hasModuleTeam() {
        assertEquals("Ruby", instructor.getModuleTeam());
    }
}
