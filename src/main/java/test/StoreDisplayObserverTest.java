package test;

import com.iteso.observer.impl.StoreDisplayObserver;
import com.iteso.observer.Subject;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;


/**
 * Created by ShaSkills on 30/09/2015.
 */
public class StoreDisplayObserverTest {

    StoreDisplayObserver storeDisplayObserver;
    Subject subject;
    boolean bandera;

    @Before
    public void init(){
        storeDisplayObserver = new StoreDisplayObserver(subject, "Farchelona");
        bandera = false;
    }

    @Test
    public void ScoreUpdateTest() {
        bandera = storeDisplayObserver.scoreUpdate("Cristiano", "Messi", 3, 4);
        assertEquals(true, bandera);


    }
    @Test
    public void DisplayScoreTest(){
        bandera = storeDisplayObserver.display();
        assertEquals(true, bandera);
    }

}





