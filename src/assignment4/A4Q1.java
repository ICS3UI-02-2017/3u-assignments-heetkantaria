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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //use a scanner to read info
        Scanner input = new Scanner(System.in);

        //create something to answer
        System.out.println(" Please enter your name ");

        //make a string to store a name
        String name = input.nextLine();

        //say hello 
        System.out.print(" hello " + name);

        //ask how are they and on same line as one above
        System.out.print(". How are you today? ");
        
       
    }
}
