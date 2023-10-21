import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {

    @Test
    void deckShouldHave52Cards() {
        DeckOfCards deck = new DeckOfCards();
        assertEquals(52, deck.getSize());
        deck.dealTopCard();
        assertEquals(51, deck.getSize());
    }
}