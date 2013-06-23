package net.matt.d20;

import net.matt.d20.net.matt.d20.utils.Items;

public class Main {


    public static void main(String[] args) {

        Character matt = new Character("Matt");
        Character devin = new Character("Devin");
        Campaign campaign = new Campaign("The legend of stuff");
        PartyList partyList = new PartyList(campaign);
        Items longSword = new Items("Long Sword", "crappy wooden brand!");

        matt.addItem(longSword);
        matt.addItem(new Items("Water Bottle", "great value!"));
        matt.showInventory();

        matt.removeItem(longSword);
        matt.showInventory();

    }

}
