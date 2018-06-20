import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public int getHandValue() {
        int total = 0;
        for (Card card : this.hand){
            total += card.getValueFromRank();
        }
        return total;
    }

    public void takeCard(Deck deck) {
        Card card = deck.removeCard();
        this.hand.add(card);
    }
}
