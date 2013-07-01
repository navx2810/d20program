package net.matt.d20.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import net.matt.d20.Campaign;

public class CampaignSaver {

		/*==========================================*
		 * This class is meant to save the campaign
		 * =========================================*/
	
	PrintWriter pWriter;
	File gameSave;
	Campaign campaign;
	String campaignName;
	Scanner reader;
	
	/**
	 * Constructor that starts the campaign saver. This will automatically generate the appropriate starter
	 * tags which can be readable by the saver.
	 * @param campaign - the campaign that's currently being played
	 * @throws Exception - file not found
	 */
	public CampaignSaver(Campaign campaign) throws FileNotFoundException{
		this.campaign = campaign;
		campaignName = campaign.name;
	}
	
	/**
	 * this method will start a campaign and create a new save file for it.
	 */
	public void startCampaign(){
		gameSave = new File(campaignName+".mtc");
	}
	
	/**
	 * The method that will save the current campaign
	 * @throws Exception 
	 */
	//TODO: Remove the public accessor from this. Eventually, the Campaign will have a endSession method which will call this
	public void saveCampaign() throws Exception {
		pWriter = new PrintWriter(gameSave);
		pWriter.print(campaign.getLog());
		pWriter.close();
	}
	
	/**
	 * this method will load the campaign and save the file path to the gameSave file.
	 * @param filePath - the file location to write too
	 * @throws Exception
	 */
	public void loadCampaign(String filePath) throws Exception {
		gameSave = new File(filePath);
		StringBuilder oldLog = new StringBuilder();
		reader = new Scanner(gameSave);
		
		while (reader.hasNext())
			oldLog.append(reader.next());
		
		//pass this string builder over to the campaign class
			
	}
	
}
