import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CharityShopTest {

    Volunteer volunteer1;
    Manager manager1;
    CharityShop charityShop;

    @Before
    public void setUp() throws Exception {
        volunteer1 = new Volunteer("Tara");
        manager1 = new Manager("Matt");
        charityShop = new CharityShop();
    }

    @Test
    public void canAddEmployee() {
        charityShop.addEmployee(volunteer1);
        assertEquals(1, charityShop.staffCount());
    }

    @Test
    public void canAddManagersAndVolunteers() {
        charityShop.addEmployee(volunteer1);
        charityShop.addEmployee(manager1);
        assertEquals(2, charityShop.staffCount());
    }

    @Test
    public void canPayStaff() {
        charityShop.addEmployee(manager1);
        charityShop.addEmployee(volunteer1);
        charityShop.payStaff();
        assertEquals(1500, manager1.getBalance());
    }
}
