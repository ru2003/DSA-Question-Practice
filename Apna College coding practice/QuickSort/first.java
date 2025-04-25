package QuickSort;
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

public class first {

    public static void printArr(int arr[]) {
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        //last element
        int pIdx = partition(arr, si,ei);
        quickSort(arr, si,pIdx-1);
        quickSort(arr, pIdx+1, ei);


    }
    public static void partition(int arr[], int si, int ei) {

    }


    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
    
    }
      
}
