/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine;

import backEnd.Characters.Croupier;
import backEnd.Characters.Player;
import backEnd.engine.Game.Deck;
import backEnd.engine.Game.Table;
import java.util.ArrayList;

/**
 *
 * @author Maciek
 */
public final class Controller {
public ArrayList<Player> players = new ArrayList<>();
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
    public Controller() {
        table = new Table();
        croupier = new Croupier("Krupier");
        players.add(new Player("Maciek"));
        players.add(new Player("Seba"));
        deck = new Deck();
        croupier.firstDeal(table, deck);
        System.out.println("Po rozdaniu, karty na stole:");
        table.showCards();
        System.out.println("Showdeck:");
        test();
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
    
    public void test(){
        deck.showDeck();
    }
}
