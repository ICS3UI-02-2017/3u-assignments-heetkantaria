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

    //Create an method to determine whether or not there are odd numbers in a number
    public static boolean allDigitsOdd(int[] digits) {

        //Create a boolean for true or false
        boolean oddNum = true;

        //for loop created, to go through the array and divide each number by 2
        //if remander is equal to 0 then it is even number if there is a remainder then its a odd 
        for (int i = 0; i < digits.length; i++) {

            //if number is divisiable by 2 then set odd as false 
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

        //Convert the integer into a string then store it as temp
        //input the temp in the next int 
        String temp = Integer.toString(input.nextInt());

        //a new integer array called numbers
        int[] numbers = new int[temp.length()];

        //for loop created to go through all the numbers and then stores them into string temp 
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        //if statement(loop) created to output the answer 
        if (allDigitsOdd(numbers)) {

            //if the numbers are all odd then it is outputted 
            System.out.println("All the digits in the number you entered are odd. ");

            //else if the number entered has an number which is even
        } else {
            System.out.println("There are even numbers in the number entered. ");
        }

    }
}
