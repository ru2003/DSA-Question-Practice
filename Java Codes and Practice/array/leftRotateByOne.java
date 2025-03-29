import java.util.Arrays;


public class leftRotateByOne {

    //function to left rotate the array by one place
    public static void leftRotateByOne(int[] arr){

        int n =arr.length;

        //step1:store the first element in the temporary variable

        int temp = arr[0];

        //step2:shift all element one position to the left

        for(int i = 0 ; i < n-1 ; i ++){
            arr[i] = arr[i+1];
        }
        //step3:assigned the stored elemnt in the last position.

        arr[n-1] = temp;
    }






    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        System.out.println("Original aarray" + Arrays.toString(arr));
        leftRotateByOne(arr);
        System.out.println("Array after 1 left rotation" + Arrays.toString(arr));


    }
    
}
