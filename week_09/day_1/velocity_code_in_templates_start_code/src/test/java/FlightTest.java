import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlightTest {
    private Flight flight;

    @Before
    public void before() {
        this.flight = new Flight("SC666", "Scottish Airways", "Inverness", "New York");
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("SC666", flight.getFlightNumber());
    }

    @Test
    public void hasAirline() {
        assertEquals("Scottish Airways", flight.getAirline());
    }

    @Test
    public void hasStartPoint() {
        assertEquals("Inverness", flight.getDepartureAirport());
    }

    @Test
    public void hasDestination() {
        assertEquals("New York", flight.getArrivalAirport());
    }

    @Test
    public void startsWithSeatsAvailable() {
        assertTrue(flight.isSeatsAvailable());
    }

    @Test
    public void canSetDepartureAirport() {
        flight.setDepartureAirport("Barra");
        assertEquals("Barra", flight.getDepartureAirport());
    }

    @Test
    public void canSetArrivalAirport() {
        flight.setArrivalAirport("Dublin");
        assertEquals("Dublin", flight.getArrivalAirport());
    }

    @Test
    public void canSetSeatsAvailable() {
        flight.setSeatsAvailable(false);
        assertFalse(flight.isSeatsAvailable());
    }

}
