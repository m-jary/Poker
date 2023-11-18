package poker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Card card1 = new Card(Card.Rank.TEN, Card.Suit.SPADES);
        Card card2 = new Card(Card.Rank.JACK, Card.Suit.HEARTS);
        Card card3 = new Card(Card.Rank.QUEEN, Card.Suit.CLUBS);
        Card card4 = new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
        Card card5 = new Card(Card.Rank.ACE, Card.Suit.SPADES);
        System.out.println(card1.getRank().getRankName());
        System.out.println(card2.getRank().getRankValue());
        System.out.println(card3.getSuit().getSuitName());
        System.out.println(card4.getSuit().getSuitValue());
        System.out.println(card5);

        Deck deck = new Deck();
        System.out.println(deck.getDeck());
        deck.shuffle();
        System.out.println(deck.getDeck());
        Card[] cards = {deck.dealCard(), deck.dealCard()};
        System.out.println(deck.getSize());

        Player p1 = new Player("Maciej", 1000, cards, true);
        System.out.println(p1.getName());
        System.out.println(p1.getChips());
        p1.addChips(500);
        System.out.println(p1.getChips());
        p1.removeChips(250);
        System.out.println(p1.getChips());
        System.out.println(Arrays.toString(p1.getHand()));
        System.out.println(p1.isInGame());
        p1.setInGame(false);
        System.out.println(p1.isInGame());
        System.out.println(p1);
        Card[] cards2 = {card5, card4};
        p1.setHand(cards2);
        System.out.println(Arrays.toString(p1.getHand()));
        */

        Game poker = new Game(1);
    }
}