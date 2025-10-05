/*7.Reverse an array. */

import java.util.*;
public class Q7ReverseAnArray {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of element in the array: ");
        int n = sc.nextInt();
         System.out.println("enter the element to add in the array: ");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        //reverse an array:
        int start = 0; int end = n-1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;


        }
        //print the reversed the array:
        System.out.println("Print the reversed array: ");
        for(int num:array){
            System.out.print(num  + " ");
        }


    }
}
