import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private final ArrayList<Card> deck;

    public DeckOfCards() {
        List<String> suits = Card.getValidSuit();
        List<String> ranks = Card.getValidRanks();

        deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public Card dealTopCard() {
        if (!deck.isEmpty()) {
            return deck.remove(0);
        } else {
            return null;
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public int getSize() {
        return deck.size();
    }
}
