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
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //print a line of text
        System.out.println("Hello World");
        System.out.println("Another Line!");

        //shortcut is sout than click tab

        //print a blank line
        System.out.println();
        //printing on the same line
        System.out.print("I Like ");
        System.out.print(" Cake!");

        //printing special characters  
        //quotation marks  use \"
        System.out.println(" \"I'm inside quotation marks\ ");
        
        //slash
         System.out.println(" A slash \\ ");

        // a tab
        System.out.println(" pop\tpizza\tfries ");

        //a new line \n
        System.out.println(" One line \nSecond line ");

        //make a integer
        int number = 10;
        System.out.println(number);
        System.out.println(" number = " + number);
        System.out.println(" number = " + number ". Yay);"
        
       
        
        
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Please enter your name ");
        //make a string to store a name
        String name = input.nextLine();
        
        //say hello
        System.out.println(" hello " + name);
        
        //ask what year they were born
        System.out.println(" what  year were you born? ");
        
        //make a variable to store year
        
        int birthYear = input.nextInt();
        int age = 2018 - birthYear;
        
        System.out.println("You are " + age + "  years old ");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        






    }
}
