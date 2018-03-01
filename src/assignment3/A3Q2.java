/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author kanth4624
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a city
        City kitchener = new City();

        //add a robot
        RobotSE karel = new RobotSE(kitchener, 1, 1, Direction.EAST);

        //add 10 things 
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 1);

        //show how many things to count
        kitchener.showThingCounts(true);

        //integer move is created
        int move = 0;

        //10 things are moved to (2,2)
        while (move < 10) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnAround();
            karel.move();
            karel.turnAround();
            move = move + 1;
        }
        //karel will move to end off on top of the 10 things
        karel.move();
        
    }
}
