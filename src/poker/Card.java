package poker;

public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.rank.getRankName(), this.suit.getSuitName());
    }
}
