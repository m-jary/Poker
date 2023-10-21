import java.util.Arrays;
import java.util.List;

public class Card {
    private String rank, suit;

    public Card(String rank, String suit) {
        setRank(rank);
        setSuit(suit);
    }

    public String getRank() {
        return rank;
    }

    public static List<String> getValidRanks() {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

    }

    public void setRank(String rank) {
        List<String> validRanks = getValidRanks();
        if (validRanks.contains(rank)) {
            this.rank = rank;
        } else {
            throw new IllegalArgumentException("Valid ranks are: " + validRanks);
        }
    }

    public String getSuit() {
        return suit;
    }

    public static List<String> getValidSuit() {
        return Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
    }


    public void setSuit(String suit) {
        List<String> validSuits = getValidSuit();
        if (validSuits.contains(suit)) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("Valid suits are: " + validSuits);
        }
    }

    public String toString () {
        return String.format("%s of %s", rank, suit);
    }
}