package Arrays;
//Check if an array is sorted (ascending order).
public class _9isArraySorted {
    
    public static boolean isArraysorted(int[] arr) {
          for(int i=0; i<(arr.length-1);i++){
            if(arr [i] > arr [i+1]){
                return false;
            }
          }
          return true;
    }
    public static void main(String[] args) {
        int[] array = {2,3,4,5,7,10};
        if(isArraysorted(array)){
            System.out.println("The array is sorted.");
        }else{
            System.out.println("The array is not sorted");
        }

     
    }
}
