package com.iteso.observer;

import com.iteso.observer.impl.JamaiconMobileApp;
import com.iteso.observer.impl.StoreDisplayObserver;
import com.iteso.observer.impl.JamaiconScoresSubject;

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

        StoreDisplayObserver storeDisplayObserver = new StoreDisplayObserver(jamaiconScoresSubject, " Tienda 1");
        StoreDisplayObserver storeDisplayObserver2 = new StoreDisplayObserver(jamaiconScoresSubject, " Tienda 2");

        JamaiconMobileApp jamaiconMobileApp = new JamaiconMobileApp(jamaiconScoresSubject, " Mobile 1");
        JamaiconMobileApp jamaiconMobileApp1 = new JamaiconMobileApp(jamaiconScoresSubject, " Mobile 2");

        jamaiconScoresSubject.setScore("Atletico Lagos", "Tennis Tonatiuh", 8, 1);
        jamaiconScoresSubject.setScore("Deportivo Arnoldos", "Aclas", 0, 0);
        jamaiconScoresSubject.setScore("El Gallo mueblerias", "Surtidora Departamental", 2, 5);

    }
}
