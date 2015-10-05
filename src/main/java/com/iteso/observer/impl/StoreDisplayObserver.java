package com.iteso.observer.impl;

import com.iteso.observer.Displayable;
import com.iteso.observer.Scorer;
import com.iteso.observer.Subject;
import com.iteso.observer.Observer;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/14/13
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class StoreDisplayObserver implements Observer, Displayable {

    private List<Scorer> scores;
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData2;

    public StoreDisplayObserver(Subject scoresData){
        this.scoresData2 = scoresData;
        scoresData2.registerObserver(this);
    }

    public void display() {
        System.out.println("- Latest score is:");
        System.out.println(homeTeam + " (HOME) - " + homeGoals);
        System.out.println(awayTeam + " (AWAY) - " + awayGoals);

        //Hacemos un for each para desplegar los scores
        for(Scorer scorer: scores){
            System.out.println("Name: " + scorer.getPlayerName()+ "\nNumero: "+ scorer.getPlayerNumber()
                    +"\nPosicion: " + scorer.getPlayerPosition()+ "\nEquipo: " + scorer.getPlayerTeam());

        }

    }



    public void scoreUpdate(String home, String away, int homeGoals, int awayGoals, List<Scorer> scorer) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scores = scorer;
        display();
    }
}