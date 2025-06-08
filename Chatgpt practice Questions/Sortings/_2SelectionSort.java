package Sortings;
/*Selection Sort is a simple sorting algorithm that works by:

Repeatedly finding the minimum element from the unsorted part of the array,

Swapping it with the first unsorted element.


 * 
 */
public class _2SelectionSort {
    
    public static void selectionsort(int[] arr) {
        int n = arr.length;
        //outer loop to move boundary of unserted array
        for( int i=0; i<n-1; ){
            int minIndex=i;

            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap the found minimum element with the first element
            int temp = arr[minIndex];

            arr[minIndex ] = arr[i] ;
            arr[i ] = temp;




        }
    }


    
}
