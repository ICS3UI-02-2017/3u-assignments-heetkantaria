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
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        //repeat the translater
        while (true) {
            // get the word to translate
            System.out.println("Enter a word to translate");
            String origWord = input.nextLine();
            //santitize the input
            origWord = origWord.toLowerCase();
            
            //do we start with a vowel
            if(origWord.startsWith("a"); 
                    origWord.startsWith("e");
                 origWord.startsWith("i");
                  origWord.startsWith("o");
                   origWord.startsWith("u");{
            
            //stick ay at the end
            String transWord = origWord + "ay";
            System.out.println(origWord + " in Pig Latin is" +transWord + ".");
          
        }else{
           //Walk down the word looking for the vowel
           int length = origWord.length();
           //use a loop to go through the character
            for (int i = 0; i < length; i++){
                //look at the character position, at position i, is it a vowel?
                if(origWord.charAt(i) == 'a') ||
                    origWord.charAt(i) == 'e' ||
                        origWord.charAt(i) == 'i' ||
                            origWord.charAt(i) == 'o'||
                                origWord.charAt(i) == 'u'){
                //i is the position of the vowel
                String start = origWord.substring(0, i);
                String end = origWord.substring(i);
                
                //compute translated words
                String transWord = end + start + "ay";
                System.out.println(origWord + " in pig latin");
                
                //done looking so stop for loop 
                break;
                }
            }
}
            }
       
    }
