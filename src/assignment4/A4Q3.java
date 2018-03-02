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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        //create a string
        String number;

        // system tells to enter in 4 numbers
        System.out.println(" Please enter in 4 numbers on seperate lines: ");
        
        // input number in next line
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();
        double four = input.nextDouble();

        // put all numbers onto one line 
        System.out.println(" Your numbers were " + one + ", " + two + ", " + three + ", and " + four + "");
    }

}
    

