/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author kanth4624
 */
public class ArraysExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);

        //make an array to store expenses
        double[] expenses = new double[6];

        //let the user know the costs
        System.out.println("Please enter the six costs for Prom: ");

        //use a for loop for input
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = input.nextDouble();
        }
        //adding all expenses
        double sum = 0;
          for (int i = 0; i < expenses.length; i++) {
            double expense = expenses[i];
            
            //add it to the sum
            sum = sum + expense;
        }
          //output
          System.out.println("Prom costs" + sum);
          
          //take the sum, divide by 35, always round up.
          double ticketsNeeded = Math.ceil(sum/35);
          
          System.out.println("Need to seel" + ticketsNeeded + " tickets");
        }
   
    }  

