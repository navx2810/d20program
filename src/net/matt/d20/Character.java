package net.matt.d20;

import net.matt.d20.utils.Items;


/**
 * Creator: Matt Fetterman - 6/23/13
 */

public class Character {
    String characterName, playerName, characterClass, characterRace;
    int level, strength, constitution, dexterity, intelligence, wisdom, charisma, maxHP, currentHP;
    Inventory backpack;

    //TODO: REMOVE, this is a test constructor for Character
    public Character(String characterName) {
        this.characterName = characterName;
        backpack = new Inventory();
    }
    	// will add a given item into the players inventory //
    public void addItem(Items item) {
        backpack.addItem(item);
    }
    	// will remove an item from the players inventory //
    public void removeItem(Items items) {
        backpack.removeItem(items);
    }
    	// will display players inventory as a String output //
    public void showInventory() {
        System.out.println(characterName + "'s inventory: " + backpack.getInventory());
    }
}
