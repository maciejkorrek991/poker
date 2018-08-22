/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Game;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Maciek
 */
public class Card {

    /**
     *
     */
    private final String value;
    private final String suit;

    Map<Integer, String> valueHasMap = new HashMap<>();
    Map<Integer, String> suitHasMap = new HashMap<>();

    /**
     *
     * @param p_idValue
     * @param p_idSuit
     */
    public Card(int p_idValue, int p_idSuit) {
        mapCards();
        value = valueHasMap.get(p_idValue);
        suit = suitHasMap.get(p_idSuit);
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @return
     */
    public String getSuit() {
        return suit;
    }

    private void mapCards() {

        valueHasMap.put(0, "2");
        valueHasMap.put(1, "3");
        valueHasMap.put(2, "4");
        valueHasMap.put(3, "5");
        valueHasMap.put(4, "6");
        valueHasMap.put(5, "7");
        valueHasMap.put(6, "8");
        valueHasMap.put(7, "9");
        valueHasMap.put(8, "10");
        valueHasMap.put(9, "J");
        valueHasMap.put(10, "Q");
        valueHasMap.put(11, "K");
        valueHasMap.put(12, "A");
        //spade
        suitHasMap.put(0, "S");
        //heart
        suitHasMap.put(1, "H");
        //diamond
        suitHasMap.put(2, "D");
        //club
        suitHasMap.put(3, "C");
    }
}
