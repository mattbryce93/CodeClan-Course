import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Player player1;

    @Before
    public void before(){
        deck = new Deck();
        deck.populate();
        player1 = new Player("Matthew");
    }

    @Test
    public void playerHasName(){
        assertEquals("Matthew",player1.getName());
    }

    @Test
    public void playerHasHand(){
        assertEquals(0, player1.getHand().size());
    }

    @Test
    public void playerStartsValueZero() {
        assertEquals(0, player1.getHandValue());
    }

    @Test
    public void playerCanTakeCard(){
        player1.takeCard(deck);
        assertEquals(1, player1.getHand().size());
        assertEquals(51, deck.getCards().size());
    }
}
