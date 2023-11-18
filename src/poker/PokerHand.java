package poker;

import java.util.ArrayList;

public class PokerHand {

    private final HandRank type;
    private final ArrayList<Card> cards;

    public PokerHand(HandRank type, ArrayList<Card> cards) {
        this.type = type;
        this.cards = cards;
    }
}
