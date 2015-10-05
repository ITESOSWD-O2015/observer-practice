package com.iteso.observer.impl;

import com.iteso.observer.Observer;
import com.iteso.observer.Scorer;
import com.iteso.observer.Subject;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ShaSkills on 29/09/2015.
 */
public class JamaiconMobileApp implements Observer {

    private List<Scorer> scorers;
    private String Local="";
    private String Visitor="";
    private int LocalGoals=-1;
    private int VisitorGoals=-1;
    private Subject scoresData1;


    public JamaiconMobileApp(Subject scoresData){
        Subject scoresData1 = scoresData;
        scoresData1.registerObserver(this);
    }


    public void displayScore() {
        System.out.println("- Latest score is:");
        System.out.println(Local + " (Local) - " + LocalGoals);
        System.out.println(Visitor + " (Visitante) - " + VisitorGoals);

        //Hacemos un for each para desplegar los scores
        for(Scorer scorer: scorers){
            System.out.println("Name: " + scorer.getPlayerName()+ "\nNumero: "+ scorer.getPlayerNumber()
                    +"\nPosicion: " + scorer.getPlayerPosition()+ "\nEquipo: " + scorer.getPlayerTeam());

        }
    }


    public void scoreUpdate(String home, String away, int homeGoals, int awayGoals, List<Scorer> scores) {
        this.Local = home;
        this.Visitor = away;
        this.LocalGoals = homeGoals;
        this.VisitorGoals = awayGoals;
        this.scorers = scores;
        System.out.println("Si entre");
        displayScore();

    }


}

