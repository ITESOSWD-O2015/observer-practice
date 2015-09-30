package com.iteso.observer.impl;

import com.iteso.observer.Subject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Aldo on 29/09/2015.
 */
public class JamaiconMobileAppTest {

    JamaiconMobileApp jamaiconMobileApp;
    Subject subject;
    boolean success;

    @Before
    public void setUp(){
        subject = mock(com.iteso.observer.Subject.class);
        jamaiconMobileApp = new JamaiconMobileApp(subject, "Tienda 1");
        success = false;
    }

    @Test
    public void testScoreUpdate(){
        success = jamaiconMobileApp.scoreUpdate("Equipo 1" , "Equipo 2", 10, 5);
        assertEquals(true, success);
    }

    @Test
    public void testDisplay(){
        success = jamaiconMobileApp.showResults();
        assertEquals(true, success);
    }
}
