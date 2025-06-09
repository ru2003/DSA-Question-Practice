package Sortings;

public class _3InsertionSort {
    public static void insertionSort(int[] arr) {
         int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];   // The element we want to insert
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than current
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];  // Shift right
                j--;
            }

            arr[j + 1] = current; // Insert at the right position
        }
        

    }

    

    public static void main(String[] args){
      int[] arr = {9,4,5,3,2};

      System.out.println("Original Array: ");
      for(int num:arr) {
        System.out.println(num+ " ");
      }
      insertionSort(arr);

      System.out.println("\n\n Sorted array using Insertion Sort:");
      for(int num:arr) {
        System.out.println(num+ " ");
      }
    }
}   


