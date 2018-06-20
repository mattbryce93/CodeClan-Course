import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void before(){
        deck = new Deck();
        deck.populate();
        player1 = new Player("Matthew");
        player2 = new Player("Craig");
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        game = new Game(players, deck);
    }

    @Test
    public void gameHasPlayers(){
        assertEquals(2, game.getPlayers().size());
    }

    @Test
    public void gameDeckHasCards(){
        assertEquals(52, game.getDeck().getCards().size());
    }

    @Test
    public void gameDealsCards(){
        game.dealCards();
        assertEquals(50, game.getDeck().getCards().size());
        assertEquals(1, player1.getHand().size());
        assertEquals(1, player2.getHand().size());
    }

    @Test
    public void gameCanCompareHands(){
        game.dealCards();
        assertEquals("Craig has won!", game.comparePlayerHands());
    }

    @Test
    public void gameCanCompareMultipleCardsInHands(){
        game.dealCards();
        game.dealCards();
        assertEquals("Craig has won!", game.comparePlayerHands());
    }
}
