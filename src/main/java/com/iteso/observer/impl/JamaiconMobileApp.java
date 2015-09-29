package com.iteso.observer.impl;



import com.iteso.observer.Observer;
import com.iteso.observer.Subject;


/**
 * Created by jose luis on 29/09/2015.
 */
public class JamaiconMobileApp {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private String name;

    public JamaiconMobileApp(Subject scoresData, String MobileApp){
        Subject scoresData1 = scoresData;
        this.name = MobileApp;
        scoresData1.registerObserver((Observer) this);
    }
    public void display() {
        System.out.println(name + "- Latest score is:");
        System.out.println(homeTeam + " (HOME) - " + homeGoals);
        System.out.println(awayTeam + " (AWAY) - " + awayGoals);
    }


    public void scoreUpdate(String home, String away, int homeGoals, int awayGoals) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        display();
    }
}
