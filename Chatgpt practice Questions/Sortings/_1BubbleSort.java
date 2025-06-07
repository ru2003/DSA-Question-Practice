package Sortings;

public class _1BubbleSort {
    public static void bubblesort(int[] arr){
        int n = arr.length;
        boolean swapped;

        //outer loop for passes
        for(int i=0; i<n-1;i++){
            swapped = false;

            //inner loop for pairwise comparison
            for(int j=0; j<n-i-1;j++){
                //swap if elements are in wrong order
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr[j];

                    swapped = true;
                    
                }
            }
            //if noo two elements were swapped in inner loop
            if(!swapped) {
                break;

            }
    }
}
    public static void main(String[] args) {

        int arr[] = {34,56,2,32,78,1};
        System.out.println("Original array: ");
        for (int num:arr) {
            System.out.println(num+ " ") ;
        }
        bubblesort(arr);
        System.out.println("\n Sorted array  using bubble sort: ");
        for(int num:arr) {
            System.out.println(num + " ");
        }


            }
        }
         
        
    

