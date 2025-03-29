

import java.util.Arrays;
public class mpveZerosToEnd{
public static void  moveZerosToEnd (int[] arr) {
  

int n = arr.length;
int j = -1; //pointer to track the position of first zero

//step 1: find the first zero in the array.
for (int i = 0 ; i < n ; i++){
    if(arr[i] == 0){
        j = i ;
        break;
    }

}
if(j == -1) return;

//step 2: traverse the array and swap non-zero elements with the zero at `j`
for (int i = j+1 ; i<n ; i++){
       if(arr[i] != 0){
        //then swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        //move j to the next 0 position 
        j++;
       }
}
}


public static void main(String[] args){
    int[] arr = {0,2,3,0,5,6,10};
    System.out.println("Orginal Array is :" + Arrays.toString(arr));
    moveZerosToEnd(arr);
    System.out.println("Array after moving zeros to the end:" + Arrays.toString(arr));

}


    
}
