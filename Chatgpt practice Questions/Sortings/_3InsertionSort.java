package Sortings;

public class _3InsertionSort {
    int n = arr.length;

    for (int i=1;i<n;i++){
        int current = arr[i];
        int j=i-1;

        //shift elements of arr[0..i-1] that are greater than current

        while(j >= 0 && arr[j] > current) {
            arr[j+1] = arr[j];
            j--;
        }
        


    }
    

    public static void insertionSort(int[] arr){

    }
    
}
