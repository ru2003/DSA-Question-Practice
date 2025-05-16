package Arrays;

import java.util.HashMap;

/* logic ==>
 * first count how many times each number appears using hashmap.
 * then go thorugh the arraya gain and return the first number that appears only once
 */
public class _6FirstNonRepeating {
    
    public static int firstNonRepeating(int[] arr) {

        HashMap<Integer , Integer > countMap = new HashMap<>();
        /* HashMap<Integer, Integer>	You're declaring a HashMap where both keys and values are integers. For example: 4 → 2 means 4 appears 2 times.
           countMap	                  This is the name of your HashMap variable. You can use any name, but countMap is a good choice because it holds counts.
         * new HashMap<>()	          This creates a new empty HashMap object in memory so you can start using it.


         */
         //Count the occurence of each element
         for(int num : arr){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
         }

        // find first elemnt with count 1
        for(int num : arr ){
            if(countMap.get(num) == 1) {
            return num;
            }
        }
        //if no non-repeating element is found
        return -1;

    }
    public static void main(String[] args) {

        int[] array = {4,5,1,2,0,4,5,2};
        int result = firstNonRepeating(array);
        if(result != -1){
            System.out.println("First non-reapeating elemnt is: " + result);
        }
        else {
            System.out.println("No non-repeating element found. ");
        }
    }
}
