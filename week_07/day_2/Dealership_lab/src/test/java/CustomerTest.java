import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Matt", 150.1);
    }

    @Test
    public void hasName() {
        assertEquals("Matt", customer.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(150.1, customer.getWallet(), 0.01);
    }
}
