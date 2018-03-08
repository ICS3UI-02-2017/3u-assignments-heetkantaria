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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //create a integer named sum that starts at 1 
        int Sum = 1;

        //create a while loop that has the number limit of 100
        while (Sum < 100) {

            //Output the sum of dice line/sentence
            System.out.print("Enter sum of dice: ");
            int number = input.nextInt();

            // calculations to add the previous number to the sum 
            Sum = number + Sum;


            //If the players land on the following top numbers the player will have to go down
            //snake 1
            if (Sum == 54) {
                Sum = 19;
            }
            //snake 2
            if (Sum == 90) {
                Sum = 48;
            }
            //snake 3
            if (Sum == 99) {
                Sum = 77;
            }

            //if the players land on the following top numbers it will go up this time
            //ladder 1
            if (Sum == 9) {
                Sum = 34;
            }
            //ladder 2
            if (Sum == 40) {
                Sum = 64;
            }
            //ladder 3
            if (Sum == 67) {
                Sum = 86;
            }
            
            if (Sum == 101) {
                Sum = Sum - number;
            }

            //add sentence that tells the players what square they are one
            System.out.println("You are now on sqaure " + Sum);

            // Once the player lands on square 100, it outputs that they have won
            if (Sum == 100) {
                System.out.println("You Win! ");
            }

        }


    }
}
