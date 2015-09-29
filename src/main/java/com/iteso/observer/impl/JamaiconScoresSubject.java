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
    private int homeGoals;
    private int awayGoals;
    private String homeTeam;
    private String awayTeam;


    public JamaiconScoresSubject(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }


    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    @Override
    public void notifyObservers() {
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.scoreUpdate(this.homeTeam, this.awayTeam, this.homeGoals, this.awayGoals);
        }
    }



    public void setScore( String home, String away, int hg, int ag){
        this.homeTeam = home;
        this.awayTeam =  away;
        this.homeGoals = hg;
        this.awayGoals = ag;
        notifyObservers();
    }

}
