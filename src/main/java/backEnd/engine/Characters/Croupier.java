/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Characters;

import backEnd.engine.Props.Card;
import backEnd.engine.Props.Deck;
import backEnd.engine.Props.Seat;
import backEnd.engine.Props.Table;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Maciek
 */
public class Croupier extends Character {

    /**
     * @param p_name
     */
    public Croupier(String p_name) {
        super(p_name);
    }

    /**
     * @param deck
     * @return
     */
    public Card getCard(Deck deck) {
        int x = deck.getSize()-1;
        int randomNum = ThreadLocalRandom.current().nextInt(0,deck.getSize()-1);
        return deck.getCard(randomNum);
    }

    /**
     * @param p_card
     * @param p_seat
     */
    public void giveCard(Card p_card, Seat p_seat) {
        p_seat.setCard(p_card);
    }

    public void firstDeal(Table p_table, Deck p_deck) {
        p_table.setFlop(getCard(p_deck), getCard(p_deck), getCard(p_deck));
    }

    public void secondDeal(Table p_table, Deck p_deck) {
        p_table.setRiver(getCard(p_deck));
    }

    public void thirdDeal(Table p_table, Deck p_deck) {
        p_table.setTurn(getCard(p_deck));
    }

}
