/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author billc
 */
public class QuickSort<T extends Comparable<? super T>> {
    
   
    
    public static void main(String[] args){
        //creates an arraylist of integers and shuffles it
        ArrayList list = new ArrayList();
        for(int i=0;i<100000;i++){
           list.add(i, i+1);
        }
        Collections.shuffle(list);
        //before sorting
        System.out.println(list.toString());
        Sort sort = new Sort();
        //after quicksort
        sort.quickSort(list,0,list.size());
        System.out.println(list.toString());
    }
}

class Sort<T extends Comparable<? super T>>{
    /**
     * 
     * @param list list of objects
     * @param low low bound
     * @param high right bound
     * @return 
     */
     public int partition(List<T> list,int low, int high){
        //selects a pivot
         T pivot = list.get(low);
         //sets the left bound to the lowest
        int leftWall = low;
        //creates partition by
        //if the object starting from the left is lower than the pivot
        //then swaps the left most with that object
        for(int i=low+1;i<high;i++){
            if(list.get(i).compareTo(pivot)<0){
                T temp = list.get(i);
                list.set(i, list.get(leftWall));
                list.set(leftWall, temp);
                leftWall++;
            }
            
        }
        
        // swaps the left most with the pivot
        T temp2=list.get(leftWall);
            list.set(leftWall, pivot);
            pivot=temp2;
        return leftWall;
        
    }
    
    /**
     * 
     * @param list list of objects
     * @param low low bound
     * @param high high bound
     */
    public void quickSort(List<T> list,int low, int high){
        //recurses with new pivote location for each partition
        if(low<high){
            int pivot_location = partition(list,low,high);
            quickSort(list,low,pivot_location);
            quickSort(list,pivot_location+1,high);
        }
    }
}
