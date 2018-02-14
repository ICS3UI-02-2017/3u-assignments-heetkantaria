/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author kanth4624
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          //Create a new city
        City Kw = new City ();
        
        //Add a robot in kw
        RobotSE mike = new RobotSE (Kw, 0, 0, Direction.SOUTH);
        
         //Add another robot in kw
        RobotSE mike2 = new RobotSE (Kw, 0, 1, Direction.SOUTH);
        
        //Create the walls
        new Wall(Kw, 0, 1, Direction.WEST);
         new Wall(Kw, 1, 1 , Direction.WEST);
          new Wall(Kw, 1, 1, Direction.SOUTH);
          
          //Move mike and mike2
          
          mike2.move();
          mike.move(2);
          mike2.turnLeft();
          mike2.move();
          mike2.turnRight();
           mike2.move();
           mike.turnLeft();
           mike2.turnRight();
           mike.move(); mike2.move();
          
           
          
         
        
        
        
    }
}
