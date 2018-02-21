/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/**
 *
 * @author kanth4624
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 4, 5, Direction.EAST);

        //karel moves back to (0,0)
        while (karel.getDirection() != Direction.NORTH) {
            karel.turnLeft();
        }
        //create command for streets and avenue
        while (karel.getStreet() != 0) {
            karel.move();
        }
        karel.turnLeft();

        while (karel.getAvenue() != 0) {
            karel.move();

        }









    }
}
