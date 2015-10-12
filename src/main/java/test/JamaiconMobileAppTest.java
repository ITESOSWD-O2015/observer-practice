package test;

import com.iteso.observer.Scorer;
import com.iteso.observer.Subject;
import com.iteso.observer.impl.JamaiconMobileApp;
import com.iteso.observer.impl.JamaiconScoresSubject;
import org.junit.Before;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by ShaSkills on 29/09/2015.
 */
public class JamaiconMobileAppTest {

    JamaiconMobileApp jamaiconMobileApp;
    JamaiconScoresSubject scoresData;

    private List<Scorer> scorers;

    @Before
    public void init(){
            scoresData = mock(JamaiconScoresSubject.class);
            jamaiconMobileApp  = new JamaiconMobileApp(scoresData);
    }

    @Test
    public void ScoreUpdateTest(){
        scorers = new ArrayList<Scorer>();
        scorers.add(new Scorer("Manolo", 10, "GoalKeeper", "ChanguitosTeam"));
        scorers.add(new Scorer("Venancio", 7, "Forward", "LopezTeam"));


    }


}

