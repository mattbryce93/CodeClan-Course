import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void populate() {
        //loop though each suit
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
        //loop through each value
        //create a card with that suit and value
        //put card into cards
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card removeCard() {
        Card takenCard = cards.get(0);
        cards.remove(0);
        return takenCard;
    }
}
