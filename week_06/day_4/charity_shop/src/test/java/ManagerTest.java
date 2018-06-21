import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager1;

    @Before
    public void setUp() throws Exception {
        manager1 = new Manager("Matt");
    }

    @Test
    public void canWork() {
        assertEquals("I'm in charge!", manager1.work());
    }

    @Test
    public void startsWithZeroMoney() {
        assertEquals(0, manager1.getBalance());
    }

    @Test
    public void canGetPaid() {
        manager1.pay(1500);
        assertEquals(1500, manager1.getBalance());
    }
}
