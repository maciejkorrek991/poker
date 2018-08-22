/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Game;

import backEnd.Characters.Player;

/**
 *
 * @author Maciek
 */
public class Seat {

    private Player player;
    private final int seatNumber;
    
    public Seat(int p_seatNumber){
        this.seatNumber = p_seatNumber;
    }
    public void seatPlayer(Player p_player) {
        this.player = p_player;
    }
}
