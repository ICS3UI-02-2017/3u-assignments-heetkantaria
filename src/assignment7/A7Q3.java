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
public class A7Q3 {

//create a method for the factors of a number entered
    public static double factors(int num) {

        //the factors of the number entered are inputed
        System.out.println("The factors of " + num + " are: ");

        //for loop created to go through all numbers and look for the factors
        for (int fact = 1; fact <= num; fact++) {
            double answer = num / fact;

            //No remainders - print out all the factors
            if (num % fact == 0) {

                System.out.println((int) answer + ", ");
            }
        }

        return num;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //user will be asked to enter in a number
        System.out.print("Enter a number you would like to Factor: ");

        //Create an integer
        int number = (int) input.nextDouble();

        //Finds out all the factors of number inputed by the user
        factors(number);
    }
}
