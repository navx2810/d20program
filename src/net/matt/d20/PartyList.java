package net.matt.d20;

import java.util.ArrayList;

/**
 * Creator: Matt Fetterman - 6/23/13
 */
public class PartyList {
    ArrayList<Character> players;
    Campaign currentCampaign;

    public PartyList(Campaign currentCampaign) {
        this.currentCampaign = currentCampaign;
        this.players = new ArrayList<Character>();
    }
    	// add a player to the group
    public void addPlayer(Character player) {
        players.add(player);
    }
    
    	// remove a player from the group
    public void removePlayer(Character player) {
        players.remove(player);

    }

    //TODO: delete this before final version
    	// display the players through the console
    public void showPlayers() {
        System.out.print("Current Party: ");
        for (Character character : players) {
            System.out.print(character.characterName + " | ");
        }
    }


}
