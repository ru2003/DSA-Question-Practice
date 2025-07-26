/*2. Count Occurrences of an Element
➤ Count how many times a number appears in an array. */

public class _2CountOccurence {

    public static int count(int[] arr , int target){
         int count = 0;
         for(int num : arr){
            if (num == target ){
                count++;
            }
         }
         return count;
    }
    public static void main(String []args){
        int[] a ={1,2,3,4,4,2,5,};
        int key = 4;

    }
    
}
