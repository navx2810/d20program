package net.matt.d20;

import net.matt.d20.utils.Items;


public class Main {

/* *****************************************************************
 * For now this is a test app for the program. This will be replaced
 * later with a working GUI version.
 * *****************************************************************/
	
    public static void main(String[] args) {

        Character matt = new Character("Matt");
        Items longSword = new Items("Long Sword", "crappy wooden brand!");

        matt.addItem(longSword);
        matt.addItem(new Items("Water Bottle", "great value!"));
        matt.showInventory();

        matt.removeItem(longSword);
        matt.showInventory();

    }

}
