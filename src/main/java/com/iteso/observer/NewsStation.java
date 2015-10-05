package com.iteso.observer;


import com.iteso.observer.impl.StoreDisplayObserver;
import com.iteso.observer.impl.JamaiconScoresSubject;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/14/13
 * Time: 3:26 PM
 * To change this template use File | Settings | File Templates.
 */
class NewsStation {
    public static void main( String[] args ){
        JamaiconScoresSubject jamaiconScoresSubject;
        jamaiconScoresSubject = new JamaiconScoresSubject();

        List<Scorer> scorersALvsTT = new ArrayList<Scorer>();
        List<Scorer> scorersDAvsA = new ArrayList<Scorer>();
        List<Scorer> scorersCvsSST = new ArrayList<Scorer>();

        StoreDisplayObserver storeDisplayObserver = new StoreDisplayObserver(jamaiconScoresSubject);
        StoreDisplayObserver storeDisplayObserver2 = new StoreDisplayObserver(jamaiconScoresSubject);

        //Estos son los resultados del partido
        jamaiconScoresSubject.setScore("Atletico Lagos", "Tennis Tonatiuh", 2, 1, scorersALvsTT);
        jamaiconScoresSubject.setScore("Deportivo Arnoldos", "Aclas", 0, 0, scorersDAvsA);
        jamaiconScoresSubject.setScore("Chilaquiles", "ShaSkillsTeam", 3,2, scorersCvsSST);

        //Escribimos los anotadores de cada partido
        scorersALvsTT.add(new Scorer("Pepe", 4, "Defender", "Atletico Lagos"));
        scorersALvsTT.add(new Scorer("Pele", 10, "Forward", "Tennis Tonatiuh"));
        scorersALvsTT.add(new Scorer("Romario", 5, "Midfielder", "Atletico Lagos"));

        scorersCvsSST.add(new Scorer("Mario", 19, "Forward", "ShaSkillsTeam"));
        scorersCvsSST.add(new Scorer("Mario", 19, "Forward", "ShaSkillsTeam"));
        scorersCvsSST.add(new Scorer("Kalusha", 20, "Forward", "ShaSkillsTeam"));
        scorersCvsSST.add(new Scorer("Biyik", 7, "Midfielder", "Chilaquiles"));
        scorersCvsSST.add(new Scorer("Cafú", 2, "Defender", "Chilaquiles"));



    }
}
