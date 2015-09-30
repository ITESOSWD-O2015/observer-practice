package com.iteso.observer.impl;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;

/**
 * Created by Aldo on 29/09/2015.
 */
public class JamaiconScoresSubjectTest {

    JamaiconScoresSubject jamaiconScoresSubject; //for testing
    StoreDisplayObserver storeDisplayObserver; //for mock and test A
    JamaiconMobileApp jamaiconMobileApp; //for mock and test B
    boolean success;

    @Before
    public void setUp(){
        jamaiconScoresSubject = new JamaiconScoresSubject();
        success = false;

        storeDisplayObserver = mock(com.iteso.observer.impl.StoreDisplayObserver.class);
        jamaiconMobileApp = mock(com.iteso.observer.impl.JamaiconMobileApp.class);
    }

    /////////////////////////////////////
    ////// FOR DISPLAY OBSERVER TYPE ////
    /////////////////////////////////////

    @Test //Can register a display observer
    public void testRegisterAnObserverDisplay(){
        success = jamaiconScoresSubject.registerObserver(storeDisplayObserver);
        assertEquals(true, success);
    }

    @Test //Can remove a display observer
    public void testRemoveAnObserverDisplay(){
        jamaiconScoresSubject.registerObserver(storeDisplayObserver);
        success = jamaiconScoresSubject.removeObserver(storeDisplayObserver);
        assertEquals(true, success);
    }

    /////////////////////////////////////
    //// FOR MOBILEAPP OBSERVER TYPE ////
    /////////////////////////////////////
    @Test
    public void testRegisterAnObserverApp() {
        success = jamaiconScoresSubject.registerObserver(jamaiconMobileApp);
        assertEquals(true, success);
    }

    @Test
    public void testRemoveAnObserverApp() {
        jamaiconScoresSubject.registerObserver(jamaiconMobileApp);
        success = jamaiconScoresSubject.removeObserver(jamaiconMobileApp);
        assertEquals(true, success);
    }

    ////////////////////////////////////
    /////// FOR GLOBAL TESTING /////////
    ////////////////////////////////////
    @Test
    public void testSetScore() {
        success = jamaiconScoresSubject.setScore("Equipo 1", "Equipo 2", 10, 4);
        assertEquals(true, success);
    }
    @Test
    public void testNotifyObservers(){
        success = jamaiconScoresSubject.notifyObservers();
        assertEquals(true, success);
    }
}
