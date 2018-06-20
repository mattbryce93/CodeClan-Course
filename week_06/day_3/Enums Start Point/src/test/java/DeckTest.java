import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty() {
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void deckCanPopulate() {
        deck.populate();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void deckCheckFirstCard(){
        deck.populate();
        String foundCard = deck.getCards().get(0).niceName();
        assertEquals("Ace of Hearts", foundCard);
    }

    @Test
    public void deckCheckshuffle(){
        deck.populate();
        deck.shuffle();
        String foundCard = deck.getCards().get(0).niceName();
        assertNotSame("Ace of Hearts", foundCard);
    }

    @Test
    public void deckCanRemoveCard(){
        deck.populate();
        deck.removeCard();
        assertEquals(51, deck.getCards().size());
    }
}
