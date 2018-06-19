import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Airplane airplane;
    Person person;

    @Before
    public void before() {
        airport = new Airport("Heathrow");
        airplane = new Airplane("Gatwick", 20);
        person = new Person();
    }

    @Test
    public void airportHasEmptyDepartures(){
        assertEquals(0, airport.getDeparturesSize());
    }

    @Test
    public void canAddPersonToDepartures(){
        airport.addPerson(person);
        assertEquals(1, airport.getDeparturesSize());
    }

    @Test
    public void canRemovePersonFromDepartures(){
        airport.addPerson(person);
        airport.removePerson(person);
        assertEquals(0, airport.getDeparturesSize());
    }

    @Test
    public void departingPlaneCanTakeAllFromDepartures(){
        airport.addPerson(person);
        airport.addDeparturestoAirplane(airplane);
        assertEquals(0, airport.getDeparturesSize());
        assertEquals(1, airplane.getPassengersSize());
    }

    @Test
    public void arrivingPlaneCanAddAllPassengersToRightDepartures(){
        airplane = new Airplane("Heathrow", 20);
        airplane.addPassenger(person);
        airport.addAirplanePassengerstoDepartures(airplane);
        assertEquals(0, airplane.getPassengersSize());
        assertEquals(1, airport.getDeparturesSize());
    }

    @Test
    public void arrivingPlaneCantAddAllPassengersToWrongDepartures(){
        airplane.addPassenger(person);
        airport.addAirplanePassengerstoDepartures(airplane);
        assertEquals(1, airplane.getPassengersSize());
        assertEquals(0, airport.getDeparturesSize());
    }
}
