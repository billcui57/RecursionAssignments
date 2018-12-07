/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion_assignment;

import java.util.Scanner;

/**
 *
 * @author 348848128
 */
public class ModFib {
    /**
     * Recursive method to find the i'th term of modified fibonacci sequence
     * @param i the term #
     * @return the i'th term
     */
    public static int modFibonacci(int i){
        //three base cases
        if(i==0){
            return 3;
        }else if(i==1){
            return 5;
        }else if(i==2){
            return 8;
        }
        //recursion statement
        return modFibonacci(i - 1) + modFibonacci(i -2) + modFibonacci(i-3) ;
    }
    
    public static void main(String[]args){
        //user input for how deep
        Scanner kbReader = new Scanner(System.in); 
        System.out.print("Generate which term number? "); 
        int k = kbReader.nextInt( ); 
         
        System.out.println("Term #" + k + " is " + ModFib.modFibonacci(k));    
    }
}
