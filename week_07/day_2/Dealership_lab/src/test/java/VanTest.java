import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VanTest {

    Van van;
    Engine engine;
    ArrayList<Tyre> tyres;


    @Before
    public void setUp() throws Exception {
        engine = new Engine("Mercedes", "Plush");
        tyres = new ArrayList<Tyre>();
        Tyre tyre1 = new Tyre("Michelin", "rubbery");
        Tyre tyre2 = new Tyre("Michelin", "rubbery");
        Tyre tyre3 = new Tyre("Michelin", "rubbery");
        Tyre tyre4 = new Tyre("Michelin", "rubbery");
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);
        van = new Van(engine, tyres, 1200.50, "Mercedes", "Benz");
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, van.getEngine());
    }

    @Test
    public void hasFourTyres() {
        assertEquals(4, van.getTyres().size());
    }

    @Test
    public void hasPrice() {
        assertEquals(1200.50, van.getPrice(), 0.01);
    }

    @Test
    public void hasMake() {
        assertEquals("Mercedes", van.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Benz", van.getModel());
    }
}
