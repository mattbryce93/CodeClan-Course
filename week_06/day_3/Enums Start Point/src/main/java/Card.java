public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }

    public int getValueFromRank() {
        return this.rank.getValue();
    }

    public String getValueFromSuit() {
        return this.suit.getValue();
    }

    public String niceName() {
        return this.rank.getName() + " of " + this.suit.getValue();
    }
}