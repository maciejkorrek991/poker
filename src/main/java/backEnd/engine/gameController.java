package backEnd.engine;

import backEnd.engine.Characters.Croupier;
import backEnd.engine.Characters.Player;
import backEnd.engine.Props.Deck;
import backEnd.engine.Props.Table;

import java.util.ArrayList;

public class gameController {
    public ArrayList<Player> players = new ArrayList<Player>();
    /**
     *
     */
    public Deck deck;

    /**
     *
     */
    public Croupier croupier;

    /**
     *
     */
    public Table table;

    /**
     *
     */
    public gameController() {
        table = new Table();
        croupier = new Croupier("Krupier");
        players.add(new Player("Maciek"));
        table.seats.get(0).seatPlayer(players.get(0));
        players.add(new Player("Seba"));
        table.seats.get(1).seatPlayer(players.get(1));
        deck = new Deck();
        deck.showDeck();
        croupier.firstDeal(table, deck);
        System.out.println("Po rozdaniu, karty na stole:");
        table.showCards();
        croupier.giveCard(croupier.getCard(deck), table.getSeat(0));
        croupier.giveCard(croupier.getCard(deck), table.getSeat(0));
        croupier.giveCard(croupier.getCard(deck), table.getSeat(1));
        croupier.giveCard(croupier.getCard(deck), table.getSeat(1));
        System.out.println("Karty gracza Maciek:");
        table.showSeatCards(0);
        System.out.println("Karty gracza Seba:");
        table.showSeatCards(1);
        //System.out.println("Showdeck:");

        System.out.println("Szanse gracza Seba:");
        table.showChanses(table.getSeat(0), deck);
        System.out.println("Szanse gracza Maciek:");
        table.showChanses(table.getSeat(1), deck);

    }

    /**
     *
     */
    public void startGame() {
//        croupier.giveCard(croupier.getCard(deck), player1);
//        croupier.giveCard(croupier.getCard(deck), player1);
//        System.out.println(player1.getCard1().getValue() + " " + player1.getCard1().getSuit());
//        System.out.println(player1.getCard1().getValue() + " " + player1.getCard2().getSuit());
    }

    public void seatPlayers() {

    }

    public void test() {
        deck.showDeck();
    }
}
