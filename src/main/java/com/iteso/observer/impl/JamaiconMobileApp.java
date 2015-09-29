package com.iteso.observer.impl;

import com.iteso.observer.Displayable;
import com.iteso.observer.Observer;

/**
 * Created by JoseFranco on 29/09/2015.
 */
public class JamaiconMobileApp implements Observer, Displayable{
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private String name;

    @Override
    public void display() {
        System.out.println(name + "- Latest score is:");
        System.out.println(homeTeam + " (HOME) - " + homeGoals);
        System.out.println(awayTeam + " (AWAY) - " + awayGoals);
    }

    @Override
    public void scoreUpdate(String home, String away, int homeGoals, int awayGoals) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        display();
    }
}