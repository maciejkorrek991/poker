package backEnd.database;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Draws {

    @GeneratedValue(strategy = GenerationType.AUTO)
    public int draw_id = 0;
    private int flop1;
    private int flop2;
    private int flop3;
    private int turn;
    private int river;
    private String ld_tm;

    public Draws(){

    }

    public Draws(int p_flop1, int p_flop2, int p_flop3, int p_turn, int p_river){
        this.flop1 = p_flop1;
        this.flop2 = p_flop2;
        this.flop3 = p_flop3;
        this.turn = p_turn;
        this.river = p_river;
    }
    public int getFlop3() {
        return flop3;
    }



    public int getDraw_id() {
        return draw_id;
    }

    public int getFlop1() {
        return flop1;
    }

    public int getFlop2() {
        return flop2;
    }

    public int getTurn() {
        return turn;
    }

    public int getRiver() {
        return river;
    }

    public String getLd_tm() {
        return ld_tm;
    }

    public void setDraw_id(int draw_id) {
        this.draw_id = draw_id;
    }

    public void setFlop1(int flop1) {
        this.flop1 = flop1;
    }

    public void setFlop2(int flop2) {
        this.flop2 = flop2;
    }

    public void setFlop3(int flop3) {
        this.flop3 = flop3;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void setRiver(int river) {
        this.river = river;
    }

    public void setLd_tm() {
        this.ld_tm = "a";
    }


}
