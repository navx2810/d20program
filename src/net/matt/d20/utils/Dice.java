package net.matt.d20.utils;

import java.util.Random;

/**
 * @deprecated there's no reason for dice rolls
 * Creator: Matt Fetterman - 6/23/13
 */


public class Dice {
    static Random diceRoll = new Random();

    public static int rollDice(int numberOfSides) {
        return diceRoll.nextInt(numberOfSides) + 1;
    }
}
