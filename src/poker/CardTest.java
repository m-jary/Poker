package poker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {

    @Test
    void deckShouldHave52Cards() {
        Deck deck = new Deck();
        assertEquals(52, deck.getSize());
        deck.dealTopCard();
        assertEquals(51, deck.getSize());
    }
}