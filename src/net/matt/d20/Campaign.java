package net.matt.d20;

/**
 * Creator: Matt Fetterman - 6/23/13
 */
public class Campaign {
    String name, log;

    // ----- [ Campaign constructor with NAME ] ----- //
    
    public Campaign(String name) {
        this.name = name;
        log = String.format("%s - Start\n", name);
    }
    
    //TODO: Create an add() function which will add a string to the log
    
    //TODO: Create a getLog() function that will dump the entire log so it can be saved to a file

}
