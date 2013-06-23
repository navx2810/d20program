package net.matt.d20;


import java.util.ArrayList;

import net.matt.d20.utils.Items;

/**
 * Creator: Matt Fetterman - 6/23/13
 */
public class Inventory {
    //TODO: add an enum for each type of item: weapon, armor, usable, misc - to categorize the items.

    ArrayList<Items> inventory;

    public Inventory() {
        inventory = new ArrayList<Items>();
    }
    	// add an item to the array
    public void addItem(Items item) {
        inventory.add(item);
    }
    	// remove an item from the array
    public void removeItem(Items items) {
        inventory.remove(items);
    }

    //TODO: Remove before final, TEST FUNCTION
    	// send a string version of every item to the caller
    public String getInventory() {
        String msg = "";
        for (Items elem : inventory) {
            msg += elem.getName() + " - " + elem.getDescription() + " | ";
        }
        return msg;
    }
}
