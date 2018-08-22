/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.Characters;

import backEnd.engine.Game.Card;
import backEnd.engine.Game.Deck;
import backEnd.engine.Game.Table;
import java.util.Random;

/**
 *
 * @author Maciek
 */
public class Croupier extends Character {

    /**
     *
     * @param p_name
     */
    public Croupier(String p_name) {
        super(p_name);
    }

    /**
     *
     * @param deck
     * @return
     */
    public Card getCard(Deck deck) {
        Random gen = new Random();
        int cardId = 5;
        return deck.getCard(cardId);
    }

    /**
     *
     * @param p_card
     * @param p_player
     */
    public void giveCard(Card p_card, Player p_player) {
        p_player.setCard(p_card);
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
