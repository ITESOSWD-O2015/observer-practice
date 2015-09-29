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
/*public class StoreDisplayObserver implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private String name;

    public StoreDisplayObserver(Subject scoresData, String storeName){
        Subject scoresData1 = scoresData;
        this.name = storeName;
        scoresData1.registerObserver(this);
    }
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
}*/

	public class MobileAppObserver implements Observer, Displayable {  
		public String homeTeam; 
		public String awayTeam; 
		public int homeGoals; 
		public int awayGoals;
		private int homeGoals;
		private int awayGoals;
		private String tName;


	public MobileAppObserver(Subject scoresData, String storeName) {
		Subject scoresData1 = scoresData;
		this.tName = storeName;
		scoresData1.registerObserver(this);
	}


	public void display() {
	       	System.out.println(tName + "- Latest score is:");
        	System.out.println(localTeam + " (HOME) - " + homeGoals);
        	System.out.println(awayTeam + " (AWAY) - " + awayGoals);
    	}

        public void scoreUpdate(String home, String away, int localGoals, int awayGoals) {
    	    this.localTeam = home;
            this.visitorTeam = away;
            this.homeGoals = homeGoals;
            this.awayGoals = awayGoals;
            display();
    }
}