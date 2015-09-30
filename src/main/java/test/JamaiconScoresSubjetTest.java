package test;

import com.iteso.observer.impl.JamaiconMobileApp;
import com.iteso.observer.impl.JamaiconScoresSubject;
import com.iteso.observer.impl.StoreDisplayObserver;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 29/09/2015.
 */
public class JamaiconScoresSubjetTest {

    JamaiconScoresSubject jamaiconScoresSubject;
    StoreDisplayObserver storeDisplayObserver;
    boolean bandera;

    @Before
    public void init(){


        jamaiconScoresSubject = new JamaiconScoresSubject();
        bandera = false;
    }

    @Test
    public void RegisterObserverTest(){
        bandera = jamaiconScoresSubject.registerObserver(storeDisplayObserver);
        assertEquals(true, bandera);
    }

    @Test
    public void RemoveObserverTest(){
        bandera = jamaiconScoresSubject.removeObserver(storeDisplayObserver);
        assertEquals(true,bandera);
    }


    @Test
    public  void SetScoreTest(){
        bandera = jamaiconScoresSubject.setScore("America", "Chivas", 1, 2);
        assertEquals(true, bandera);
    }

    @Test
    public void NotifyObserversTest(){
        bandera= jamaiconScoresSubject.notifyObservers();
        assertEquals(true, bandera);
    }
}
