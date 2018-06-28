import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter1;
    Fighter fighter2;
    Weapon weapon1;
    Weapon weapon2;
    ArrayList<Move> weapons;

    @Before
    public void setUp() throws Exception {
        weapon1 = new Weapon("biter", 20);
        weapon2 = new Weapon("sting", 50);
        weapons = new ArrayList<Move>();
        weapons.add(weapon1);
        weapons.add(weapon2);
        fighter1 = new Fighter("Conan", 100, 20, weapons, 50);
        fighter2 = new Fighter("Spartacus", 120, 10, weapons, 10);
    }

    @Test
    public void canAttack() {
        fighter2.attack(fighter1);
        assertEquals(80, fighter1.getHealth());
    }
}
