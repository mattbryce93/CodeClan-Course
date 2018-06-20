import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(SuitType.HEARTS, RankType.SIX);
    }

//    @Test
//    public void canBeMispelled() {
//        card = new Card("Heeaarts");
//        assertEquals("Heeaarts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card("bananas");
//        assertEquals("bananas", card.getSuit());
//    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }


    @Test
    public void canGetRank() {
        assertEquals(RankType.SIX, card.getRank());
    }

    @Test
    public void canGetValueFromCard() {
        assertEquals(6, card.getValueFromRank());
    }

    @Test
    public void canGetName() {
        assertEquals("Six of Hearts", card.niceName());
    }

    @Test
    public void canGetAllSuits() {
        SuitType[] expected = {SuitType.HEARTS, SuitType.DIAMONDS, SuitType.SPADES, SuitType.CLUBS};
        SuitType[] suits = SuitType.values();
        assertEquals(4, suits.length);
        assertArrayEquals(expected, suits);
    }

    @Test
    public void canLoopThroughSuits() {
        ArrayList<SuitType> suits = new ArrayList<SuitType>();
        for(SuitType suit : SuitType.values()){
            suits.add(suit);
        }
        assertEquals(4, suits.size());
    }

    @Test
    public void canGetCardSuitValue() {
        assertEquals("Hearts", card.getValueFromSuit());
    }
}
