/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.engine.Props;

/**
 * @author Maciek
 */
public class Card {

    /**
     *
     */
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    private String suit;
    private int card_id;

    public int getCard_id() {
        return card_id;
    }

    public void setCard_id(int p_card_id) {
        this.card_id = p_card_id;
    }




    /**
     * @param p_Value
     * @param p_Suit
     */
    public Card(String p_Value, String p_Suit) {
        this.value = p_Value;
        this.suit = p_Suit;
    }

    public Card() {
        this.value = "4";
        this.suit = "A";
    }

    /**
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * @return
     */
    public String getSuit() {
        return suit;
    }

}
