package MergeSort;

public class First {
   public static void printArr(int arr[]) {
    for(int i=0; i<arr.length; i++) { 
        System.out.print(arr[i] + " ");
    }
    System.out.println();
   }

   public static void mergeSort(int arr[] , int si, int ei) {
         //work
         int mid = si + (ei - si)/2; //(si+ei)/2
         mergeSort(arr,si,mid); //left part
         mergeSort(arr, mid+1, ei);//right part
   }
   
   

    public static void main(String[] args) {
        int arr[] = {6 , 3 , 9 , 5 , 2 , 8};
        mergeSort(arr,0,arr.length-1);

    }
    
}
