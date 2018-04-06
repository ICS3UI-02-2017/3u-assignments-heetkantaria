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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //enter in the number of students
        System.out.print("How many students in the class? ");
        int num = input.nextInt();

        //user will enter in marks
        System.out.println("Enter the marks: ");

        //mark an array to store marks
        double[] marks = new double[num];

        //use a for loop for input
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        //adding all the marks
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            double mark = marks[i];

            // add the mark to the sum
            sum = sum + mark;
        }

        //Calculate the average of all the numbers
        //Round to two decimal places
        double average = sum / 3;
        double averageRound = Math.round(average * 100.0) / 100.0;

        //output the average
        System.out.println("The class average is " + averageRound + "% ");

    }
}
