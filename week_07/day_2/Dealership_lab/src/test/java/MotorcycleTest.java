import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MotorcycleTest {

    Motorcycle motorcycle;
    Engine engine;
    ArrayList<Tyre> tyres;


    @Before
    public void setUp() throws Exception {
        engine = new Engine("Harley", "Rocket");
        tyres = new ArrayList<Tyre>();
        Tyre tyre1 = new Tyre("Bridgestone", "skiddy");
        Tyre tyre2 = new Tyre("Bridgestone", "skiddy");
        tyres.add(tyre1);
        tyres.add(tyre2);
        motorcycle = new Motorcycle(engine, tyres, 5000.75, "Harley", "Davidson");
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, motorcycle.getEngine());
    }

    @Test
    public void hasFourTyres() {
        assertEquals(2, motorcycle.getTyres().size());
    }

    @Test
    public void hasPrice() {
        assertEquals(5000.75, motorcycle.getPrice(), 0.01);
    }

    @Test
    public void hasMake() {
        assertEquals("Harley", motorcycle.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Davidson", motorcycle.getModel());
    }
}
