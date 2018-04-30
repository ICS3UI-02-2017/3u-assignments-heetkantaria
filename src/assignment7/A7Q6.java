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
public class A7Q6 {

    //create a Method
    public static int lastDigit(int number) {

        //determine the last integer and return it
        return Math.abs(number % 10);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a Scanner
        Scanner input = new Scanner(System.in);

        //user prints out a number or integer
        System.out.print("Enter in an integer: ");

        //create an integer
        int number = input.nextInt();

        //the last digit is than outputed from the integer inputed
        System.out.println("The last digit is " + lastDigit(number) + ". ");

    }
}
