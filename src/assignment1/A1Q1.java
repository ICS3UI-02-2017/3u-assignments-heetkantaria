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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        //Create a new city
        City Kw = new City ();
        
        //Add a robot in kw
        RobotSE mike = new RobotSE (Kw, 0, 2, Direction.WEST);
        
        //Create wall
        new Wall(Kw, 1, 1, Direction.NORTH);
         new Wall(Kw,1, 2, Direction.NORTH);
          new Wall(Kw, 2, 2, Direction.EAST);
          new Wall(Kw, 1, 2, Direction.EAST);
        new Wall (Kw, 2, 2, Direction.SOUTH);
       new Wall (Kw, 2, 1, Direction.SOUTH);
       new Wall (Kw, 1, 1, Direction.WEST);
        new Wall (Kw, 2, 1, Direction.WEST);
      
        //move mike straight
        mike.move(2);
        
        //mike turns left
        mike.turnLeft();
        
          //move mike straight
        mike.move(3);
        
         //mike turns left
        mike.turnLeft();
        
          //move mike straight
        mike.move(3);
        
         //mike turns left
        mike.turnLeft();
        
        //move mike straight
        mike.move(3);
        
         //mike turns left
        mike.turnLeft();
        
        //move mike straight
        mike.move();
        
        
        
        
        
        
        
      
        
        
        
        
              
        

                   
        
        
    }
}
