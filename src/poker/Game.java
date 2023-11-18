package poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> players;
    private Deck deck;
    private Card[] table;
    private int pot;
    private int smallBlind;
    private int bigBlind;
    private Player dealer;
    private Player playerSB;
    private Player playerBB;
    private int[] bets;
    Scanner scanner = new Scanner(System.in);

    public Game(int smallBlind) {
        players = new ArrayList<>();
        deck = new Deck();
        table = new Card[5];
        pot = 0;
        this.smallBlind = smallBlind;
        bigBlind = smallBlind * 2;
        playerSetup();
        bettingRound(true);
        dealCommunityCards();
        bettingRound(false);
        dealCommunityCards();
        bettingRound(false);
        dealCommunityCards();
        bettingRound(false);
    }

    public void playerSetup() {
        boolean addAnotherPlayer = true;
        while (addAnotherPlayer) {
            addAnotherPlayer = false;
            addPlayer();
            System.out.println("Do you want to add another player? (y/n)");
            if (scanner.next().contains("y")) {
                addAnotherPlayer = true;
            }
        }
        dealer = players.get(0);
        if (players.size() > 2) {
            playerSB = players.get(1);
            playerBB = players.get(2);
        }
        bets = new int[players.size()];
        payBlinds();
    }

    public void payBlinds() {
        if (players.size() > 2) {
            playerSB.removeChips(smallBlind);
            bets[players.indexOf(playerSB)] = smallBlind;
            playerBB.removeChips(bigBlind);
            bets[players.indexOf(playerBB)] = bigBlind;
        }
    }

    public void addPlayer() {
        System.out.println("Enter player name:");
        String tempName = scanner.next();
        System.out.printf("Enter %s's starting chips:%n", tempName);
        int tempChips = scanner.nextInt();
        Card[] tempHand = {deck.dealCard(), deck.dealCard()};
        players.add(new Player(tempName, tempChips, tempHand, true));
        System.out.println(players.get(players.size() - 1));
    }

    public void bettingRound(boolean isPreFlop) {
        int startingPlayerIndex;
        if (isPreFlop) {
            startingPlayerIndex = players.indexOf(playerSB) + 2;
        } else {
            startingPlayerIndex = players.indexOf(playerSB);
        }

        int currentPlayerIndex = startingPlayerIndex;
        for (int i = 0; i < players.size(); i++) {
            currentPlayerIndex = individualBet(currentPlayerIndex, isPreFlop);
        }

        while (!areBetsEqual()) {
            currentPlayerIndex = individualBet(currentPlayerIndex, isPreFlop);
        }
    }

    public int individualBet(int currentPlayerIndex, boolean isPreFlop) {
        String checkOrCall = areBetsEqual() ? "check" : "call";
        printCommunityCards(isPreFlop);
        System.out.printf("%s %nDo you want to fold, %s or raise?%n", players.get(currentPlayerIndex).toString(),
                checkOrCall);
        String answer = scanner.next();
        if (answer.contains("fold")) {
            fold(players.get(currentPlayerIndex));
        } else if (answer.contains("call")) {
            call(players.get(currentPlayerIndex));
        } else if (answer.contains("raise")) {
            raise(players.get(currentPlayerIndex));
        }

        currentPlayerIndex++;
        if (currentPlayerIndex == players.size()) {
            currentPlayerIndex = 0;
        }
        return currentPlayerIndex;
    }

    public boolean areBetsEqual() {
        int highestBet = getHighestBet();
        for (int j = 0; j < bets.length; j++) {
            if (bets[j] < highestBet && players.get(j).isInGame()) {
                return false;
            }
        }
        return true;
    }

    public int getHighestBet() {
        int highestBet = 0;
        for (int i = 0; i < bets.length; i++) {
            if (bets[i] > highestBet && players.get(i).isInGame()) {
                highestBet = bets[i];
            }
        }
        return highestBet;
    }

    public void fold(Player player) {
        player.setInGame(false);
    }

    public void call(Player player) {
        int highestBet = getHighestBet();
        int betDifference = highestBet - bets[players.indexOf(player)];
        player.removeChips(betDifference);
        bets[players.indexOf(player)] += betDifference;
    }

    public void raise(Player player) {
        System.out.println("How much do you want to raise?");
        int raiseAmount = scanner.nextInt();
        call(player);
        player.removeChips(raiseAmount);
        bets[players.indexOf(player)] += raiseAmount;
    }

    public void dealCommunityCards() {
        if (table[0] == null) {
            table[0] = deck.dealCard();
            table[1] = deck.dealCard();
            table[2] = deck.dealCard();
        } else if (table[3] == null) {
            table[3] = deck.dealCard();
        } else if (table[4] == null) {
            table[4] = deck.dealCard();
        }
    }

    public void printCommunityCards(boolean isPreFlop) {
        if (!isPreFlop) {
            System.out.println("----------------------------------------------------------");
            if (table[0] != null && table[3] == null) {
                System.out.println("The flop:");
            } else if (table[3] != null && table[4] == null) {
                table[3] = deck.dealCard();
                System.out.println("The turn:");
            } else if (table[4] != null) {
                table[4] = deck.dealCard();
                System.out.println("The river:");
            }
            System.out.println(Arrays.toString(table));
            System.out.println("----------------------------------------------------------");
            System.out.println();
        }
    }
}
