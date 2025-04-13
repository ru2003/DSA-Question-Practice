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
    Arrays.sort(arr);
    printArr(arr);
    }
}
