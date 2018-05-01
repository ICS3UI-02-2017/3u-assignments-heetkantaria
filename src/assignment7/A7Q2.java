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
public class A7Q2 {

    public static int examGrade(int mark) {

        //The marks entered are checked and than are put into letter form
        //if the mark is under 50% the grade is F
        if (mark < 50) {
            System.out.println("Since your mark is " + mark + '%' + " you are at an F" + ". ");
        }

        //if the mark is under or equal to 59 the grade is D
        if (mark >= 50 && mark < 59) {
            System.out.println("Since your mark is " + mark + '%' + " you are at an D" + ". ");
        }

        //if the mark is under or equal to 69 the grade is C
        if (mark >= 60 && mark < 69) {
            System.out.println("Since your mark is " + mark + '%' + " you are at an C" + ". ");
        }

        //if the mark is under or equal to 79 the grade is B
        if (mark >= 70 && mark < 79) {
            System.out.println("Since your mark is " + mark + '%' + " you are at an B" + ". ");
        }

        //if the mark is greater or equal to 80 the grade is A 
        if (mark >= 80) {
            System.out.println("Since your mark is " + mark + '%' + " you are at an A" + ". ");

        }
        //return the mark
        return mark;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //user is asked to enter in a integer
        System.out.print("Enter in a mark: ");

        //Create an integer
        int grade = input.nextInt();

        //To output the percentage into letter grade
        examGrade(grade);



    }
}
