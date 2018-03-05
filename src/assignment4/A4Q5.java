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
        //use a scanner to read info
        Scanner input = new Scanner(System.in);

        //create something to answer
        System.out.print(" Please enter your name: ");

        //make a string to store a name
        String name;
        
         // input name
        name = input.nextLine();
     
        //ask question 1
        System.out.print("What was the first test out of?: ");
        double Test1 = input.nextDouble();
        
        // ask the mark 
        System.out.print("what mark did you get?: ");
        double Mark1 = input.nextDouble();

        //ask question 2 
        System.out.print("What was the second test out of?: ");
        double Test2 = input.nextDouble();
        // ask the mark 
        System.out.print("what mark did you get?: ");
        double Mark2 = input.nextDouble();

        //ask question 3 
        System.out.print("What was the third test out of?: ");
        double Test3 = input.nextDouble();
        // ask the mark 
        System.out.print("what mark did you get?: ");
        double Mark3 = input.nextDouble();

        //ask question 4 
        System.out.print("What was the fourth test out of?: ");
        double Test4 = input.nextDouble();
        // ask the mark 
        System.out.print("what mark did you get?: ");
        double Mark4 = input.nextDouble();

        //ask question 5 
        System.out.print("What was the fifth test out of?: ");
        double Test5 = input.nextDouble();
        // ask the mark 
        System.out.print("what mark did you get?: ");
        double Mark5 = input.nextDouble();

        // each score gets totaled by percentage  
        double score1 = (Mark1 / Test1) * 100;
        double score2 = (Mark2 / Test2) * 100;
        double score3 = (Mark3 / Test3) * 100;
        double score4 = (Mark4 / Test4) * 100;
        double score5 = (Mark5 / Test5) * 100;

       




    }
}
