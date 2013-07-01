package net.matt.d20.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import net.matt.d20.Campaign;

public class CampaignSaver {

		/*==========================================*
		 * This class is meant to save the campaign
		 * =========================================*/
	
	FileWriter fWriter;
	PrintWriter pWriter;
	File gameSave;
	Campaign campaign;
	String campaignName;
	
	/**
	 * Constructor that starts the campaign saver. This will automatically generate the appropriate starter
	 * tags which can be readable by the saver.
	 * @param campaign - the campaign that's currently being played
	 * @throws Exception - file not found
	 */
	public CampaignSaver(Campaign campaign) throws Exception{
		this.campaign = campaign;
		campaignName = campaign.name;
		gameSave = new File(campaignName+".mtc");
		
		//if file exists, use FileWriter, if file doesn't, use PrintWriter
		pWriter = new PrintWriter(gameSave);
	
	}
	
	/**
	 * The method that will save the current campaign
	 */
	//TODO: Remove the public accessor from this. Eventually, the Campaign will have a endSession method which will call this
	public void saveCampaign() {
		pWriter.print(campaign.getLog());
		pWriter.close();
	}
	
	public void loadCampaign() {
	}
	
}
