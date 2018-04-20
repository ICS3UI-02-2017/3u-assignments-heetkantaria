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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //enter in the number of students
        System.out.print("Enter the size of the class? ");
        int num = input.nextInt();

        //user will enter in marks
        System.out.println("Enter the students marks: ");

        //create an array to store marks
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
        //Rounded to two decimal places
        double average = sum / num;
        double averageRound = Math.round(average * 100.0) / 100.0;

        //output the average
        System.out.println("The average mark for the class is " + averageRound + "% ");

        //if class average is not greater than 65 it will output concerned
        if (averageRound < 65) {
            System.out.println("You Should be Concerned! Let me Know if you Need Extra Help! ");
        }
        //If it is grater than 70 it will output good job
        if (averageRound > 70) {
            System.out.println("Great Job. Keep Up the Work! ");
        }
        //if it is equal to 65 keep working hard
        if (averageRound == 65) {
            System.out.println("You are below the average, However keep working hard!");
        }
        //if it is equal to 70 good job
        if (averageRound == 70) {
            System.out.println("You are on the average, good job!");
        }

        //Another for loop created through the array
        for (int r = 0; r < marks.length; r++) {

            //For loop created to go through all numbers and then rerange them
            for (int i = r; i < marks.length; i++) {
                if (marks[r] > marks[i]) {
                    double number = marks[i];
                    marks[i] = marks[r];
                    marks[r] = number;

                }
            }
        }
        // Output the lowest mark
        System.out.println("The lowest mark is " + marks[0] + "%.");

        //Output the highest mark
        System.out.println("The hightest mark is " + marks[marks.length - 1] + "%.");


    }
