/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion_assignment;

/**
 *
 * @author 348848128
 */
public class Transformations {
    /**
     * Non tree recursive method to transform integer into an expression of +1 and *2
     * @param num number to start
     * @param des destination number
     * @return the string of transformation
     */
    public static String trans(int num,int des){
        //base case, they are equal
        if(num==des){
            return Integer.toString(num);
        }
        
        //if it is a multiple of two and is still more than destination number after dividing by two
        if((num%2==0)&&(num/2 > des)){
            //add
            return  "(" + trans(num/2,des)  + ")*2" ;
        }else{
            return   trans(num-1,des) +"+1";
        }
        
        
    }
    
    public static void main(String[]args){
        System.out.println(trans(113,11));
    }
}
