/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seaches;


/**
 *
 * @author Ryan.Wanner
 */
public class Seaches {
    public static int binary(int[] arr, int target, int first, int last) {
      
        int  mid = (last + first) / 2;
        if (target == arr[mid]) {
            return mid;
        }else if(mid==first){
            return -1;
        }else {
            if (target < arr[mid]) {
                return binary(arr, target, first, mid);
            } else {
                return binary(arr, target, mid, last);
            }
        }
        
    }
    public static int linear(int [] arr, int target, int start){
        if(start==arr.length){
            return Integer.MIN_VALUE;
        }
        if(target==arr[start]){
            return start;
        }else{
            return linear(arr, target, start+1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr= new int [100];
       for(int i=0; i<100; i++){
           arr[i]=i;
       }
       
      System.out.println(binary(arr,9,0,arr.length-1));
      System.out.println(linear(arr,2,0));
    }
    
    
}
