/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author kanth4624
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //repeat the translator
        while (true) {

            // create a scanner
            Scanner input = new Scanner(System.in);

            //tell user to enter in a word to translate
            System.out.println("Enter a word you would like to translate into Ubbi Dubbi: ");

            // make a string for the original word
            String orig = input.nextLine();

            //create a string for the translated word
            String translate = " " + orig;

            //sanitize the input to all letters lowercase
            orig = orig.toLowerCase();

            // check to see if word starts with vowel
            if (orig.startsWith("a") || orig.startsWith("e") || orig.startsWith("i") || orig.startsWith("o") || orig.startsWith("u")) {

                //stick ub at the front of the word
                String translate2 = "ub" + orig;
                System.out.println(orig + " in Ubbi Dubbi is " + translate2);

            } else {
                //count how many letters are in the word 
                int length = translate.length();

                // use a for loop to go through the characters and look for a vowel
                for (int pos = 0; pos < length; pos++) {

                    // //check if any of the words contain the vowels
                    //repeated for all vowels
                    if (translate.charAt(pos) == 'e' || translate.charAt(pos) == 'a' || translate.charAt(pos) == 'i' || translate.charAt(pos) == 'u' || translate.charAt(pos) == 'o') {

                        //if two vowels are in a row, it will only put ub infront of the first one
                        //Repeated for all vowels 
                        if (!(translate.charAt(pos - 2) == 'e' || translate.charAt(pos - 2) == 'a' || translate.charAt(pos - 2) == 'i' || translate.charAt(pos - 2) == 'u' || translate.charAt(pos - 2) == 'o')) {

                            // adds "ub" infront of the vowel 
                            String start = translate.substring(0, pos);
                            String end = translate.substring(pos);

                            //Create the new Ubbi Dubbi translation word with "ub" in front of vowel
                            translate = start + "ub" + end;

                            // update the length of the translated word
                            length = translate.length();

                            // Checks letter position of next 3 aswell
                            pos = pos + 3;

                        }
                    }
                }

                // Output the translated word 
                System.out.println(orig + " In ubbi dubbi is " + translate + ".");

                //done looking so stop the loop
                break;
            }
        }
    }
}
