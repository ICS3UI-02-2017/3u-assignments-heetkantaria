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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a scanner
        Scanner input = new Scanner(System.in);

        // Ask the user how many students are in the class to determine the array num
        System.out.println("How many student marks are there in the class?");

        //create a variable to have any number
        int num = input.nextInt();

        //Change the 10 to any number(what we did in assignment 4)
        //create an array to store marks
        double[] marks = new double[num];

        //Ask the user to insert the marks 
        System.out.println("Enter in the marks: ");

        //Create a for loop
        for (int i = 0; i < num; i++) {
            marks[i] = input.nextDouble();
        }

        //create another for loop
        for (int r = 0; r < num; r++) {

            //Adds all numbers and rearranges them to put in order
            for (int repeat = 0; repeat < num; repeat++) {
                double spotx = marks[r];
                double spoty = marks[repeat];

                //Repeats to rearrange the numbers
                if (marks[r] < marks[repeat]) {
                    marks[r] = spoty;
                    marks[repeat] = spotx;
                }
            }
        }

        //marks are printed out from lowest to highest
        System.out.println("The marks from lowest to highest are: ");

        //Prints out the numbers 
        for (int i = 0; i < num; i++) {
            System.out.println(marks[i]);

        }

        //To find the median it is the lowest and highest mark divided by 2 
        if (marks.length % 2 == 0) {

            // Calculates the median with even amount of marks for example, 4 marks, 6 marks
            //If even both middle numbers are added - 4 marks (1,2,3,4) 3 and 2 are added than divided by 2
            int median = marks.length / 2;
            int median2 = median - 1;
            double medians = (marks[median] + marks[median2]) / 2;

            // Print out the median for the even numbers
            System.out.println("The median of the marks are: " + medians + ". ");

            //Else if statement for the odd group of numbers for example, 5 marks, 7 marks
        } else {

            // Calculate the median with odd amount of numbers
            int median = marks.length / 2;
            double medians = marks[median];

            //Print out the medium for the odd number
            System.out.println("The median of the marks is " + medians);
        }
    }
