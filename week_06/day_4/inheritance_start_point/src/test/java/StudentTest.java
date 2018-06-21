import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    Student student;

    @Before
    public void before(){
        student = new Student("Alex", "G3");
    }


    @Test
    public void hasName(){
        assertEquals("Alex", student.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G3", student.getCohort());
    }

    @Test
    public void canChangeName(){
        student.setName("Jack");
        assertEquals("Jack", student.getName());
    }

    @Test
    public void canChangeCohort(){
        student.setCohort("G6");
        assertEquals("G6", student.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", student.talk("Java"));
    }
}
