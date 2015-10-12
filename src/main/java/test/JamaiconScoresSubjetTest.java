package test;

import com.iteso.observer.Observer;
import com.iteso.observer.Scorer;
import com.iteso.observer.impl.JamaiconMobileApp;
import com.iteso.observer.impl.JamaiconScoresSubject;
import com.iteso.observer.impl.StoreDisplayObserver;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by ShaSkills on 29/09/2015.
 */
public class JamaiconScoresSubjetTest {

    JamaiconScoresSubject jamaiconScoresSubject;
    Observer observer;

    List<Scorer> scorers;

    @Before
    public void init(){

        jamaiconScoresSubject = new JamaiconScoresSubject();
        observer = mock(Observer.class);

    }

    @Test
    public void testSetScore(){

        jamaiconScoresSubject.registerObserver(observer);
        jamaiconScoresSubject.registerObserver(observer);

        jamaiconScoresSubject.setScore("Madrid", "Atletico", 1, 1, scorers);

        verify(observer, times(2)).scoreUpdate("Madrid", "Atletico", 1, 1, scorers);
    }


}
