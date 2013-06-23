package net.matt.d20;

import net.matt.d20.net.matt.d20.utils.Items;

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

    public void addItem(Items item) {
        backpack.addItem(item);
    }

    public void removeItem(Items items) {
        backpack.removeItem(items);
    }

    public void showInventory() {
        System.out.println(characterName + "'s inventory: " + backpack.getInventory());
    }
}
