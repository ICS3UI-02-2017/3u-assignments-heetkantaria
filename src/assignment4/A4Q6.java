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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a scanner
        Scanner input = new Scanner(System.in);

        // input the speed limit line
        System.out.print("Enter the speed limit: ");
        int speedlimit = input.nextInt();

        //enter the recorded speed of the car
        System.out.print("Enter the recorded speed of the car: ");

        //create an integer for the speed
        int speed = input.nextInt();

        //create the equation to find whether the person will be speeding or not
        int answer = speed - speedlimit;

        // If person is not speeding it will say the following
        if (answer <= 0) {
            System.out.print("Congratulations, you are within the speed limit! ");

        } //Add the km/h over the speed limit 
        //km/h over limit 1  to 20
        else if (1 <= answer & answer <= 20) {
        } //km/h over limit 21 to 30
        else if (21 <= answer & answer <= 30) {
        } //km/h over limit 31 or above
        else if (answer >= 31) {

            // If person is speeding it will say the following
            System.out.println("You are speeding and your fine is $500.");
            
        }
    }
}
