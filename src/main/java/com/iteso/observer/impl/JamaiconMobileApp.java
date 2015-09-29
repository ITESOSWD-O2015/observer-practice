package com.iteso.observer.impl;

import com.iteso.observer.Observer;
import com.iteso.observer.Subject;
import com.iteso.observer.Displayable;

/**
 * Created by ShaSkills on 29/09/2015.
 */
public class JamaiconMobileApp implements Observer {

    private String Local;
    private String Visitor;
    private int LocalGoals;
    private int VisitorGoals;
    private String TeamName;

    public JamaiconMobileApp(Subject scoresData, String TeamAlias){
        Subject scoresData1 = scoresData;
        this.TeamName = TeamAlias;
        scoresData1.registerObserver(this);
    }


    public void displayScore() {
        System.out.println(TeamName + "- Latest score is:");
        System.out.println(Local + " (Local) - " + LocalGoals);
        System.out.println(Visitor + " (Visitante) - " + VisitorGoals);
    }


    public void scoreUpdate(String home, String away, int homeGoals, int awayGoals) {
        this.Local = home;
        this.Visitor = away;
        this.LocalGoals = homeGoals;
        this.VisitorGoals = awayGoals;
        displayScore();
    }


}
