import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirplaneTest {

    Airplane airplane;
    Person person;

    @Before
    public void before(){
        airplane = new Airplane("Gatwick", 400);
        person = new Person();
    }

    @Test
    public void airplaneHasDestination(){
        assertEquals("Gatwick", airplane.getDestination());
    }

    @Test
    public void airplaneHasCapacity(){
        assertEquals(400, airplane.getCapacity());
    }

    @Test
    public void airplaneHasPassengers(){
        assertEquals(0, airplane.getPassengersSize());
    }

    @Test
    public void canAddPassengers(){
        airplane.addPassenger(person);
        assertEquals(1, airplane.getPassengersSize());
    }

    @Test
    public void cannotAddPassengersToFullAirplane(){
        airplane = new Airplane("Gatwick", 2);
        airplane.addPassenger(person);
        airplane.addPassenger(person);
        assertEquals(2, airplane.getPassengersSize());
        airplane.addPassenger(person);
        assertEquals(2, airplane.getPassengersSize());
    }

    @Test
    public void canRemovePassenger(){
        airplane.addPassenger(person);
        airplane.removePassenger(person);
        assertEquals(0, airplane.getPassengersSize());
    }



}
