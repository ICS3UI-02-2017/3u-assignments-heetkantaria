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
public class A7Q7 {

    //create a Method to find the first digit of aq number 
    public static int firstDigit(int num) {

        //if number is greater than 9 then it is divided until the first digit left 
        //if first number is positive
        while (num > 9) {
            num /= 10;
        }
        //If the first number is negative
        int negativenum = 0;
        while (num <= -10) {
            num = num / 10;
            negativenum = num * -1;

        }
        return num;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //user is asked to enter in a integer
        System.out.print("Enter in an integer: ");

        //create an integer 
        int number = input.nextInt();

        //output the first digit of the integer that was inputed
        System.out.print("The first digit of the integer is " + firstDigit(number) + ". ");



    }
}