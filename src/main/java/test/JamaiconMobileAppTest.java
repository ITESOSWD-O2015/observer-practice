package test;

import com.iteso.observer.Subject;
import com.iteso.observer.impl.JamaiconMobileApp;
import org.junit.Before;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 29/09/2015.
 */
public class JamaiconMobileAppTest {

    JamaiconMobileApp jamaiconMobileApp;
    Subject subject;
    boolean bandera;

    @Before
    public void init(){
            jamaiconMobileApp  = new JamaiconMobileApp(subject, "Real Mandil");
            bandera = false;
    }

    @Test
    public void ScoreUpdateTest(){

        bandera = jamaiconMobileApp.scoreUpdate("Porto" , "Chelsea", 2, 1);
        assertEquals(true, bandera);
    }

    @Test
    public void DisplayScoreTest(){
        bandera = jamaiconMobileApp.displayScore();
        assertEquals(true, bandera);
    }
}

