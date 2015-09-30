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
    private int homeGoals=-2;
    private int awayGoals=-1;
    private String homeTeam="";
    private String awayTeam="";


    public JamaiconScoresSubject(){

        observers = new ArrayList();
    }


    public boolean registerObserver(Observer observer) {

        if(observer != null){
            observers.add(observer);
            return true;
        }
        else
            return false;
    }


    public boolean removeObserver(Observer observer) {

        if(observer != null){
            observers.remove(observers.indexOf(observer));
            return true;
        }

        else return false;
    }


    public boolean notifyObservers() {
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.scoreUpdate(this.homeTeam, this.awayTeam, this.homeGoals, this.awayGoals);
        }

        return true;
    }



    public boolean setScore( String home, String away, int hg, int ag){

        if(home != null && away != null && hg>=0 && ag>=0){
            this.homeTeam = home;
            this.awayTeam =  away;
            this.homeGoals = hg;
            this.awayGoals = ag;
            notifyObservers();
            return true;
        }

        else return false;




    }

}