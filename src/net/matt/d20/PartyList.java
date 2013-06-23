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

    public void addPlayer(Character player) {
        players.add(player);
    }

    public void removePlayer(Character player) {
        players.remove(player);

    }

    //TODO: delete this before final version
    public void showPlayers() {
        System.out.print("Current Party: ");
        for (Character character : players) {
            System.out.print(character.characterName + " | ");
        }
    }


}
