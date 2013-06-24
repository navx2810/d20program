package net.matt.d20;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * This class is where the campaign log is held and manipulated
 * @author Navx2810
 * @version 1.0
 * 
 */

public class Campaign {
    public String name;
    StringBuilder log;
    Date date;
    SimpleDateFormat monthDateFormat, timeDateFormat;

    // ----- [ Campaign constructor with NAME ] ----- //
    	
    	/**
    	 * the constructor for the campaign with the campaign's name
    	 * @param name - the name of the campaign you're playing ex:"Village gone Fowl 1"
    	 */
    public Campaign(String name) {
        this.name = name;
        date = new Date();
        monthDateFormat = new SimpleDateFormat("MM/dd");
        timeDateFormat = new SimpleDateFormat("hh:mm a");
        
        log = new StringBuilder();
        log.append(String.format("Campaign: %s - Start [%s || %s]\n===========", name, monthDateFormat.format(date), timeDateFormat.format(date)) );
    }
    	
    	/**
    	 * this method will add a string to the log. It will automatically add any handlers (such as time + date) to the message log automatically
    	 * @param msg - the message the player wants to record to the log.
    	 */
    public void add(String msg){
    	log.append(String.format("\n[%s || %s] %s", monthDateFormat.format(date), timeDateFormat.format(date), msg));
    }
    	
    	/**
    	 * this method will return a string of the entire log which will be used to save the campaign
    	 * @return Log - the entire recorded summary of the current campaign.
    	 */
    public String getLog() {
		return log.toString();
	}
    	// the function to use to continue a session that already has started
    public void beginSession(){
    	
    }
    	// ending a session
    public void endSession(){
    	
    }
   
}
