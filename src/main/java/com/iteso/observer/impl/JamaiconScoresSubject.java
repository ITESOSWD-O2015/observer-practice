package com.iteso.observer.impl;

import com.iteso.observer.Subject;
import com.iteso.observer.Observer;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/14/13
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class JamaiconScoresSubject implements Subject {
    private final ArrayList observers;
    private int homeGoals = -1;
    private int awayGoals = -1;
    private String homeTeam = "No hay Equipo";
    private String awayTeam = "No hay Equpo";


    public JamaiconScoresSubject(){
        observers = new ArrayList<Observer>();
    }


    @Override
    public boolean registerObserver(Observer observer) {

        int arrySize = observers.size();
        observers.add(observer);

        if(observers.size() > arrySize)  return true;
        else return false;
    }

    @Override
    public boolean removeObserver(Observer observer) {

        int arrySize = observers.size();
        observers.remove(observers.indexOf(observer));

        if(observers.size() < arrySize) return true;


        else return false;
    }

    @Override
    public boolean notifyObservers() {
        for (Object temp : observers) {
            Observer observer = (Observer) temp;
            observer.scoreUpdate(this.homeTeam, this.awayTeam, this.homeGoals, this.awayGoals);
        }

        return true;
    }

    public boolean setScore( String home, String away, int hg, int ag){

        String prevHome = homeTeam;
        String prevAway = awayTeam;
        int prevHg = homeGoals;
        int prevAg = awayGoals;


        this.homeTeam = home;
        this.awayTeam =  away;
        this.homeGoals = hg;
        this.awayGoals = ag;

        notifyObservers();

        if(prevHome != this.homeTeam && prevAway != this.awayTeam && prevHg != this.homeGoals && prevAg != this.awayGoals)
            return true;
        else
            return false;
    }

}
