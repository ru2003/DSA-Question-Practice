package Arrays;
//two pointer method
import java.util.Arrays;
public class _8MergeSortedArray {
 
  public static int[] mergingthearray(int[] arr1, int[] arr2) {
       int n = arr1.length;
       int m = arr2.length;
       int[] merged = new int[n+m]; //this creates a new array named merged that will store all the elements from both arr1 and arr2.

       int i=0, j=0, k=0; 
       //merge both arrays
       while(i<n && j<m) {
        if(arr1[i] < arr2[j]){
          merged[k++] = arr1[i++];
        } else {
          merged[k++] = arr2[j++];
        }
       }

      //copy remaining elements
      while(i<n) {
        merged[k++] = arr1[i++] ;
      }
      while(j<m) {
        merged[k++] =arr2[j++];
      }
      
      return merged;

  }
 
  public static void main(String[] args) {
    int[] array1 = {1,2,5,8};
    int[] array2 = {3,4,6,7};
    int[] merged = mergingthearray(array1, array2);
   
    System.out.println("The merges=d Sorted array is: " + Arrays.toString(merged));
  }

  
  }   

