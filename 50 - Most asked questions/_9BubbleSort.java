//9. Write a code for bubble sort
public class _9BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        //outer loop for passes
        for(int  i=0; i<n-1; i++){
            swapped = false;

            //inner loop for comparing adjacent elemnts
            for(int j=0; j<n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap elements if out of order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            //optimization :stop early if no swaps occured
            if(!swapped)
            break;
        }
    }
    public static void main(String[] args){
        int[] arr= {5,3,6,3,7};
        bubbleSort(arr);

        System.out.println("sorted array: ");
        for(int num : arr){
            System.out.println(num+ " ");
        }

    }
    
}
