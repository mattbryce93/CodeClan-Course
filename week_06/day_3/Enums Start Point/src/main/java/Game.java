import java.util.ArrayList;
import java.util.BitSet;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(ArrayList<Player> players, Deck deck){
        this.players = players;
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public Deck getDeck() {
        return deck;
    }

    public void dealCards() {
        for (Player player : players) {
            player.takeCard(this.deck);
        }
    }

    public String comparePlayerHands() {
        int player1Hand = players.get(0).getHandValue();
        int player2Hand = players.get(1).getHandValue();
        if (player1Hand > player2Hand){
            return players.get(0).getName() + " has Won!";
        } if (player1Hand == player2Hand) {
            return "It's a tie";
        } else {
            return players.get(1).getName() + " has won!";
        }
    }

    public void dealMultipleCards(int numCards) {
        for (int i = 0; i < numCards; i++){
            dealCards();
        }
    }
}
