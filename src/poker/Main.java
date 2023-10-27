package poker;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        ArrayList<Card> player1Hand = new ArrayList<>();
        ArrayList<Card> player2Hand = new ArrayList<>();

        Player player1 = new Player("Maciej", player1Hand);
        Player player2 = new Player("Ginni", player2Hand);

        player1Hand.add(deck.dealTopCard());
        player2Hand.add(deck.dealTopCard());
        player1Hand.add(deck.dealTopCard());
        player2Hand.add(deck.dealTopCard());

        ArrayList<Card> burn = new ArrayList<>();
        ArrayList<Card> table = new ArrayList<>();

        burn.add(deck.dealTopCard());
        table.add(deck.dealTopCard());
        table.add(deck.dealTopCard());
        table.add(deck.dealTopCard());
        burn.add(deck.dealTopCard());
        table.add(deck.dealTopCard());
        burn.add(deck.dealTopCard());
        table.add(deck.dealTopCard());

        System.out.println(player1.getName() + ": " + player1.getHand());
        System.out.println(player2.getName() + ": " + player2.getHand());
        System.out.println("Community cards: " + table);

        player1Hand.addAll(table);
        player2Hand.addAll(table);

        System.out.println(player1.getName() + ": " + player1.getHand());
        System.out.println(player2.getName() + ": " + player2.getHand());

        /*HashMap<Card.Suit, Integer> countSuits = new HashMap<>();
        for (int i = 0; i < finalPlayer1Hand.size(); i++) {
            Card card = finalPlayer1Hand.get(i);
            if (!countSuits.containsKey(card.suit)) {
                countSuits.put(card.suit, 1);
            } else {
                countSuits.put(card.suit, countSuits.get(card.suit) + 1);
            }
        }
        System.out.println(countSuits);*/
    }
}