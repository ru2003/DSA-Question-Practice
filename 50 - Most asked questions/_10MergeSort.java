//10. How is the merge sort algorithm implemented? 

public class _10MergeSort {


    public static void  mergeSort(int[] arr, int left, int right) {
        if(left < right){
            int mid = left + (right - left) / 2;

            mergeSort(arr, left,mid);
            mergeSort(arr, mid+1,right);
            
        }
    }
    public static void main(String[] args){

    }
}
