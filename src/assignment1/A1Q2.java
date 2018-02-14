/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author kanth4624
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Create a new city
        City Kw = new City ();
        
        //Add a robot in kw
        RobotSE mike = new RobotSE (Kw, 1, 2, Direction.SOUTH);
        
        //Create the wall for the front porch
        new Wall (Kw, 1, 2, Direction.EAST);
         new Wall (Kw, 1, 1, Direction.WEST);
          new Wall (Kw, 2, 1, Direction.WEST);
          new Wall (Kw, 1, 1, Direction.NORTH);
          new Wall (Kw, 1, 2, Direction.NORTH);
          new Wall(Kw, 2, 1, Direction.SOUTH);
          new Wall(Kw, 1, 2, Direction.SOUTH);
          
          //add the circle object in its location
          new Thing (Kw, 2, 2, Direction.EAST);
          
          //Move mike to the right and 1 ahead
          mike.turnRight();
          mike.move();
          
          //Move mike to the left and down one space
         mike.turnLeft();
          mike.move();
          
          //Move mike to the right and 1 ahead
          mike.turnLeft();
          mike.move();
          
          //Pick up the object
          mike.pickThing();
          
          //Turn to the other side
          mike.turnRight(2);
          
          //move mike straight ahead 1
           mike.move();
           
           //mike turns right
           mike.turnRight();
           
            //move mike straight ahead 1
           mike.move();
           
             //mike turns right
           mike.turnRight();
           
            //move mike straight ahead 1
           mike.move();
           
           //mike goes to original position
           mike.turnRight();
           
           
           
           
           
           
           
          
        
          
          
        
          
          
          
          
          
        
        
        
    }
}
