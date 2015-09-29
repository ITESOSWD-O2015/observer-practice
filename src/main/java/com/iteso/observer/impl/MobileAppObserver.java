package com.iteso.observer.impl;

import com.iteso.observer.Displayable;
import com.iteso.observer.Observer;
import com.iteso.observer.Subject;

/**
 * Created by Paloma on 29/09/2015.
 */
public class MobileAppObserver implements Observer, Displayable {

    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private String name;

    public MobileAppObserver(Subject scoresData, String storeName){
        Subject scoresData1 = scoresData;
        this.name = storeName;
        scoresData1.registerObserver(this);
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
