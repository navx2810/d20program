package net.matt.d20;

import net.matt.d20.net.matt.d20.utils.Items;

import java.util.ArrayList;

/**
 * Creator: Matt Fetterman - 6/23/13
 */
public class Inventory {
    //TODO: add an enum for each type of item: weapon, armor, usable, misc - to categorize the items.

    ArrayList<Items> inventory;

    public Inventory() {
        inventory = new ArrayList<Items>();
    }

    public void addItem(Items item) {
        inventory.add(item);
    }

    public void removeItem(Items items) {
        inventory.remove(items);
    }

    //TODO: Remove before final, TEST FUNCTION
    public String getInventory() {
        String msg = "";
        for (Items elem : inventory) {
            msg += elem.getName() + " - " + elem.getDescription() + " | ";
        }
        return msg;
    }
}
