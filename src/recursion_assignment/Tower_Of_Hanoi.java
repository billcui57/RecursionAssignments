/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion_assignment;

import java.util.ArrayList;

/**
 *
 * @author 348848128
 */
public class Tower_Of_Hanoi {

    /**
     * Recursive method for solving the tower of Hanoi
     * @param n the level
     * @param from_rod rod to move from
     * @param to_rod rod to move to
     * @param aux_rod auxillary rod
     */
    public static void  towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        //base case, moves last level, the top most, to the right most rod
        if (n == 1) {
            System.out.printf("\n Move disk 1 from rod %c to rod %c", from_rod, to_rod);
            return;
        }
        
        //Recursively solve problem of moving disk n-1,n-2,n-3,..... from peg A to peg B
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.printf("\n Move disk %d from rod %c to rod %c", n, from_rod, to_rod);
         //Recursively solve problem of moving disk n-1,n-2,n-3,..... from peg B to peg C
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        towerOfHanoi(4, 'A', 'C', 'B');  // A, B and C are names of rods 
  
    }

}
