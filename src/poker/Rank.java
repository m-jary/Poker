package poker;

public enum Rank {
    TWO (2, "Two") ,
    THREE (3, "Three"),
    FOUR (4, "Four"),
    FIVE (5, "Five"),
    SIX (6, "Six"),
    SEVEN (7, "Seven"),
    EIGHT (8, "Eight"),
    NINE (9, "Nine"),
    TEN (10, "Ten"),
    JACK (11, "Jack"),
    QUEEN (12, "Queen"),
    KING (13, "King"),
    ACE (14, "Ace");

    private final int rankValue;
    private final String rankName;

    Rank(final int rankValue, final String rankName) {
        this.rankValue = rankValue;
        this.rankName = rankName;
    }

    public int getRankValue() {
        return this.rankValue;
    }

    public String getRankName() {
        return rankName;
    }
}
