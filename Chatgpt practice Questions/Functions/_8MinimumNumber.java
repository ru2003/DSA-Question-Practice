/*8.Create a reusable function find_minimum(arr) that returns the minimum element in an array. */

import java.lang.reflect.Array;

public class _8MinimumNumber {
    
    public static int minimum (int[] arr) {
       if(arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array should not be null");
       }
       int min = arr[0];

       for(int i=0; i<= arr.length-1;i++){
        if(arr[i] < min) {
            min = arr[i];
        }

       }
       return min;
    }

    public static void main(String[] args) {
      int[] array = {1,2,3,4,8,6,7};
      System.out.println("The minimum eelement of the array is: " + minimum(array));
    }
}
