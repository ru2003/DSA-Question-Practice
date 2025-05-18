package Arrays;
//Check if an array is sorted (ascending order).
public class _9isArraySorted {
    
    public static boolean isArraysorted(int[] arr) {
          for(int i=0; i<arr.length;i++){
            if(arr [i] > arr [i+1]){
                return false;
            }
          }
          return true;
    }
    public static void main(String[] args) {

    }
}
