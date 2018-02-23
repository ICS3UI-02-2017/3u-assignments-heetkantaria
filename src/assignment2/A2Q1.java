/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author kanth4624
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        //Create a City for the Robot
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);

        //add 10 things in front of robot
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        //robot picks up 7 items

        while (karel.getAvenue() != 12) {
            karel.move();
            if (karel.countThingsInBackpack() < 7) {
                karel.pickThing();
            } else if (karel.countThingsInBackpack() > 7) {
            }
        }
    }
}

