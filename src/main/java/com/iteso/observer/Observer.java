package com.iteso.observer;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/14/13
 * Time: 2:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Observer {
   public void scoreUpdate(String home, String away, int homeGoals, int awayGoals, List<Scorer> scorer);
}
