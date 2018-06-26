import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    ArrayList<Tyre> tyres;


    @Before
    public void setUp() throws Exception {
        engine = new Engine("Volvo", "123A");
        tyres = new ArrayList<Tyre>();
        Tyre tyre1 = new Tyre("Michelin", "rubbery");
        Tyre tyre2 = new Tyre("Michelin", "rubbery");
        Tyre tyre3 = new Tyre("Michelin", "rubbery");
        Tyre tyre4 = new Tyre("Michelin", "rubbery");
        tyres.add(tyre1);
        tyres.add(tyre2);
        tyres.add(tyre3);
        tyres.add(tyre4);
        car = new Car(engine, tyres, 1000.50, "VW", "Golf");
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasFourTyres() {
        assertEquals(4, car.getTyres().size());
    }

    @Test
    public void hasPrice() {
        assertEquals(1000.50, car.getPrice(), 0.01);
    }

    @Test
    public void hasMake() {
        assertEquals("VW", car.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Golf", car.getModel());
    }
}
