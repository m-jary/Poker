import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();

        ArrayList<Card> player1Hand = new ArrayList<>();
        ArrayList<Card> player2Hand = new ArrayList<>();

        Player player1 = new Player("Maciej", player1Hand);
        Player player2 = new Player("Ginni", player2Hand);

        player1Hand.add(deckOfCards.dealTopCard());
        player2Hand.add(deckOfCards.dealTopCard());
        player1Hand.add(deckOfCards.dealTopCard());
        player2Hand.add(deckOfCards.dealTopCard());

        ArrayList<Card> burn = new ArrayList<>();
        ArrayList<Card> communityCards = new ArrayList<>();

        burn.add(deckOfCards.dealTopCard());
        communityCards.add(deckOfCards.dealTopCard());
        communityCards.add(deckOfCards.dealTopCard());
        communityCards.add(deckOfCards.dealTopCard());
        burn.add(deckOfCards.dealTopCard());
        communityCards.add(deckOfCards.dealTopCard());
        burn.add(deckOfCards.dealTopCard());
        communityCards.add(deckOfCards.dealTopCard());

        System.out.println(player1.getName() + ": " + player1Hand);
        System.out.println(player2.getName() + ": " + player2Hand);
        System.out.println("Community cards: " + communityCards);
    }
}