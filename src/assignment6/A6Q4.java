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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a scanner 
        Scanner input = new Scanner(System.in);

        //create an array to store 10 marks
        double[] marks = new double[10];

        //Ask the user to insert 10 marks 
        System.out.println("Enter in 10 marks: ");

        //Create a for loop
        for (int i = 0; i < 10; i++) {
            marks[i] = input.nextDouble();
        }

        //create another for loop
        for (int r = 0; r < 10; r++) {

            //Adds 10 numbers and rearranges them to put in order
            for (int repeat = 0; repeat < 10; repeat++) {
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

        //Prints out the numbers in one line 
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);


        }

    }
}
