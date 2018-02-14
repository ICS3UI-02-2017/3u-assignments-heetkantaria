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
public class A1Q5 {
    private static String M;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          //Create a new city
        City Kw = new City ();
        
        //Add a robot in kw
        RobotSE maria = new RobotSE (Kw, 0, 1, Direction.WEST);
        
        //Add another robot in kw
        RobotSE karel = new RobotSE (Kw, 3, 3, Direction.EAST);
        
       //set label for robot k
        karel.setLabel("K");
        
        
        //label Mike
        maria.setLabel("M");
        
        //add the groceries
        new Thing(Kw, 0, 0, Direction.EAST);
        new Thing(Kw, 1, 0, Direction.EAST);
        new Thing(Kw, 1, 1, Direction.EAST);
        new Thing(Kw, 1, 2, Direction.EAST);
        new Thing(Kw, 2, 2, Direction.EAST);
        
        //building the wall
         new Wall (Kw, 2, 3, Direction.WEST);
         new Wall (Kw, 2, 3, Direction.NORTH);
         new Wall (Kw, 3, 3, Direction.SOUTH);
         new Wall (Kw, 2, 3, Direction.EAST);
         new Wall (Kw, 3, 3, Direction.EAST);
         
         //Maria picks up items and karel 
         maria.move();
         maria.turnLeft();
         maria.pickThing();
           karel.turnRight(2);
          karel.move();
         maria.move();
          maria.pickThing();
          maria.turnLeft();
          maria.move();
          maria.pickThing();
  
         karel.turnRight();
         karel.move();
         karel.pickThing();
         karel.move();
         karel.pickThing();
         karel.turnLeft();
         
         
         
          
         
         
      
    
        
         
         
         
         
         
         
         
         
                 
        
        
        
        
                
                
        
    }
}
