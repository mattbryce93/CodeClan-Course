import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Runner {

    public static void main(String[] args) {

        //Set user names

        System.out.println("Player1, type your name:");
        Scanner scanner = new Scanner(System.in);
        String player1name = scanner.nextLine();
        System.out.println("Player2, type your name:");
        Scanner scanner1 = new Scanner(System.in);
        String player2name = scanner1.nextLine();
        Player player1 = new Player(player1name);
        Player player2 = new Player(player2name);

        //Add Players to Array

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);

        //Create Deck and populate

        Deck deck = new Deck();
        deck.populate();

        //Create Game and insert players and Deck

        Game game = new Game(players, deck);
        game.getDeck().shuffle();
        System.out.println("How many Cards would you like to play with?");
        Scanner scanner2 = new Scanner(System.in);
        String cardNum = scanner2.nextLine();
        int numCards = Integer.parseInt(cardNum);
        System.out.println("Dealing Cards");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dealing Cards.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dealing Cards..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dealing Cards...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        game.dealMultipleCards(numCards);

        System.out.println(player1.getName() + " your card is the " + player1.prettyHand());
        System.out.println(player2.getName() + " your card is the " + player2.prettyHand());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(game.comparePlayerHands());

    }
}
