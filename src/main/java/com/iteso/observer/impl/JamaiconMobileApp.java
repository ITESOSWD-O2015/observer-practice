package com.iteso.observer.impl;
import com.iteso.observer.Observer;
import com.iteso.observer.Subject;

/**
 * Created by Sacrp on 9/29/15.
 */
public class JamaiconMobileApp implements Observer {

    private String localTeam;
    private String visitorTeam;
    private String teamName;
    private int localGoals;
    private int visitorGoals;

    public JamaiconMobileApp(Subject scoresData, String storeName){
        Subject scoresData1 = scoresData;
        this.teamName = storeName;
        scoresData1.registerObserver(this);
    }

    public void showResults() {
        System.out.println(teamName + "- Latest score is:");
        System.out.println(localTeam + " (LOCAL) - " + localGoals);
        System.out.println(visitorTeam + " (VISITOR) - " + visitorGoals);
    }

    public void scoreUpdate(String home, String away, int localGoals, int awayGoals) {
        this.localTeam = home;
        this.visitorTeam = away;
        this.localGoals = localGoals;
        this.visitorGoals = awayGoals;
        showResults();
    }
}

