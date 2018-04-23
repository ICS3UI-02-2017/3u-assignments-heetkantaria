/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author kanth4624
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //tell user to enter in number of peoples heights
        System.out.println("Enter the number of people whose heights will be read: ");
        int num = input.nextInt();

        //user will enter in the heights 
        System.out.println("Enter in the heights: ");

        //create an array to store heights
        double[] height = new double[num];

        //use a for loop for input
        for (int i = 0; i < height.length; i++) {
            height[i] = input.nextDouble();
        }

        //adding all the heights
        double sum = 0;
        for (int i = 0; i < height.length; i++) {

            // add the height to the sum
            sum = sum + height[i];
        }

        //Calculate the average of all the numbers
        //Round to two decimal places
        double average = sum / num;
        double averageRound = Math.round(average * 100.0) / 100.0;

        //output the average
        System.out.println("The height average is " + averageRound + "% ");

        //Go back to heights
        for (int i = 0; i < height.length; i++) {
            if (average < height[i]) {

                //print out the heights that are above the average
                System.out.println("The heights above the average are: " + height[i] + "ft. ");

            }
        }
