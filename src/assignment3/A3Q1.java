/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author kanth4624
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 0, 2, Direction.WEST);

        //create the walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);

        //loop created so karel moves around the walls 2 times
        int move = 0;
        while (move < 8) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
            move = move + 1;











        }




    }
