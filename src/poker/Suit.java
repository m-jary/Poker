package poker;

public enum Suit {
    DIAMONDS (1, "Diamonds"),
    CLUBS (2, "Clubs"),
    HEARTS (3, "Hearts"),
    SPADES (4, "Spades");

    private final int suitValue;
    private final String suitName;

    Suit(final int suitValue, final String suitName) {
        this.suitValue = suitValue;
        this.suitName = suitName;
    }

    public int getSuitValue() {
        return this.suitValue;
    }

    public String getSuitName() {
        return suitName;
    }
}
