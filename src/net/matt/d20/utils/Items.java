package net.matt.d20.utils;

/**
 * Creator: Matt Fetterman - 6/23/13
 */

public class Items {
    String name, description;

    public Items(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
