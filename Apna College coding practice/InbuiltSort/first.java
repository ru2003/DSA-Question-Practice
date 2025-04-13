package InbuiltSort;
/*
 * import java.util.Arrays
 * Arrays.sort(arr) 
 * O(n logn)
 */
import java.util.Arrays;
public class first {

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) { /*
          ==>   for(int i = 0; i <= arr.length; i++)
        You're going from i = 0 to i <= arr.length,
        which means it will try to access arr[arr.length], but array indices go from 0 to 
        arr.length - 1. That's why it crashes. */
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
    int arr[] = {5,4,3,1,2};
    //insertionSort(arr)
    Arrays.sort(arr , 0,3);

    printArr(arr);/*reason for writing the method ==>only for reusability and cleaner code. 
    if you need to print arrays multiple times in your programme the n its better to put that
    code into a method to avoid repeating yourself.
      */
    }
}
