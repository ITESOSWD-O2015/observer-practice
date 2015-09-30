package com.iteso.observer.impl;

import com.iteso.observer.Observer;
import com.iteso.observer.Subject;



/**
 * Created by ShaSkills on 29/09/2015.
 */
public class JamaiconMobileApp implements Observer {

    private String Local="";
    private String Visitor="";
    private int LocalGoals=-1;
    private int VisitorGoals=-1;
    private String TeamName;


    public JamaiconMobileApp(Subject scoresData, String TeamAlias){
        Subject scoresData1 = scoresData;
        this.TeamName = TeamAlias;
        scoresData1.registerObserver(this);
    }


    public boolean displayScore() {
        System.out.println(TeamName + "- Latest score is:");
        System.out.println(Local + " (Local) - " + LocalGoals);
        System.out.println(Visitor + " (Visitante) - " + VisitorGoals);

        return true;
    }


    public boolean scoreUpdate(String home, String away, int homeGoals, int awayGoals) {

        this.Local = home;
        this.Visitor = away;
        this.LocalGoals = homeGoals;
        this.VisitorGoals = awayGoals;
        System.out.println("Si entre");
        displayScore();

        if((home != null) && (away != null) && (homeGoals >= 0) && (awayGoals >= 0))
            return true;

        else
            return false;


    }


}

