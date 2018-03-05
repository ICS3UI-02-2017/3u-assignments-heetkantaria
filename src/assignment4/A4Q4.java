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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //use a scanner to read info
        Scanner input = new Scanner(System.in);

        //make a string to store a name
        String name;


        //write the first question
        System.out.print(" How much does the food for prom cost? : ");
        int one = input.nextInt();

        //write the second question
        System.out.print(" How much does the DJ cost? : ");
        int two = input.nextInt();

        //write the third question
        System.out.print(" How much does it cost to rent the hall? : ");
        int three = input.nextInt();

        //write the fourth question
        System.out.print(" How much does decorations cost? : ");
        int four = input.nextInt();

        //write the fifth question
        System.out.print(" How much does it cost for staff? : ");
        int five = input.nextInt();

        //write the sixth question
        System.out.print("How much for miscellaneous costs? : ");
        int six = input.nextInt();

        //create a variable for cost
        int cost = (one + two + three + four + five + six);

        // divide by the 35(ticket price)
        int answer = (cost / 35);

        //output total cost and write the writing for the answer
        System.out.println(" The cost is " + cost + ". You will need to sell " + answer + " tickets to break even. ");



    }
}
