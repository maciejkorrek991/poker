/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Props;

import java.util.ArrayList;

/**
 * @author Maciek
 */
public class Deck {
    private int valueSize = 13;
    private int suitSize = 4;
    /**
     *
     */
    public ArrayList<Card> deck = new ArrayList<>();

    /**
     *
     */
    public Deck() {
        for (int i = 0; i < valueSize; i++) {
            for (int j = 0; j < suitSize; j++) {
                deck.add(new Card(i, j));
            }
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
        deck.forEach((i) -> {
            System.out.println(i.getValue() + " " + i.getSuit());
        });
    }
}
