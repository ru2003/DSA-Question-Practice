
/*average O(nlogn)
 * worst O(n^2)
 * space(1)
 */
//fast sorting chaiye but hamare pass dene ke liye space nhi hai.
//pivot and partition
/*
 * pivot and partition 
 * 1)choose pivot --> last element 
 */
package QuickSort;

public class first {

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main QuickSort function
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // Sort left subarray
        quickSort(arr, pIdx + 1, ei); // Sort right subarray
    }

    // Partition function using Lomuto partition scheme
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[ei] (pivot)
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i; // Return the partitioning index
    }

    // Main method to test the QuickSort algorithm
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
