import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Mage mage1;
    Mage mage2;
    Spell move1;
    Spell move2;
    ArrayList<Move> moves;

    @Before
    public void setUp() throws Exception {
        moves = new ArrayList<Move>();
        move1 = new Spell("Fireblast", 20);
        move2 = new Spell("Bolt", 5);
        moves.add(move1);
        moves.add(move2);
        mage1 = new Mage("Gandalf", 100, 50, moves);
        mage2 = new Mage("Saroman", 80, 100, moves);
    }

    @Test
    public void canAttack() {
        mage1.attack(mage2);
        assertEquals(60, mage2.getHealth());
    }
}
