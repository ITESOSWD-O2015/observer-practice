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
    private String homeTeam = "No hay equipo 1";
    private String awayTeam = "No hay equipo 2";
    private String name = "No hay nombre";
    private int homeGoals = -1;
    private int awayGoals = -2;

    public StoreDisplayObserver(Subject scoresData, String storeName){
        Subject scoresData1 = scoresData;
        this.name = storeName;
        scoresData1.registerObserver(this);
    }

    @Override
    public boolean display() {
        System.out.println(name + "- Latest score is:");
        System.out.println(homeTeam + " (HOME) - " + homeGoals);
        System.out.println(awayTeam + " (AWAY) - " + awayGoals);

        return true;
    }

    @Override
    public boolean scoreUpdate(String home, String away, int hg, int ag) {

        String prevHome = homeTeam;
        String prevAway = awayTeam;
        int prevHg = homeGoals;
        int prevAg = awayGoals;

        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = hg;
        this.awayGoals = ag;
        display();

        if(prevHome != this.homeTeam && prevAway != this.awayTeam && prevHg != this.homeGoals && prevAg != this.awayGoals)
            return true;
        else
            return false;

    }
}
