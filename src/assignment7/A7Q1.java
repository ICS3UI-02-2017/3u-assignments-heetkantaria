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
public class A7Q1 {

    //create a method for circle area
    public static double circleArea(double radius) {

        //calculate the area of the circle - (radius*pie*2)
        double cArea = Math.PI * Math.pow(radius, 2);
        return cArea;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a scanner to ask a question
        Scanner input = new Scanner(System.in);

        //Ask a question
        System.out.print("Enter the radius: ");

        //store the radius as a double
        double numbers = input.nextDouble();

        //output the area of circle
        System.out.println("The area of the circle is: " + (circleArea(numbers)));
    }
}
