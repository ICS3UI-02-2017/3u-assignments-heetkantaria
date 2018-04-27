/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author kanth4624
 */
public class MethodsExample {
    
    //The hello world method to say hello
    public static void helloWorld(){
        System.out.println("Hello World");
    }
    
    //say hello to a user
    public static void sayHello(String name){
        System.out.println("Hello" + name);
    }
    
    //calculates tge positive root part of quadratic formula
    public static double  posQuadFormula(double a, double b, double c){
        double discrim = b*b - 4*a*c;
        double root = (-b + Math.sqrt(discrim))/(2*a);
        return root;
    }
      public static double[] QuadFormula(double a, double b, double c){
        double [] roots = new double[2];
          double discrim = b*b - 4*a*c;
        roots[0] = (-b + Math.sqrt(discrim))/(2*a);
        roots[1] = (-b - Math.sqrt(discrim))/(2*a);
        return roots;
            
            
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args){
       
        //call the helloWorld method
        helloWorld();
        
        sayHello(" Steve");
        
        //calculate the +ve of 3x^2+7x+1.5
       double pRoot = posQuadFormula(1, -5, -50);
        System.out.println("The positive root is " + pRoot);
        
        double[] roots = QuadFormula(1,-5,-50);
         System.out.println("The root are " + roots[1]);
  
    }
}
