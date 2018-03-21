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
        // create a scanner
        Scanner input = new Scanner(System.in);

        //Tell the user to input a word that they want to translate
        System.out.println("Enter a word to translate");

        String orig = input.nextLine();
       
        //santitize the input
        orig = orig.toLowerCase();

        //If the word starts with a vowel
        if (orig.startsWith("a") || orig.startsWith("e") || orig.startsWith("i") || orig.startsWith("o") || orig.startsWith("u")) {

            //put "ub" in the beginning if word starts with vowel
            String translate = "ub" + orig;
            System.out.println(translate + " in Ubbi Dubbi is " + orig + ".");

            //Walk down the word looking for the vowel
            int length = orig.length();

            }


        }


    }

