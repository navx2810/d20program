package net.matt.d20;

import net.matt.d20.utils.CampaignSaver;
import net.matt.d20.utils.Items;


public class Main {

/* *****************************************************************
 * For now this is a test app for the program. This will be replaced
 * later with a working GUI version.
 * *****************************************************************/
	
    public static void main(String[] args) throws Exception {

        Campaign campaign = new Campaign("stuff of stuff");
    	Character matt = new Character("Matt");
        Items longSword = new Items("Long Sword", "crappy wooden brand!");
        CampaignSaver campaignSaver = new CampaignSaver(campaign);

        matt.addItem(longSword);
        matt.addItem(new Items("Water Bottle", "great value!"));
        matt.showInventory();

        matt.removeItem(longSword);
        matt.showInventory();
        
        campaign.add("Matt started his thing");
        campaign.add("Jason did work");
        campaign.add("Jordan died");
        
        System.out.println(campaign.getLog());
        
        campaignSaver.saveCampaign();

    }

}
