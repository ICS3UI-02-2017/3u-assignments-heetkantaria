/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kanth4624
 */
public class A7Q4 {

    //Create a method
    public static double compoundInterest(double intprincipal, double interest, int numOfyears) {

        //Calculation to find the balance
        double balance = intprincipal * Math.pow(1 + interest, numOfyears);

        //return the balance
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);

        //user is asked to enter in the principal amount 
        System.out.print("Please enter the principal amount: ");

        //create a double to represent initial principal
        double intialAmount = input.nextDouble();

        //User now will be asked to enter in the interest rate
        System.out.print("Now, please enter in the interest rate: ");

        //create a double to represent the interest rate
        double interestRate = input.nextDouble() / 100;

        //Lastly, user will be asked to enter in the number of years
        System.out.print("Lastly, please enter in the number of years: ");

        //Create an integer to reprsent the number of years
        int numberyears = input.nextInt();

        //output the final compound interest calculated
        System.out.println("Your compound interest is:" + " $" + (compoundInterest(intialAmount, interestRate, numberyears)));

    }
}
