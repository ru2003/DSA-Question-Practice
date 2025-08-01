/*Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
*/
/* 2 - approches 
 * 1.brute force -> using 2 loops
 * 2.hashmap approch
 * 
 * --->static method belongs to the class .
 * --->non- static methods belong to the object(instance) of the class
 * 
 * the main method is static which means it runs without creating an object of the class.so inside main ,if you try to call a non static method
 * java doesnt know which object the method should run on - because need an object.
 * 
 * 1.make the method static (so it belongs to the class)
 * 2.create an object(then call the method)
 */


/* -----Brute force approch ------
public class ContainsDuplicates{
    public boolean hasDuplicates(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,5,6,6};
        ContainsDuplicates cd = new ContainsDuplicates();
        boolean result = cd.hasDuplicates(arr1);
        System.out.println("Contains Duplicates?: " + result);
         
         
          
    }
}
    */

//optimised version 

import java.util.HashSet;

public class ContainsDuplicates{

    public boolean hasDuplicates(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args){
          
        int[] arr = {1,2,3,4,5,5,6};
        
        
    }
}

