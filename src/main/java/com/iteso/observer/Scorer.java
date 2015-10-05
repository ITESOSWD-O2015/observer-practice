package com.iteso.observer;

/**
 * Created by ShaSkills on 05/10/2015.
 */
public class Scorer {

    private String PlayerName;
    private int PlayerNumber;
    private String PlayerPosition;
    private String PlayerTeam;

    public Scorer(){

        setPlayerName("");
        setPlayerNumber(0);
        setPlayerPosition("Default");
        setPlayerTeam("NoTeamDefine");
    }

    public Scorer(String name, int number, String position, String team){
        this.setPlayerName(name);
        this.setPlayerNumber(number);
        this.setPlayerPosition(position);
        this.setPlayerTeam(team);
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public int getPlayerNumber() {
        return PlayerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        PlayerNumber = playerNumber;
    }

    public String getPlayerPosition() {
        return PlayerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        PlayerPosition = playerPosition;
    }

    public String getPlayerTeam() {
        return PlayerTeam;
    }

    public void setPlayerTeam(String playerTeam) {
        PlayerTeam = playerTeam;
    }
}
