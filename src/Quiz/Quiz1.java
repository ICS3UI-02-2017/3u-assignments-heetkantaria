/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author kanth4624
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kw = new City();

        //create a robot
        RobotSE karel = new RobotSE(kw, 4, 0, Direction.EAST);

        //build the walls
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.EAST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);

        //add things/lights
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        
        //mave karel pick up first light
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        
        //karel.picks up second light
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        
        //karel picks up thrid light
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        
        //karel picks up fourth light
        karel.move();
        karel.pickThing();
        
        //karel places first item on spot beside
        karel.move();
        karel.putThing();
        
        //karel puts second light down
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        
        //karel puts third light down
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        
        //karel puts fourth light down
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        
        //karel moves from the light
        karel.turnLeft();
        karel.move();
        
        
      












    }
}
