public enum SuitType {

    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    CLUBS("Clubs");

    private final String value;

    SuitType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
