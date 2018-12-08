/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion_assignment;

/**
 *
 * @author billc
 */
public class Prime {

    /**
     * helper method to provide first variables to recursive method (THIS IS WHY IT IS NOT A GOOD USE OF RECURSION)
     * @param prime prime number
     */
    public static void prime(int prime) {
        primeHelp(prime, prime / 2);
    }

    /**
     * Prime determinator
     * @param prime prime
     * @param i test int
     */
    public static void primeHelp(int prime, int i) {
        
        //if recursed down to 1 and still no return, then it is a prime
        if (i == 1) {
            System.out.println("is a prime");
            return;
        } 
        
        //if divisible by test variable then it is not a prime
        if(prime%i==0){
            System.out.println("not a prime");
            return;
        }
        
        //recursive step
        primeHelp(prime, i - 1);

    }

    public static void main(String[] args) {
        prime(10103);
    }
}
