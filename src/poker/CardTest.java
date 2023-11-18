package poker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {

    @Test
    @DisplayName("There should be 52 cards in the deck")
    void deckShouldHave52Cards() {
        Deck deck = new Deck();
        assertEquals(52, deck.getSize());
        deck.dealCard();
        assertEquals(51, deck.getSize());
    }
}
