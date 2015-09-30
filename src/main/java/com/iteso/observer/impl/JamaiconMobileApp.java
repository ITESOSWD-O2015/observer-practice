package com.iteso.observer.impl;
import com.iteso.observer.Observer;
import com.iteso.observer.Subject;

/**
 * Created by Sacrp on 9/29/15.
 */
public class JamaiconMobileApp implements Observer {

    private String homeTeam = "No hay equipo 1";
    private String awayTeam = "No hay equipo 2";
    private String name = "No hay nombre";
    private int homeGoals = -1;
    private int awayGoals = -2;

    public JamaiconMobileApp(Subject scoresData, String storeName){
        Subject scoresData1 = scoresData;
        this.name = storeName;
        scoresData1.registerObserver(this);
    }

    public boolean showResults() {
        System.out.println(name + "- Latest score is:");
        System.out.println(homeTeam + " (LOCAL) - " + homeGoals);
        System.out.println(awayTeam + " (VISITOR) - " + awayGoals);

        return true;
    }

    public boolean scoreUpdate(String home, String away, int hg, int ag) {

        String prevHome = homeTeam;
        String prevAway = awayTeam;
        int prevHg = homeGoals;
        int prevAg = awayGoals;


        this.homeTeam = home;
        this.awayTeam =  away;
        this.homeGoals = hg;
        this.awayGoals = ag;

        showResults();

        if(prevHome != this.homeTeam && prevAway != this.awayTeam && prevHg != this.homeGoals && prevAg != this.awayGoals)
            return true;
        else
            return false;

    }
}

