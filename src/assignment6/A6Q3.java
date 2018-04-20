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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);

        //tell user to enter in two integers
        System.out.println("Enter two integers: ");

        //Create an array to store both the numbers
        int A[] = new int[2];

        A[0] = input.nextInt();
        A[1] = input.nextInt();

        //If the first number is greater it will swap it with the second
        if (A[0] > A[1]) {
           int swap = A[0];
            A[0] = A[1];
            A[1] = swap;

        }

        //output the numbers in asecending order
        System.out.println("The integers in ascending order are:" + A[0] + ", " + A[1]);

    }
}
