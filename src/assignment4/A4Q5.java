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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //create a string
        String name;

        //print the first line
        System.out.print("Please enter your name: ");
        name = input.nextLine();

        // Add the questions and find average for the first one
        System.out.print("What was the first test out of?: ");
        double test = input.nextDouble();

        System.out.print("What mark did you get?: ");
        double one = input.nextDouble();
        double ones = (double) (one / test * 100);

        // Add the questions and find average for the second one 
        System.out.print("What was the second test out of?: ");
        double test2 = input.nextDouble();

        System.out.print("What mark did you get?: ");
        double two = input.nextDouble();
        double twos = (double) (two / test2 * 100);

        // Add the questions and find average for the third one
        System.out.print("What was the third test out of?: ");
        double test3 = input.nextDouble();

        System.out.print("What mark did you get?: ");
        double three = input.nextDouble();
        double threes = (double) (three / test3 * 100);

        // Add the questions and find average for the fourth one 
        System.out.print("What was the fourth test out of?: ");
        double test4 = input.nextDouble();

        System.out.print("What mark did you get?: ");
        double four = input.nextDouble();
        double fours = (double) (four / test4 * 100);

        // Add the questions and find average for the fifth one
        System.out.print("What was the fifth test out of?: ");
        double test5 = input.nextDouble();

        System.out.print("What mark did you get?: ");
        double five = input.nextDouble();
        double fives = (double) (five / test5 * 100);

        // Output all the averages for the tests so it is printed in the lines in order
        System.out.println("Test scores for " + name + "");
        System.out.println("Test 1: " + ones + "%");
        System.out.println("Test 2: " + twos + "%");
        System.out.println("Test 3: " + threes + "%");
        System.out.println("Test 4: " + fours + "%");
        System.out.println("Test 5: " + fives + "%");

        // Average of all calculated to find the final total average of all marks
        double average = (double) ((ones + twos + threes + fours + fives) / 5);

        // Final average line written 
        System.out.println("Average: " + average + "%.");



    }
}
