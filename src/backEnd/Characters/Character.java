/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd.Characters;

import java.util.ArrayList;

/**
 *
 * @author Maciek
 */
public abstract class Character {

    /**
     *
     */
    public String name;

    /**
     *
     * @param p_name
     */
    public Character(String p_name) {
        this.name = p_name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     */
    public void test() {

    }
}
