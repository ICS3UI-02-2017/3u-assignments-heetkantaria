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
public class A7Q8 {

    //Create a method to determine whether or not there are odd numbers in the number inputed
    public static boolean allDigitsOdd(int[] digits) {

        //Create a boolean for true or false
        boolean oddNum = true;

        //create a for loop
        //if remander is equal to 0 = even number, if remainder = odd 
        for (int i = 0; i < digits.length; i++) {

            //if number can be divided by 2 then odd is false since it will be an even number
            if (digits[i] % 2 == 0) {
                oddNum = false;
            }
        }
        
        //return the odd number
        return oddNum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //user will be asked to enter in a number
        System.out.print("Please Enter a Number: ");

        //make integer into string 
        //input the temp in the next int 
        String temp = Integer.toString(input.nextInt());

        //a new integer array called numbers
        int[] numbers = new int[temp.length()];

        //for loop created to go through all the numbers
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        //outputs the answer
        if (allDigitsOdd(numbers)) {

            //if numbers are odd
            System.out.println("All the digits in the number you entered are odd. ");

            //if numbers are even
        } else {
            System.out.println("There are even numbers in the number you have entered. ");
        }

    }
}
