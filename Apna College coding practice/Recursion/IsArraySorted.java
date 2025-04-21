package Recursion;
//check of the given array is osrted or not.
public class IsArraySorted {
    public static boolean isSorted(int arr[] , int i) {
        //base case
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
        /*array enter hota hai then check krte hai first loop last tk jata nhi ,
        last tk jata nhi tab tk run krte rho then later
        originally true samjte hai ,  then false hua toh exit then later.
        agle wale ke liye check krte krte  jate hain.
        */
 
    }
    public static void main(String[] args) {
          int arr[] = {1,2,3,9,4};
        if(isSorted(arr, 0)){
            System.out.println("The array is sorted:");
        }else{
            System.out.println("The array is not sorted.");
        }
    }
    
}
