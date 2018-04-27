/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author kanth4624
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a double integer
        //p = prime
        double[] p = new double[1000];

        //Create a output sentence for the prime numbers
        System.out.println("The prime numbers are:");

        //create a for loop
        for (int i = 0; i < 1000; i++) {
            p[i] = i;
        }

        //if the loop is true the multiples are found 
        for (int m1 = 2; m1 < 1000; m1++) {
            for (int m2 = 2; m2 < 1000; m2++) {
                int m3 = m1 * m2;

                //All other numbers are elimated from the array until 1000
                if (m3 >= 1000) {
                    break;
                }
                //sets the value to 0
                p[m3] = 0;
            }
        }

        //All the prime numbers are outputted until 1001 
        for (int multiple = 0; multiple < p.length; multiple++) {
            if ((p[multiple] != 1) && (p[multiple] != 0)) {
                System.out.println(p[multiple]);


            }

        }

        System.out.println("These are the prime numbers between 1-1000. ");


    
}