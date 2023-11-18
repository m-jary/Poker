package poker;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private final ArrayList<Card> deck;

    public Deck() {
        this.deck = initDeck();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    private ArrayList<Card> initDeck() {
        ArrayList<Card> deckOfCards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deckOfCards.add(new Card(rank, suit));
            }
        }

        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }

    public Card dealCard() {
        return this.deck.isEmpty() ? null : this.deck.removeFirst();
    }

    public int getSize() {
        return this.deck.size();
    }
}
