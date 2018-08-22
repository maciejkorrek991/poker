/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Game;

import backEnd.Characters.Player;
import java.util.ArrayList;

/**
 *
 * @author Maciek
 */
public class Table {

    private ArrayList<Seat> seats = new ArrayList<Seat>();
    private Card flop1;
    private Card flop2;
    private Card flop3;
    private Card turn;
    private Card river;

    public Table() {
        for(int i = 0;i<8;i++)
        {
            seats.add(new Seat(i));
        }
    }
    
    public void setFlop(Card p_flop1, Card p_flop2, Card p_flop3){
        this.flop1 = p_flop1;
        this.flop2 = p_flop2;
        this.flop3 = p_flop3;
    }
    
    public void setTurn(Card p_turn){
        this.turn = p_turn;
    }
    
    public void setRiver(Card p_river){
        this.river = p_river;
    }
    
    public void showCards(){
        System.out.println("Flop1: " + flop1.getValue() + " " + flop1.getSuit());
        System.out.println("Flop2: " + flop2.getValue() + " " + flop2.getSuit());
        System.out.println("Flop3: " + flop3.getValue() + " " + flop3.getSuit());
        

    }
}
