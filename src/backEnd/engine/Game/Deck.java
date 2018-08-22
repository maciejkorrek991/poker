/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Game;

import java.util.ArrayList;

/**
 *
 * @author Maciek
 */
public class Deck {

    /**
     *
     */
    public ArrayList<Card> deck = new ArrayList<>();
    
    /**
     *
     */
    public Deck(){
        for(int i = 0; i<13; i++){
            for(int j=0;j<4;j++){
                deck.add(new Card(i,j));
            }
        }
    }
    
    /**
     *
     * @param p_cardId
     * @return
     */
    public Card getCard(int p_cardId){
        Card card = deck.get(p_cardId);
        deck.remove(p_cardId);
        return card;
    }
    
    public void showDeck(){
        deck.forEach((i) -> {
        System.out.println(i.getValue() + " " + i.getSuit());
        });
    }         
}
