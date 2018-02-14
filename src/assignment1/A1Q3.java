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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create a new city
        City Kw = new City ();
        
        //Add a robot in kw
        RobotSE mike = new RobotSE (Kw, 3, 0, Direction.EAST);
        
        //Add all the walls into its location
        new Wall (Kw, 3, 2, Direction.WEST);
        new Wall (Kw, 2, 3, Direction.WEST);
        new Wall (Kw, 1, 3, Direction.WEST);
        new Wall (Kw, 3, 2, Direction.NORTH);
        new Wall (Kw, 1, 3, Direction.NORTH);
        new Wall (Kw, 2, 4, Direction.NORTH);
        new Wall (Kw, 2, 4, Direction.EAST);
         new Wall (Kw, 3, 4 ,Direction.EAST);
          new Wall (Kw, 1, 3, Direction.EAST);
          
          //add thing
          new Thing(Kw, 3, 1, Direction.EAST);
          
          //mike picks and drops off flag
          mike.move();
          mike.pickThing();
          mike.turnLeft();
           mike.move();
            mike.turnRight();
            mike.move();
            mike.turnLeft();
            mike.move(2);
            mike.turnRight();
            mike.move();
            mike.putThing();
            
            //mike goes down the mountain
            mike.move();
            mike.turnRight();
            mike.move();
            mike.turnLeft();
              mike.move();
            mike.turnRight();
            mike.move(2);
            mike.turnLeft();
            
            
            
           
      
            
            
            
            
           
         
          
            
            
            
            
          
      
        
       
    }
}
