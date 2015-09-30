package com.iteso.observer.impl;

import com.iteso.observer.Displayable;
import com.iteso.observer.Subject;
import com.iteso.observer.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/14/13
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class StoreDisplayObserver implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private String name;

    public StoreDisplayObserver(Subject scoresData, String storeName){
        Subject scoresData2 = scoresData;
        this.name = storeName;
        scoresData2.registerObserver(this);
    }

    public boolean display() {
        System.out.println(name + "- Latest score is:");
        System.out.println(homeTeam + " (HOME) - " + homeGoals);
        System.out.println(awayTeam + " (AWAY) - " + awayGoals);

        return true;
    }

    public boolean scoreUpdate(String home, String away, int homeGoals, int awayGoals) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        display();

        return true;
    }
}