/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Props;

import backEnd.engine.Characters.Player;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Maciek
 */
public class Table {

    public ArrayList<Seat> seats = new ArrayList<Seat>();
    public HashMap<handValue, Float> chances = new HashMap<handValue, Float>();

    public enum handValue {HIGHCARD, PAIR, TWO_PAIRS, THREE_OF_KIND, STRAIGHT, FLUSH, FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH, ROYAL_FLUSH}

    private Card flop1;
    private Card flop2;
    private Card flop3;
    private Card turn;
    private Card river;

    public Table() {
        for (int i = 0; i < 8; i++) {
            seats.add(new Seat(i));
        }

        chances.put(handValue.HIGHCARD, (float) 0.00);
        chances.put(handValue.PAIR, (float) 0.00);
        chances.put(handValue.TWO_PAIRS, (float) 0.00);
        chances.put(handValue.THREE_OF_KIND, (float) 0.00);
        chances.put(handValue.STRAIGHT, (float) 0.00);
        chances.put(handValue.FLUSH, (float) 0.00);
        chances.put(handValue.FULL_HOUSE, (float) 0.00);
        chances.put(handValue.FOUR_OF_A_KIND, (float) 0.00);
        chances.put(handValue.STRAIGHT_FLUSH, (float) 0.00);
        chances.put(handValue.ROYAL_FLUSH, (float) 0.00);

    }

    public void setFlop(Card p_flop1, Card p_flop2, Card p_flop3) {
        this.flop1 = p_flop1;
        this.flop2 = p_flop2;
        this.flop3 = p_flop3;
    }

    public void setTurn(Card p_turn) {
        this.turn = p_turn;
    }

    public void setRiver(Card p_river) {
        this.river = p_river;
    }

    public void showCards() {
        System.out.println("Flop1: " + flop1.getValue() + " " + flop1.getSuit());
        System.out.println("Flop2: " + flop2.getValue() + " " + flop2.getSuit());
        System.out.println("Flop3: " + flop3.getValue() + " " + flop3.getSuit());
    }

    public HashMap<handValue, Float> calculateChances(Seat p_seat, Deck deck) {
        float x = (float) 0;
        if (p_seat.getCard1().getValue().equals(p_seat.getCard2().getValue()))
            x = (float) 100.0;
        else
            x = (float) 2* 1 / deck.getSize();

        chances.replace(handValue.PAIR, x);
        return chances;
    }

    public void showChanses(Seat p_seat, Deck deck) {
        HashMap<handValue, Float> chances = calculateChances(p_seat, deck);
        System.out.println("Szansa na HIGHCARD = " + chances.get(handValue.HIGHCARD) + "%");
        System.out.println("Szansa na PAIR = " + chances.get(handValue.PAIR) + "%");
        System.out.println("Szansa na TWO_PAIRS = " + chances.get(handValue.TWO_PAIRS) + "%");
        System.out.println("Szansa na THREE_OF_KIND = " + chances.get(handValue.THREE_OF_KIND) + "%");
        System.out.println("Szansa na STRAIGHT = " + chances.get(handValue.STRAIGHT) + "%");
        System.out.println("Szansa na FLUSH = " + chances.get(handValue.FLUSH) + "%");
        System.out.println("Szansa na FULL_HOUSE = " + chances.get(handValue.FULL_HOUSE) + "%");
        System.out.println("Szansa na FOUR_OF_A_KIND = " + chances.get(handValue.FOUR_OF_A_KIND) + "%");
        System.out.println("Szansa na STRAIGHT_FLUSH = " + chances.get(handValue.STRAIGHT_FLUSH) + "%");
        System.out.println("Szansa na ROYAL_FLUSH = " + chances.get(handValue.ROYAL_FLUSH) + "%");
    }

    public void seatPlayer(int p_seat, Player p_player) {
        seats.get(p_seat).seatPlayer(p_player);
    }

    public void showSeatCards(int p_seat) {
        System.out.println(seats.get(p_seat).getCard1().getValue() + " " + seats.get(p_seat).getCard1().getSuit());
        System.out.println(seats.get(p_seat).getCard2().getValue() + " " + seats.get(p_seat).getCard2().getSuit());
    }

    public Seat getSeat(int p_seat) {
        return seats.get(p_seat);
    }
}
