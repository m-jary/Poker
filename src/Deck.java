import java.util.ArrayList;

public class Deck {
    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<>();

        ArrayList<String> ranks = new ArrayList<>();
        ranks.add("Two");
        ranks.add("Three");
        ranks.add("Four");
        ranks.add("Five");
        ranks.add("Six");
        ranks.add("Seven");
        ranks.add("Eight");
        ranks.add("Nine");
        ranks.add("Ten");
        ranks.add("Jack");
        ranks.add("Queen");
        ranks.add("King");
        ranks.add("Ace");

        ArrayList<String> suits = new ArrayList<>();
        suits.add(" of Clubs");
        suits.add(" of Diamonds");
        suits.add(" of Spade");
        suits.add(" of Hearts");

        for (int i = 0; i < suits.size(); i++) {
            for (int j = 0; j < ranks.size(); j++) {
                Card card = new Card(ranks.get(j), suits.get(i));
                deck.add(card);
            }
        }
        for(Card cards:deck) {
            System.out.println(cards);
        }
    }
}
