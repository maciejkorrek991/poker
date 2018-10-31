package backEnd.engine;

import backEnd.database.Draws;
import backEnd.database.dbAction;
import backEnd.engine.Characters.Croupier;
import backEnd.engine.Characters.Player;
import backEnd.engine.Props.Card;
import backEnd.engine.Props.Deck;
import backEnd.engine.Props.Table;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class gameController implements dbAction {
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
        saveDraw();

        List a = db.getRecords("Draws");
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ) {
            Draws draws = (Draws) iterator.next();
            System.out.print("Flop1: " + draws.getFlop1());
            System.out.print("Flop2: " + draws.getFlop2());
            System.out.print("Flop3: " + draws.getFlop3());

            System.out.print(" turn: " + draws.getTurn());
            System.out.print(" river: " + draws.getRiver());

            System.out.println(" Ld_tm: " + draws.getLd_tm());

        }
        //System.out.println("Showdeck:");
        /*
        System.out.println("Szanse gracza Seba:");
        table.showChanses(table.getSeat(0), deck);
        System.out.println("Szanse gracza Maciek:");
        table.showChanses(table.getSeat(1), deck);
        */
    }

    public void saveDraw() {
        Draws draws;
        draws = new Draws(1,1,1,1,1);
        db.insertInto(draws);
    }
}
