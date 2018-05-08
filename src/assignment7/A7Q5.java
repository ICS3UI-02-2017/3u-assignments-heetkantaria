/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author kanth4624
 */
public class A7Q5 {

    //create a method to create the lines of asterisks
    public static void chaotic(int asterisksLine) {

        //for loop created to go through the number of lines
        for (int i = 0; i < asterisksLine; i++) {

            //random number of the asterisks between 1 and 5 will be generated
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;

            //space inserted so all asterisks are not on the same line
            System.out.println(" ");

            //create a for loop to go through the int randNum and replace with asterisks
            for (int n = 0; n < randNum; n++) {

                //print out the asterisks
                System.out.print("* ");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //ask user to enter in the number of lines 
        System.out.print("Enter in the number of lines you would like to generate: ");

        //return chaotic back to the method 
        chaotic(input.nextInt());

    }
}
