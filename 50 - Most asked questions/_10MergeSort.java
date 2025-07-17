//10. How is the merge sort algorithm implemented? 

public class _10MergeSort {


    public static void  mergeSort(int[] arr, int left, int right) {
        if(left < right){
            int mid = left + (right - left) / 2;

            mergeSort(arr, left,mid);
            mergeSort(arr, mid+1,right);

            merge(arr, left,mid,right);
        }
    }

    //function to merge sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right){
        //sizes of the two subarrays to be merged
            int n1 = mid-left+1;
            int n2 = right - mid;
            
            //create temporary arrays
            int[] L = new int[n1];
            int[] R = new int[n2];

            //copy data to temporary arrays
            for(int i=0; i < n1 ; ++i)
                L[i] arr[left + i ];
            for(int j=0; j < n2; ++j)
                R[j] = arr[mid+1+j];

                //Merge the temporary arrays
                int i =0, j=0;//initial indexes of first ans second subarrays
                int k=left;

                while(i<n1 && j<n2) {
                    if(L[i] <= R[j]) {
                        arr[k] = L[i];
                        i++;
                    }else {
                       arr[k] = R[j];
                       j++;
                    }
                    k++;
                }

                //copy remaining elements of L[]
                while(i < n1) {
                    arr[k] = L[i];
                    i++;
                    k++;
                }

                //copy remaining elements of R[]
                while (j < n2){
                    arr[k] = R[j];
                    j++;
                    k++;
                }

     }

     //utility function to print the array
     public static void printArray(int[] arr){
        for (int i : arr)
        System.out.println(i + " ");
        System.out.println();
     }
    public static void main(String[] args){
          
    }
}
