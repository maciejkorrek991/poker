/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Props;

import backEnd.database.dbAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Maciek
 */
public class Deck implements dbAction {
    private int valueSize = 13;
    private int suitSize = 4;

    /**
     *
     */
    public ArrayList<Card> deck = new ArrayList<Card>();

    /**
     *
     */
    public Deck(){

        List a = db.getRecords("Card","");
        for (Iterator iterator = a.iterator(); iterator.hasNext();){
                Card card = (Card) iterator.next();
                        deck.add(card);
            }
    }

    public int getSize(){
        return deck.size();
    }
    /**
     * @param p_cardId
     * @return
     */
    public Card getCard(int p_cardId) {
        Card card = deck.get(p_cardId);
        deck.remove(p_cardId);
        return card;
    }

    public void showDeck() {
        final int[] tmp = {1};

    }
}
