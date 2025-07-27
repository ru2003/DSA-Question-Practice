/*
 * 4. Binary Search (Iterative and Recursive)
➤ Given a sorted array and a key, return index or -1.
 */
public class _4BinarySearch {
    public static int binarysearch(int[] arr, int key){
        int left = 0, right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                left = mid+1;

            }else{
                right = mid -1;   
            }
        }
        return -1;
        
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};
        int key = 40;

        int index = binarysearch(arr, key);
    }
}
