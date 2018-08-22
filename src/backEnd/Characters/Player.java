/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.Characters;

import backEnd.engine.Game.Card;

/**
 *
 * @author Maciek
 */
public class Player extends Character {

    private Card card1;
    private Card card2;
    
    /**
     *
     * @param p_name
     */
    public Player(String p_name) {
        super(p_name);
    }
    
    /**
     *
     * @param p_card
     */
    public void setCard(Card p_card){
        if(card1 == null)
        {
            card1 = p_card;
        }
        else if(card2 == null)
        {
            card2 = p_card;
        }
        else
        System.out.println("ZA DUZO KART!");
    }
    
    /**
     *
     * @return
     */
    public Card getCard1(){
        return card1;
    }
    
    /**
     *
     * @return
     */
    public Card getCard2(){
        return card2;
    }



}
