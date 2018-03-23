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

        //repeat the translation
        while (true) {

            // create a scanner
            Scanner input = new Scanner(System.in);

            //tell user to enter in a word to translate
            System.out.println("Enter a word to translate to Ubbi Dubbi:");

            //create a string
            String orig = input.nextLine();

            //create  string for translation
            String translate = " " + orig;

            //sanitize the input
            orig = orig.toLowerCase();

            //use a loop to go through the characvters andlook for a vowel
            for (int abcpos = 0; abcpos < translate.length(); abcpos++) {

                //check if any of the words contain the vowels
                //repeated for all vowels
                if (translate.charAt(abcpos) == 'e' || translate.charAt(abcpos) == 'a' || translate.charAt(abcpos) == 'o' || translate.charAt(abcpos) == 'u' || translate.charAt(abcpos) == 'i') {

                    //if two vowels are in a row, it will only put ub infront of the first one
                    //Repeated for all vowels
                    if (!(translate.charAt(abcpos - 2) == 'e' || translate.charAt(abcpos - 2) == 'a' || translate.charAt(abcpos - 2) == 'o' || translate.charAt(abcpos - 2) == 'i' || translate.charAt(abcpos - 2) == 'u')) {

                        //abcpos is the position of vowel
                        String start = translate.substring(0, abcpos);
                        String end = translate.substring(abcpos);

                        //Create the new Ubbi Dubbi translation word with "ub" in front of vowel
                        translate = start + "ub" + end;

                        //checks letter position for next 3 as well
                        abcpos = abcpos + 3;

                        //translated word is outputed or computed to Ubbi Dubbi
                        System.out.println(orig + " is" + translate + " in Ubbi Dubbi.");

                        //done looking so stop the loop
                        break;

                    }
                }
            }

        }

    }
}
