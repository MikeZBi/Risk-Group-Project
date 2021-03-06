package com.teamB;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class App2Test
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String USA = "USA";
        String JPN = "JPN";
        String EU = "EU";

        Graph myGame = new Graph();
        myGame.createInitialMap(3);
        myGame.bindCountriesToNumbers("USA");
        myGame.bindCountriesToNumbers("JPN");
        myGame.bindCountriesToNumbers("EU");

        myGame.addEdge(USA, JPN);
        myGame.addEdge(USA, EU);
        myGame.addEdge(EU, JPN);

        Map myGameMap = new Map(myGame);


        Player mike = new Player("Mike", 1);
        Player bryan = new Player("Bryan", 2);
        Player brandon = new Player("Brandon", 3);

        myGameMap.addArmy(USA, mike);
        myGameMap.addArmy(EU, mike);

        Army myObject = new Army();

        //Should not be null as all players have been constructed
        assertNotNull(mike);
        assertNotNull(bryan);
        assertNotNull(brandon);
    }
}
