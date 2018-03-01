/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author kanth4624
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //create a scanner
        Scanner input = new Scanner(System.in);
        
        //create a string
        String number;

        // system asks the to enter the measurement in iches that you need to convert
        System.out.println ("Please enter the measurement in inches you wish to convert:");
        
        // variable for inch 
        double inch = input.nextDouble();

        //convert inches to cm
        double answer = (inch * 2.54);
        
        //multiply number of inches by 2.54 
        System.out.println(inch + " inches is the same as " + answer + " cm ");

    }

}
       
   
          
        
    

