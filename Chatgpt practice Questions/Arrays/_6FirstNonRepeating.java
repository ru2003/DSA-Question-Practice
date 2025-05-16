package Arrays;

import java.util.HashMap;

/* logic ==>
 * first count how many times each number appears using hashmap.
 * then go thorugh the arraya gain and return the first number that appears only once
 */
public class _6FirstNonRepeating {
    
    public static int firstNonRepeating(int[] arr) {

        HashMap<Integer , Integer > countMap = new HashMap<>();

        //Count the occurences of each element 
        for(int num : arr ){
            if(countMap.get(num) == 1) {
            return num;
            }
        }
        //if no non-repeating element is found
        return -1;

    }
    public static void main(String[] args) {

    }
}
