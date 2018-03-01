/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author kanth4624
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create the city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        //create a integer
        int numberOfMoves = 20;

        //make karel plant the seeds
        while (numberOfMoves > 0) {
            if (!karel.canPickThing()) {

                karel.putThing();
                numberOfMoves = numberOfMoves - 1;

            }
            //make karel move
            karel.move();
            if (karel.getAvenue() == 5) {
                karel.turnRight();

            }

            if (karel.getAvenue() == 1) {
                karel.turnLeft();
            }
        }

    }
}
