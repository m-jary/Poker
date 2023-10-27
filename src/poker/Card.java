package poker;

public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(final Rank rank, final Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    enum Suit {
        DIAMONDS (0, "diamonds"),
        CLUBS (1, "clubs"),
        HEARTS (2, "hearts"),
        SPADES (3, "spades");

        private final int suitValue;
        private final String suitName;

        Suit(final int suitValue, final String suitName) {
            this.suitValue = suitValue;
            this.suitName = suitName;
        }

        public int getSuitValue() {
            return suitValue;
        }

        public String getSuitName() {
            return suitName;
        }
    }

    enum Rank {
        TWO (2, "two"),
        THREE (3, "three"),
        FOUR (4, "four"),
        FIVE (5, "five"),
        SIX (6, "six"),
        SEVEN (7, "seven"),
        EIGHT (8, "eight"),
        NINE (9, "nine"),
        TEN (10, "ten"),
        JACK (11, "jack"),
        QUEEN (12, "queen"),
        KING (13, "king"),
        ACE (14, "ace");

        private final int rankValue;
        private final String rankName;

        Rank(final int rankValue, final String rankName) {
            this.rankValue = rankValue;
            this.rankName = rankName;
        }

        public int getRankValue() {
            return rankValue;
        }

        public String getRankName() {
            return rankName;
        }
    }

    @Override
    public String toString () {
        return String.format("%s of %s", rank.rankName, suit.suitName);
    }
}