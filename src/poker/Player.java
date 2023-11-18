package poker;

import java.util.ArrayList;

public class Player {
    private String name;
    private int chips;
    private Card[] hand;
    private boolean isInGame;

    public Player(String name, int chips, Card[] hand, boolean isInGame) {
        this.name = name;
        this.chips = chips;
        this.hand = hand;
        this.isInGame = isInGame;
    }

    public String getName() {
        return name;
    }

    public int getChips() {
        return chips;
    }

    public void addChips(int pot) {
        chips += pot;
    }

    public void removeChips(int bet) {
        chips -= bet;
    }

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public boolean isInGame() {
        return isInGame;
    }

    public void setInGame(boolean inGame) {
        isInGame = inGame;
    }

    @Override
    public String toString () {
        return String.format("Player: %s. Chips: %s. Hand: %s, %s. Is in game: %s", name, chips, hand[0], hand[1] ,
                isInGame);
    }
}
