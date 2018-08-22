/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Props;

import backEnd.engine.Characters.Player;

/**
 * @author Maciek
 */
public class Seat {

    private Player player;
    private final int seatNumber;
    private Card card1;
    private Card card2;

    public void setCard(Card p_card) {
        if (card1 == null) {
            card1 = p_card;
        } else if (card2 == null) {
            card2 = p_card;
        } else
            System.out.println("ZA DUZO KART!");
    }

    /**
     * @return
     */
    public Card getCard1() {
        return card1;
    }

    /**
     * @return
     */
    public Card getCard2() {
        return card2;
    }


    public Seat(int p_seatNumber) {
        this.seatNumber = p_seatNumber;
    }

    public void seatPlayer(Player p_player) {
        this.player = p_player;
    }
}
