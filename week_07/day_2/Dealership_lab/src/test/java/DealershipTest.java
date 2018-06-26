import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ArrayList<Vehicle> vehicles;
    Car vehicle1;
    Motorcycle vehicle2;
    Van vehicle3;
    Engine engine;
    Tyre tyre;
    ArrayList<Tyre> tyres;
    Till till;
    Dealer dealer;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        engine = new Engine("Yamaha", "123A");
        tyre = new Tyre("Michelin", "Rubbery");
        tyres = new ArrayList<Tyre>();
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        tyres.add(tyre);
        vehicle1 = new Car(engine, tyres, 1000, "Ford", "Mondeo");
        vehicle2 = new Motorcycle(engine, tyres, 3000.50, "Harley", "Rocket");
        vehicle3 = new Van(engine, tyres, 5000.50, "Mercedes", "Benz");
        vehicles = new ArrayList<Vehicle>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        dealer = new Dealer("Bryce Larson");
        customer = new Customer("Ol' Gil", 2000);
        till = new Till(100000);
        dealership = new Dealership("Campbell's Questionably Cheap Vehicle Emporium", till, dealer, customer, vehicles);
    }

    @Test
    public void hasName() {
        assertEquals("Campbell's Questionably Cheap Vehicle Emporium", dealership.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(100000, dealership.getTill().getBalance(), 0.01);
    }

    @Test
    public void hasDealer() {
        assertEquals("Bryce Larson", dealership.getDealer().getName());
    }

    @Test
    public void hasCustomer() {
        assertEquals("Ol' Gil", dealership.getCustomer().getName());
    }

    @Test
    public void hasVehicles() {
        assertEquals(3, dealership.getVehicles().size());
    }

    @Test
    public void canSellVehicle() {
        dealership.sellVehicle(customer, vehicle1);
        assertEquals(1, customer.getVehicles().size());
        assertEquals(2, dealership.getVehicles().size());
        assertEquals(101000, dealership.getTill().getBalance(), 0.01);
        assertEquals(1000, customer.getWallet(), 0.01);
    }

    @Test
    public void cannotSellVan() {
        dealership.sellVehicle(customer, vehicle3);
        assertEquals(0, customer.getVehicles().size());
    }

    @Test
    public void canGetAvailableVehicles() {
        assertEquals(2, dealership.availableVehicles().size());
    }
}
