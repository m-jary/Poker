package poker;

import java.util.*;
import java.util.stream.Collectors;

public class HandAnalyzer {

    ArrayList<Card> playerHand;

    public HandAnalyzer( ArrayList<Card> playerHand) {
        this.playerHand = playerHand;
        HashMap<Integer, Integer> countedRanks = countRanks(playerHand);
        HashMap<Suit, Integer> countedSuits = countSuits(playerHand);
    }

    public HashMap<Integer, Integer> countRanks(ArrayList<Card> hand) {
        HashMap<Integer, Integer> countedRanks = new HashMap<>();

        for (Card card : hand) {
            Rank currentRank = card.getRank();
            if (countedRanks.containsKey(currentRank.getRankValue())) {
                countedRanks.put(currentRank.getRankValue(), countedRanks.get(currentRank.getRankValue()) + 1);
            } else {
                countedRanks.put(currentRank.getRankValue(), 1);
            }
        }
        return countedRanks;
    }

    public HashMap<Suit, Integer> countSuits(ArrayList<Card> hand) {
        HashMap<Suit, Integer> countedSuits = new HashMap<>();

        for (Card card : hand) {
            Suit currentSuit = card.getSuit();
            if (countedSuits.containsKey(currentSuit)) {
                countedSuits.put(currentSuit, countedSuits.get(currentSuit) + 1);
            } else {
                countedSuits.put(currentSuit, 1);
            }
        }
        return countedSuits;
    }

    public PokerHand whatFlush(ArrayList<Card> hand) {
        HashMap<Suit, Integer> countedSuits = countSuits(hand);

        return new PokerHand(HandRank.FLUSH, hand);
    }

    public static Map<Suit, List<Card>> suitGroup(final ArrayList<Card> cards) {
        return Collections.unmodifiableMap(new TreeMap<>(cards.stream().collect(Collectors.groupingBy(Card::getSuit))));
    }
}
