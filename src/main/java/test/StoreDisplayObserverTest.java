package test;

import com.iteso.observer.Scorer;
import com.iteso.observer.impl.JamaiconMobileApp;
import com.iteso.observer.impl.JamaiconScoresSubject;
import com.iteso.observer.impl.StoreDisplayObserver;
import com.iteso.observer.Subject;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


/**
 * Created by ShaSkills on 30/09/2015.
 */
public class StoreDisplayObserverTest {

    StoreDisplayObserver storeDisplayObserver;
    JamaiconScoresSubject scoresData;

    private List<Scorer> scorers;

    @Before
    public void init(){
        scoresData = mock(JamaiconScoresSubject.class);
        storeDisplayObserver  = new StoreDisplayObserver(scoresData);
    }

    @org.testng.annotations.Test
    public void ScoreUpdateTest(){

        scorers = new ArrayList<Scorer>();
        scorers.add(new Scorer("Manolo", 10, "GoalKeeper", "ChanguitosTeam"));
        scorers.add(new Scorer("Venancio", 7, "Forward", "LopezTeam"));


    }


}





